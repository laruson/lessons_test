package com.gmail.kishkevich.superArh.presentation.screen.student.list

import android.databinding.ObservableBoolean
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.gmail.kishkevich.domain.entity.Student
import com.gmail.kishkevich.domain.entity.StudentSearch
import com.gmail.kishkevich.domain.usecases.GetStudentUseCase
import com.gmail.kishkevich.domain.usecases.SearchStudentUseCase
import com.gmail.kishkevich.superArh.app.App
import com.gmail.kishkevich.superArh.factory.UseCaseProvider
import com.gmail.kishkevich.superArh.presentation.base.BaseViewModel
import com.gmail.kishkevich.superArh.presentation.screen.student.StudentRouter
import com.gmail.kishkevich.superArh.presentation.screen.student.list.items.StudentItemAdapter
import com.gmail.kishkevich.superArh.presentation.utils.recycler.StudentListAdapter
import io.reactivex.Observable
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject

class StudentListViewModel : BaseViewModel<StudentRouter>() {
    val isProgressEnabled = ObservableBoolean(false)

    @Inject
    lateinit var studentListUseCase: GetStudentUseCase

    @Inject
    lateinit var studentSearchUseCase: SearchStudentUseCase

    var adapter = StudentItemAdapter()

    init {
//        App.appComponent.inject(this)
//        adapter = StudentListAdapter {
//            router?.goToStudentDetails(it.id)
//        }
        adapter.clickItemSubject.subscribeBy (
                onNext = {
                    router?.goToStudentDetails(it.item.id)
                },
                onError = {
                    router?.showError(it)
                }
        )

        isProgressEnabled.set(true)
        addToDisposable(studentListUseCase.get().subscribeBy(
                onNext = {
                    adapter.addItems(it)
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
                    adapter.addItems(it)
                },
                onError = {
                    router?.showError(it)
                }
        ))
    }
}