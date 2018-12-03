package com.gmail.kishkevich.superArh.presentation.screen.student.list.items

import android.databinding.ObservableField
import com.gmail.kishkevich.domain.entity.Student
import com.gmail.kishkevich.superArh.presentation.base.recycler.BaseItemViewModel

class StudentItemViewModel: BaseItemViewModel<Student>() {

    val name= ObservableField<String>("")
    val age = ObservableField<String>("")

    override fun bindItem(entity: Student, position: Int) {
        name.set(entity.name)
        age.set(entity.age.toString())
    }
}