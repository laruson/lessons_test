package com.gmail.kishkevich.superArh.presentation.screen.student

import android.databinding.ObservableField
import android.databinding.ObservableInt
import android.util.Log
import com.gmail.kishkevich.superArh.factory.UseCaseProvider
import com.gmail.kishkevich.superArh.presentation.base.BaseViewModel

class StudentListViewModel() : BaseViewModel<StudentRouter>() {

    private val getStudentUseCase = UseCaseProvider.provideGetStudentUseCase()
    private val searchStudentUseCase = UseCaseProvider.provideSearchStudentUseCase()

    val studentSize = ObservableField<String>("no data")

    init {
        Log.e("AAA", "init")
        val listStudent = getStudentUseCase.get()
        studentSize.set("Student list.size() = ${listStudent.size}")
    }

    override fun onCleared() {
        Log.e("AAA", "SSS")
    }
}