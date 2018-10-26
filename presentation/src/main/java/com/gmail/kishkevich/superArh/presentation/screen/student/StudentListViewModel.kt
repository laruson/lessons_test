package com.gmail.kishkevich.superArh.presentation.screen.student

import android.databinding.ObservableField
import android.util.Log
import com.gmail.kishkevich.superArh.factory.UseCaseProvider
import com.gmail.kishkevich.superArh.presentation.base.BaseViewModel
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.subjects.ReplaySubject

class StudentListViewModel() : BaseViewModel<StudentRouter>() {

    private val getStudentUseCase = UseCaseProvider.provideGetStudentUseCase()
    private val searchStudentUseCase = UseCaseProvider.provideSearchStudentUseCase()

    val studentSize = ObservableField<String>("no data")

    private val publishSubject: ReplaySubject<String> = ReplaySubject.create()

    init {
        Log.e("AAA", "init")
        addToDisposable(getStudentUseCase.get()
                .subscribeBy(
                        onNext = {
                            studentSize.set("Student list.size() = ${it.size}")
                        },
                        onError = {
                            studentSize.set("Student list.size() = $it")
                        }))
    }

    fun onTextClick(){

    }
}


//        disposable = Observable
//                .just("125", "225", "325")
//                .map {
//                    Integer.valueOf(it)
//                }
//                .filter {
//                    it > 200
//                }
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .delay(2, TimeUnit.SECONDS)
//                .subscribeBy({
//                    Log.e("AA", it.toString())
//                }, {
//                    Log.e("AA", "onCompl")
//
//                }, onNext={
//                    Log.e("AA", it.toString())
//
//                })


//        publishSubject.onNext("1")
//        publishSubject.onNext("2")
//        publishSubject.onNext("3")
//
//        disposable = publishSubject.subscribeBy {
//            Log.e("AAA", "publishSubject $it")
//
//        }
//        publishSubject.onNext("4")
//        publishSubject.onNext("5")
//        publishSubject.onNext("6")