package com.gmail.kishkevich.domain.repository

import com.gmail.kishkevich.domain.entity.Student
import com.gmail.kishkevich.domain.entity.StudentSearch

interface StudentRepository : BaseRepository {
    fun get(): List<Student>

    fun search(search: StudentSearch): List<Student>

    fun update(student: Student): Boolean

    fun delete(studentId: String): Boolean
}