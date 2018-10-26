package com.gmail.kishkevich.superArh.presentation.screen.student.list

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.View
import com.gmail.kishkevich.presentation.R
import com.gmail.kishkevich.presentation.databinding.FragmentStudentListBinding
import com.gmail.kishkevich.superArh.presentation.base.BaseMvvmFragment
import com.gmail.kishkevich.superArh.presentation.screen.student.StudentRouter

class StudentListFragment : BaseMvvmFragment<
        StudentListViewModel,
        StudentRouter,
        FragmentStudentListBinding>() {

    companion object {
        fun getInstance() : StudentListFragment{
            return StudentListFragment()
        }
    }

    override fun provideViewModel(): StudentListViewModel {
        return ViewModelProviders.of(this)
                .get(StudentListViewModel::class.java)
    }

    override fun provideLayoutId(): Int = R.layout.fragment_student_list

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        binding.recycler.adapter =
//        binding.recycler.layoutManager = LinerLayoutManager(context)
        binding.recycler.setHasFixedSize(true)

    }

}