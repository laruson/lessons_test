package com.gmail.kishkevich.superArh.di

import android.content.Context
import com.gmail.kishkevich.data.db.AppDataBase
import com.gmail.kishkevich.data.db.dao.StudentDao
import com.gmail.kishkevich.data.net.RestService
import com.gmail.kishkevich.superArh.app.App
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class DataModule {

    @Provides
    @Singleton
    fun provideAppDataBase(context: Context): AppDataBase {
        return AppDataBase.getInstance(context)
    }

    @Provides
    @Singleton
    fun provideStudentDao(appDataBase: AppDataBase): StudentDao {
        return appDataBase.getStudentDao()
    }

    @Provides
    @Singleton
    fun provideRestService(@Named(URL_NAME_INJECT_One) serviceUrl:String): RestService {
        return RestService(serviceUrl)
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