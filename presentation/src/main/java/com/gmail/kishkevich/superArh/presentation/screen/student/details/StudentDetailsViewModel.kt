package com.gmail.kishkevich.superArh.presentation.screen.student.details

import android.databinding.ObservableBoolean
import android.databinding.ObservableField
import android.databinding.ObservableInt
import android.util.Log
import com.gmail.kishkevich.superArh.factory.UseCaseProvider
import com.gmail.kishkevich.superArh.presentation.base.BaseViewModel
import com.gmail.kishkevich.superArh.presentation.screen.student.StudentRouter
import io.reactivex.rxkotlin.subscribeBy

class StudentDetailsViewModel : BaseViewModel<StudentRouter>() {
    val isProgressEnabled = ObservableBoolean(false)

    private var studentByIdUseCase = UseCaseProvider.provideStudentByIdUseCase()

    var imageStudent = ObservableField<String>()
    var idStudent = ObservableField<String>()
    var nameStudent = ObservableField<String>()
    var ageStudent = ObservableInt()


    fun setStudentId(id: String) {
        addToDisposable(studentByIdUseCase
                .getStudentById(id)
                .subscribeBy {
                    idStudent.set(it.id)
                    nameStudent.set(it.name)
                    ageStudent.set(it.age)
                    imageStudent.set("https://www.nationalgeographic.com/content/dam/animals/thumbs/rights-exempt/mammals/d/domestic-dog_thumb.ngsversion.1484159404151.adapt.1900.1.jpg")
                })
    }

}
