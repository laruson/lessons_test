package com.gmail.kishkevich.data.db.entity

import com.gmail.kishkevich.data.entity.StudentResponse
import com.gmail.kishkevich.domain.entity.Student

fun StudentDB.transformToDomain(): Student {
    return Student(id = id, name = name, age = age)
}