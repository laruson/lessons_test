package com.gmail.kishkevich.superArh.presentation.base

import android.arch.lifecycle.ViewModel

abstract class BaseViewModel<R : BaseRouter<*>> : ViewModel() {
    protected var router: R? = null

    public fun addRouter(router : R?) {
        this.router = router
    }

    public fun removeRouter() {
        router = null
    }

}