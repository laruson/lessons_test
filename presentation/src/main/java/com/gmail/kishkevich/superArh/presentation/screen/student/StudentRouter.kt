package com.gmail.kishkevich.superArh.presentation.screen.student

import com.gmail.kishkevich.presentation.R
import com.gmail.kishkevich.superArh.presentation.base.BaseRouter
import com.gmail.kishkevich.superArh.presentation.screen.student.list.StudentListFragment

class StudentRouter(activity: StudentActivity)
    : BaseRouter<StudentActivity>(activity) {

    fun goToStudentList() {
        replaceFragment(activity.supportFragmentManager,
                StudentListFragment.getInstance(),
                R.id.container, false)
    }

    fun goToStudentDetails() {
//        replaceFragment(R.id.container, )
    }

}