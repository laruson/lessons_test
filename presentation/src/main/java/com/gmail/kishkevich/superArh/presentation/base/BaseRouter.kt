package com.gmail.kishkevich.superArh.presentation.base

import android.app.Activity
import android.support.v4.app.FragmentManager
import android.widget.Toast

abstract class BaseRouter<A : Activity>(val activity: A) {
    fun goBack() {
        activity.onBackPressed()
    }

    fun showError(e: Throwable) {
        Toast.makeText(activity,
                "Error $e",
                Toast.LENGTH_LONG).show()
    }

    fun replaceFragment(fragmentManager: FragmentManager,
                        fragment: BaseFragment,
                        containerResId: Int,
                        addToBackStack: Boolean = false) {
        var fragmentTransient = fragmentManager.beginTransaction()

        fragmentTransient.replace(containerResId, fragment, fragment::class.java.canonicalName)

        if (addToBackStack) {
            fragmentTransient.addToBackStack(null)
        }
        fragmentTransient.commit()
    }
}