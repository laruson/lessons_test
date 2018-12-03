package com.gmail.kishkevich.superArh.app

import android.app.Activity
import android.app.Application
import com.gmail.kishkevich.superArh.di.AppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class App : Application(), HasActivityInjector {

    @Inject
    lateinit var activityInjector:DispatchingAndroidInjector<Activity>

    companion object {
        lateinit var instance: App
        @JvmStatic lateinit var appComponent: AppComponent
    }

    init {
        instance = this
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return activityInjector
    }

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppCompanent.builder()
                .application(this)
                .build()
        appComponent.inject(this)
    }
}