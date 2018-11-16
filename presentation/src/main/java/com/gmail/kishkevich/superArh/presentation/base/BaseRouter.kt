package com.gmail.kishkevich.superArh.presentation.base

import android.app.Activity
import android.support.v4.app.FragmentManager
import android.util.Log
import android.widget.Toast
import com.gmail.kishkevich.domain.entity.AppErrorType
import com.gmail.kishkevich.domain.entity.AppException
import com.gmail.kishkevich.superArh.presentation.screen.student.list.StudentListFragment

abstract class BaseRouter<A : Activity>(val activity: A) {
    fun goBack() {
        activity.onBackPressed()
    }

    fun showError(e: Throwable) {
        if (e is AppException) {
            val message = when (e.errorType) {
                AppErrorType.INTERNET_IS_NOT_AVAILABLE -> {
                    "INTERNET_IS_NOT_AVAILABLE"
                }
                AppErrorType.SERVER_IS_NOT_AVAILABLE -> {
                    "SERVER_IS_NOT_AVAILABLE"
                }
                else -> {
                    "UNKNOWN"
                }
            }
            Toast.makeText(activity,
                    message,
                    Toast.LENGTH_LONG).show()
        }
    }


    fun replaceFragment(fragmentManager: FragmentManager,
                        fragment: BaseFragment,
                        containerResId: Int,
                        addToBackStack: Boolean = false) {
        var fragmentTransient = fragmentManager.beginTransaction()

        fragmentTransient.hide(StudentListFragment.getInstance()).replace(containerResId, fragment, fragment::class.java.canonicalName)

        if (addToBackStack) {
            fragmentTransient.addToBackStack(null)
        }

        fragmentTransient.commit()
    }
}