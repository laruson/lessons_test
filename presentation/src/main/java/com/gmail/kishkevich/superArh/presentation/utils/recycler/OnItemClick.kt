package com.gmail.kishkevich.superArh.presentation.utils.recycler

import com.gmail.kishkevich.domain.entity.Student

interface OnItemClick {
    fun onClick(student: Student)
}