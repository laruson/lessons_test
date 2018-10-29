package com.gmail.kishkevich.superArh.presentation.screen.student

import android.util.Log
import android.view.View
import com.gmail.kishkevich.presentation.R
import com.gmail.kishkevich.superArh.presentation.base.BaseRouter
import com.gmail.kishkevich.superArh.presentation.screen.student.details.StudentDetailsFragment
import com.gmail.kishkevich.superArh.presentation.screen.student.list.StudentListFragment

class StudentRouter(activity: StudentActivity)
    : BaseRouter<StudentActivity>(activity) {

    fun goToStudentList() {
        replaceFragment(activity.supportFragmentManager,
                StudentListFragment.getInstance(),
                R.id.container, false)
    }

    fun goToStudentDetails(id: String) {

        val view = activity.findViewById<View>(R.id.containerDetails)

        if (view == null) {
            replaceFragment(activity.supportFragmentManager,
                    StudentDetailsFragment.getInstance(id),
                    R.id.container, true)
        } else {
            replaceFragment(activity.supportFragmentManager,
                    StudentDetailsFragment.getInstance(id),
                    R.id.containerDetails, false)
        }

    }

}