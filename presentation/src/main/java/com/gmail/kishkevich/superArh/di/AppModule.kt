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
class AppModule(private val context: Context) {

    @Provides
    @Singleton
    fun provideContext(): Context {
        return context;
    }

    @Provides
    @Singleton
    fun provideStudentRep(studentDao: StudentDao, restService: RestService): StudentRepository {
        return StudentRepositoryImpl(restService, studentDao)
    }

    @Provides
    @Singleton
    fun provideStudentDao(appDataBase: AppDataBase): StudentDao {
        return appDataBase.getStudentDao()
    }

    @Provides
    @Singleton
    fun provideAppDataBase(): AppDataBase {
        return AppDataBase.getInstance(context)
    }

    @Provides
    @Singleton
    fun provideRestService(@Named(URL_NAME_INJECT_One) serviceUrl:String): RestService {
        return RestService(serviceUrl)
    }

    @Provides
    @Singleton
    fun providePostExecutorThread(): PostExecutorThread {
        return UIThread()
    }

    @Provides
    @Named(URL_NAME_INJECT_One)
    @Singleton
    fun provideServerOne(): String = "http://"

    @Provides
    @Named(URL_NAME_INJECT_Two)
    @Singleton
    fun provideServerTwo(): String = "http://"

}