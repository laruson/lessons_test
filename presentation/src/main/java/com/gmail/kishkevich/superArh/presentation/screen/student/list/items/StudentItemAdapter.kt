package com.gmail.kishkevich.superArh.presentation.screen.student.list.items

import android.view.ViewGroup
import com.gmail.kishkevich.domain.entity.Student
import com.gmail.kishkevich.superArh.presentation.base.recycler.BaseRecyclerAdapter

class StudentItemAdapter : BaseRecyclerAdapter<
        Student,
        StudentItemViewModel>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int)
            : StudentItemViewHolder {

        return StudentItemViewHolder.create(viewGroup, StudentItemViewModel())
    }
}