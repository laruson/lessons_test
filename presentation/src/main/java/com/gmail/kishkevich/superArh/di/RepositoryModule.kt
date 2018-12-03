package com.gmail.kishkevich.superArh.di

import com.gmail.kishkevich.data.repository.StudentRepositoryImpl
import com.gmail.kishkevich.domain.repository.StudentRepository
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryModule {

    @Binds
    abstract fun provideStudentRep(rep: StudentRepositoryImpl)
            : StudentRepository
}