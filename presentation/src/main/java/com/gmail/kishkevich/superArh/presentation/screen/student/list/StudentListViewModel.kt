package com.gmail.kishkevich.superArh.presentation.screen.student.list

import android.databinding.ObservableBoolean
import android.support.v7.widget.RecyclerView
import com.gmail.kishkevich.domain.entity.StudentSearch
import com.gmail.kishkevich.superArh.factory.UseCaseProvider
import com.gmail.kishkevich.superArh.presentation.base.BaseViewModel
import com.gmail.kishkevich.superArh.presentation.screen.student.StudentRouter
import io.reactivex.rxkotlin.subscribeBy

class StudentListViewModel : BaseViewModel<StudentRouter>() {
    //FIXME добавить адаптер
    val adapter: RecyclerView.Adapter<*>? = null

    val isProgressEnabled = ObservableBoolean(false)

    private val studentListUseCase = UseCaseProvider.provideStudentListUseCase()

    private val studentSearchUseCase = UseCaseProvider.provideSearchStudentUseCase()

    init {
        //FIXME при клике вызвать router.goToStudentDetails
//        adapter.setListener

        isProgressEnabled.set(true)
        addToDisposable(studentListUseCase.get().subscribeBy(
                onNext = {
                    //FIXME данные в адаптер
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
                    //FIXME данные в адаптер
                },
                onError = {
                    router?.showError(it)
                }
        ))
    }
}