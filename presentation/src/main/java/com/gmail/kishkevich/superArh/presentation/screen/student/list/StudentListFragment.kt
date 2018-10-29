package com.gmail.kishkevich.superArh.presentation.screen.student.list

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import com.gmail.kishkevich.presentation.R
import com.gmail.kishkevich.presentation.databinding.FragmentStudentListBinding
import com.gmail.kishkevich.superArh.presentation.base.BaseMvvmFragment
import com.gmail.kishkevich.superArh.presentation.screen.student.StudentRouter
import com.jakewharton.rxbinding2.view.RxView
import com.jakewharton.rxbinding2.widget.RxTextView
import io.reactivex.rxkotlin.subscribeBy
import java.util.concurrent.TimeUnit

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

        binding.recycler.adapter = viewModel.adapter
        binding.recycler.layoutManager = LinearLayoutManager(view.context)
        binding.recycler.setHasFixedSize(true)

        RxTextView.textChanges(binding.searchEditText)
                .throttleFirst(500, TimeUnit.MILLISECONDS)
                .subscribeBy{
                    viewModel.search(it.toString())
        }



//        binding.searchEditText.addTextChangedListener(object : TextWatcher{
//            override fun afterTextChanged(p0: Editable?) {
//                viewModel.search(p0.toString())
//            }
//
//            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//            }
//
//            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//            }
//        })
    }

}