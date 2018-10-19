package com.gmail.kishkevich.data.repository

import com.gmail.kishkevich.domain.entity.Student
import com.gmail.kishkevich.domain.entity.StudentSearch
import com.gmail.kishkevich.domain.repository.StudentRepository

class StudentRepositoryImpl : StudentRepository{
    override fun get(): List<Student> {
        return  listOf(Student("1", "lol",24),
                Student("2","kek",25),
                Student("3","lollol",26),
                Student("4","kekkek",27),
                Student("5","keklol",28))
    }

    override fun search(search: StudentSearch): List<Student> {
        return  listOf(Student("1", "lol",24),
                Student("2","kek",25),
                Student("3","lollol",26))
    }

    override fun update(student: Student): Boolean {
        return true
    }

    override fun delete(studentId: String): Boolean {
        return true
    }
}