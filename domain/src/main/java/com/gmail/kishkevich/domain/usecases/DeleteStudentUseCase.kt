package com.gmail.kishkevich.domain.usecases

import com.gmail.kishkevich.domain.repository.StudentRepository

class DeleteStudentUseCase(private val studentRepository: StudentRepository) : BaseUseCase() {
    fun delete(studentId: String) = studentRepository.delete(studentId)
}