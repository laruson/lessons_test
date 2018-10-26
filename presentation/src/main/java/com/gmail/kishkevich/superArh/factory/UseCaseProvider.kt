package com.gmail.kishkevich.superArh.factory

import com.gmail.kishkevich.data.repository.StudentRepositoryImpl
import com.gmail.kishkevich.domain.usecases.GetStudentUseCase
import com.gmail.kishkevich.domain.usecases.SearchStudentUseCase

object UseCaseProvider {
    fun provideStudentListUseCase(): GetStudentUseCase{
        return GetStudentUseCase(StudentRepositoryImpl())
    }

    fun provideSearchStudentUseCase(): SearchStudentUseCase{
        return SearchStudentUseCase(StudentRepositoryImpl())

    }
}