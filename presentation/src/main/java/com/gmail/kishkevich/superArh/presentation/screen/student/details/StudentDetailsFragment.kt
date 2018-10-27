package com.gmail.kishkevich.superArh.presentation.screen.student.details

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import android.view.View
import com.gmail.kishkevich.presentation.R
import com.gmail.kishkevich.presentation.databinding.FragmentStudentDetailsBinding
import com.gmail.kishkevich.superArh.presentation.base.BaseMvvmFragment
import com.gmail.kishkevich.superArh.presentation.screen.student.StudentRouter

class StudentDetailsFragment : BaseMvvmFragment<
        StudentDetailsViewModel,
        StudentRouter,
        FragmentStudentDetailsBinding>() {

    companion object {
        private const val ID_EXTRA = "ID_EXTRA"

        fun getInstance(id: String): StudentDetailsFragment {
            val fragment = StudentDetailsFragment()
            val bundle = Bundle()
            bundle.putString(ID_EXTRA, id)
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun provideViewModel(): StudentDetailsViewModel {
        return ViewModelProviders.of(this)
                .get(StudentDetailsViewModel::class.java)
    }

    override fun provideLayoutId(): Int = R.layout.fragment_student_details

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val id = arguments?.get(ID_EXTRA) as String
        if (id != null) {
            viewModel.setStudentId(id)
        } else{
            router?.goBack()
        }
    }

}