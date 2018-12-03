package com.gmail.kishkevich.superArh.presentation.screen.student.list.items

import android.databinding.DataBindingUtil
import com.gmail.kishkevich.domain.entity.Student
import com.gmail.kishkevich.presentation.databinding.ItemStudentBinding
import com.gmail.kishkevich.superArh.presentation.base.recycler.BaseViewHolder

class StudentItemViewHolder : BaseViewHolder
<Student,
        StudentItemViewModel,
        ItemStudentBinding>() {
}