package com.gmail.kishkevich.domain.usecases

import com.gmail.kishkevich.domain.entity.Student
import com.gmail.kishkevich.domain.repository.StudentRepository
import io.reactivex.Completable

class UpdateStudentUseCase(private val studentRepository: StudentRepository) : BaseUseCase() {
    fun update(student: Student) :Completable {
        return studentRepository.update(student)
    }
}