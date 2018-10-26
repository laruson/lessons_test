package com.gmail.kishkevich.superArh.presentation.screen.student.details

import android.databinding.ObservableBoolean
import com.gmail.kishkevich.superArh.presentation.base.BaseViewModel
import com.gmail.kishkevich.superArh.presentation.screen.student.StudentRouter

class StudentDetailsViewModel : BaseViewModel<StudentRouter>() {
    val isProgressEnabled = ObservableBoolean(false)

    private var studentId: String? = null

    fun setStudentId(id: String) {
        if(studentId!=null) return
        studentId = id


        //FIXME достать студента по id
    }

}
