package com.gmail.kishkevich.domain.usecases

import com.gmail.kishkevich.domain.entity.Student
import com.gmail.kishkevich.domain.repository.StudentRepository

class GetStudentUseCase(private val studentRepository: StudentRepository) : BaseUseCase() {
    fun get(): List<Student> = studentRepository.get()

}