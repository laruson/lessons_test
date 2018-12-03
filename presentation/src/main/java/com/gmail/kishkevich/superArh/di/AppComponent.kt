package com.gmail.kishkevich.superArh.di

import com.gmail.kishkevich.superArh.app.App
import com.gmail.kishkevich.superArh.presentation.screen.student.StudentViewModel
import com.gmail.kishkevich.superArh.presentation.screen.student.list.StudentListViewModel
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule

@Component(modules = [AndroidSupportInjectionModule::class,
    AppModule::class,
    PresentationModule::class,
    RepositoryModule::class,
    DataModule::class
])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: App)

        fun build(): AppComponent
    }

//    fun inject(studentListViewModel: StudentListViewModel)

    fun inject(app: App)


}