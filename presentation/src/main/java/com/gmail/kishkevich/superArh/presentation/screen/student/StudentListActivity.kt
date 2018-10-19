package com.gmail.kishkevich.superArh.presentation.screen.student

import android.arch.lifecycle.ViewModelProviders
import com.gmail.kishkevich.presentation.R
import com.gmail.kishkevich.presentation.databinding.ActivityStudentListBinding

import com.gmail.kishkevich.superArh.presentation.base.BaseMvvmActivity

class StudentListActivity : BaseMvvmActivity<StudentListViewModel, ActivityStudentListBinding>() {
    override fun provideViewModel(): StudentListViewModel {
        return ViewModelProviders.of(this)
                .get(StudentListViewModel::class.java)
    }

    override fun provideLayoutId(): Int = R.layout.activity_student_list

    //пример
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        viewModel.testText.addOnPropertyChangedCallback(object : Observable.OnPropertyChangedCallback() {
//            override fun onPropertyChanged(sender: Observable?, propertyId: Int) {
//
//            }
//
//        })
//    }
}
