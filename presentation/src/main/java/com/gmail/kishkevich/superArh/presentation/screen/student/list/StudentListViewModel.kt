package com.gmail.kishkevich.superArh.presentation.screen.student.list

import android.databinding.ObservableBoolean
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.gmail.kishkevich.domain.entity.Student
import com.gmail.kishkevich.domain.entity.StudentSearch
import com.gmail.kishkevich.superArh.factory.UseCaseProvider
import com.gmail.kishkevich.superArh.presentation.base.BaseViewModel
import com.gmail.kishkevich.superArh.presentation.screen.student.StudentRouter
import com.gmail.kishkevich.superArh.presentation.utils.recycler.StudentListAdapter
import io.reactivex.Observable
import io.reactivex.rxkotlin.subscribeBy

class StudentListViewModel : BaseViewModel<StudentRouter>() {
    val isProgressEnabled = ObservableBoolean(false)

    private val studentListUseCase = UseCaseProvider.provideStudentListUseCase()

    private val studentSearchUseCase = UseCaseProvider.provideSearchStudentUseCase()

    lateinit var adapter : StudentListAdapter

    init {
        studentListUseCase.get().subscribeBy{ it ->
            adapter = StudentListAdapter {
                router?.goToStudentDetails(it.id)
            }

        }

        isProgressEnabled.set(true)
        addToDisposable(studentListUseCase.get().subscribeBy(
                onNext = {
                    adapter.setStudents(it)
                    isProgressEnabled.set(false)
                },
                onError = {
                    isProgressEnabled.set(false)
                    router?.showError(it)
                }
        ))
    }


    fun search(search: String) {
        val studentSearch = StudentSearch(search)

        if (isProgressEnabled.get()) return

        addToDisposable(studentSearchUseCase.search(studentSearch).subscribeBy(
                onNext = {
                    adapter.setStudents(it)
                },
                onError = {
                    router?.showError(it)
                }
        ))
    }
}