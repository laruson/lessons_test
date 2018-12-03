package com.gmail.kishkevich.superArh.presentation.screen.student.list.items

import android.view.LayoutInflater
import android.view.ViewGroup
import com.gmail.kishkevich.domain.entity.Student
import com.gmail.kishkevich.presentation.databinding.ItemStudentBinding
import com.gmail.kishkevich.superArh.presentation.base.recycler.BaseViewHolder

class StudentItemViewHolder(binding: ItemStudentBinding,
                            viewModel: StudentItemViewModel)
    : BaseViewHolder<
        Student,
        StudentItemViewModel,
        ItemStudentBinding>(binding, viewModel) {

    companion object {

        fun create(parent: ViewGroup,
                   viewModel: StudentItemViewModel): StudentItemViewHolder {

            val binding = ItemStudentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return StudentItemViewHolder(binding, viewModel)
        }

    }
}