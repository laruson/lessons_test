package com.gmail.kishkevich.domain.usecases

import com.gmail.kishkevich.domain.repository.StudentRepository
import io.reactivex.Completable

class DeleteStudentUseCase(private val studentRepository: StudentRepository) : BaseUseCase() {
    fun delete(studentId: String) : Completable{
        return studentRepository.delete(studentId)
    }
}