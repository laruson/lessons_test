package com.gmail.kishkevich.superArh.di

import com.gmail.kishkevich.superArh.presentation.screen.student.StudentActivity
import com.gmail.kishkevich.superArh.presentation.screen.student.StudentModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class PresentationModule {

    @ContributesAndroidInjector(modules = [StudentModule::class])
    abstract fun studentModule():StudentActivity
}