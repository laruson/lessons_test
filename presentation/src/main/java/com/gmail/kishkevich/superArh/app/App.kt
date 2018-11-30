package com.gmail.kishkevich.superArh.app

import android.app.Application
import com.gmail.kishkevich.superArh.di.AppComponent
import com.gmail.kishkevich.superArh.di.AppModule

class App : Application() {

    companion object {
        lateinit var instance: App
        @JvmStatic lateinit var appComponent: AppComponent
    }

    init {
        instance = this
    }

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppCompanent.builder()
                .appModule(AppModule(this))
                .build()
    }
}