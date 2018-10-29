package com.gmail.kishkevich.data.entity

import com.gmail.kishkevich.domain.entity.Student

fun StudentResponse.transformToDomain(): Student {
    return Student(id = id, name = name, age = age)
}