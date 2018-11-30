package com.gmail.kishkevich.superArh.di

import com.gmail.kishkevich.superArh.presentation.screen.student.StudentViewModel
import com.gmail.kishkevich.superArh.presentation.screen.student.list.StudentListViewModel
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(studentListViewModel: StudentListViewModel)

}