package com.gmail.kishkevich.superArh.presentation.screen.student

import com.gmail.kishkevich.superArh.presentation.screen.student.details.StudentDetailsFragment
import com.gmail.kishkevich.superArh.presentation.screen.student.details.StudentDetailsModule
import com.gmail.kishkevich.superArh.presentation.screen.student.list.StudentListFragment
import com.gmail.kishkevich.superArh.presentation.screen.student.list.StudentListModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class StudentModule{

//    @Module
//    companion object {
//        /**
//         * провайдеры как обычно
//         */
//    }

    @ContributesAndroidInjector(modules = [StudentListModule::class])
    abstract fun studentListModule():StudentListFragment

    @ContributesAndroidInjector(modules = [StudentDetailsModule::class])
    abstract fun studentDetailsModule():StudentDetailsFragment
}