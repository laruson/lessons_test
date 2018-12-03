package com.gmail.kishkevich.superArh.presentation.screen.student

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import com.gmail.kishkevich.presentation.R
import com.gmail.kishkevich.presentation.databinding.ActivityStudentBinding

import com.gmail.kishkevich.superArh.presentation.base.BaseMvvmActivity

class StudentActivity : BaseMvvmActivity<
        StudentViewModel
        ,StudentRouter
        , ActivityStudentBinding>() {

    override fun provideRouter(): StudentRouter {
        return StudentRouter(this)
    }

    override fun provideViewModel(): StudentViewModel {
        return ViewModelProviders.of(this)
                .get(StudentViewModel::class.java)
    }

    override fun provideLayoutId(): Int = R.layout.activity_student

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(savedInstanceState==null){
            router.goToStudentList()
        }
    }
}
