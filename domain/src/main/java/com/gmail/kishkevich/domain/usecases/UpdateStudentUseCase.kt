package com.gmail.kishkevich.domain.usecases

import com.gmail.kishkevich.domain.entity.Student
import com.gmail.kishkevich.domain.repository.StudentRepository

class UpdateStudentUseCase(private val studentRepository: StudentRepository) : BaseUseCase() {
    fun update(student: Student) = studentRepository.update(student)
}