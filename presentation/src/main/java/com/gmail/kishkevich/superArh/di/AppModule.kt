package com.gmail.kishkevich.superArh.di

import android.content.Context
import com.gmail.kishkevich.data.db.AppDataBase
import com.gmail.kishkevich.data.db.dao.StudentDao
import com.gmail.kishkevich.data.net.RestService
import com.gmail.kishkevich.data.repository.StudentRepositoryImpl
import com.gmail.kishkevich.domain.executer.PostExecutorThread
import com.gmail.kishkevich.domain.repository.StudentRepository
import com.gmail.kishkevich.superArh.app.App
import com.gmail.kishkevich.superArh.executer.UIThread
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class AppModule() {

    @Provides
    @Singleton
    fun provideContext(app:App): Context {
        return app.applicationContext;
    }

    @Provides
    @Singleton
    fun providePostExecutorThread(): PostExecutorThread {
        return UIThread()
    }


}