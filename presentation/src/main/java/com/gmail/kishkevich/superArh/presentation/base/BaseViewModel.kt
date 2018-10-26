package com.gmail.kishkevich.superArh.presentation.base

import android.arch.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class BaseViewModel<R : BaseRouter<*>> : ViewModel() {
    protected var router: R? = null

    protected val compositeDisposable: CompositeDisposable by lazy {
        CompositeDisposable()
    }

    fun addRouter(router: R?) {
        this.router = router
    }

    fun removeRouter() {
        router = null
    }

    protected fun addToDisposable(disposable: Disposable){
        compositeDisposable.add(disposable)
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }

}