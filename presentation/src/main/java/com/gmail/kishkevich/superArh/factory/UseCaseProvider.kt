package com.gmail.kishkevich.superArh.factory

import com.gmail.kishkevich.data.net.RestService
import com.gmail.kishkevich.data.repository.StudentRepositoryImpl
import com.gmail.kishkevich.domain.usecases.GetStudentByIdUseCase
import com.gmail.kishkevich.domain.usecases.GetStudentUseCase
import com.gmail.kishkevich.domain.usecases.SearchStudentUseCase
import com.gmail.kishkevich.superArh.executer.UIThread

object UseCaseProvider {
    fun provideStudentListUseCase(): GetStudentUseCase{
        return GetStudentUseCase(UIThread(),StudentRepositoryImpl(RestService("kek")))
    }

    fun provideSearchStudentUseCase(): SearchStudentUseCase{
        return SearchStudentUseCase(UIThread(),StudentRepositoryImpl(RestService("kek")))

    }

    fun provideStudentByIdUseCase(): GetStudentByIdUseCase{
        return GetStudentByIdUseCase(UIThread(),StudentRepositoryImpl(RestService("kek")))
    }
}