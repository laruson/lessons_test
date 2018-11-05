package com.gmail.kishkevich.superArh.factory

import android.support.annotation.UiThread
import com.gmail.kishkevich.data.db.AppDataBase
import com.gmail.kishkevich.data.net.RestService
import com.gmail.kishkevich.data.repository.StudentRepositoryImpl
import com.gmail.kishkevich.domain.usecases.GetStudentByIdUseCase
import com.gmail.kishkevich.domain.usecases.GetStudentUseCase
import com.gmail.kishkevich.domain.usecases.SearchStudentUseCase
import com.gmail.kishkevich.superArh.app.App
import com.gmail.kishkevich.superArh.executer.UIThread

object UseCaseProvider {

    private val uiThread = UIThread()
    private val restService = RestService("kek")
    private val appData = AppDataBase.getInstance(App.instance.applicationContext).getStudentDao()

    fun provideStudentListUseCase(): GetStudentUseCase {
        return GetStudentUseCase(uiThread, StudentRepositoryImpl(restService, appData))
    }

    fun provideSearchStudentUseCase(): SearchStudentUseCase {
        return SearchStudentUseCase(uiThread, StudentRepositoryImpl(restService, appData))

    }

    fun provideStudentByIdUseCase(): GetStudentByIdUseCase {
        return GetStudentByIdUseCase(uiThread, StudentRepositoryImpl(restService, appData))
    }
}