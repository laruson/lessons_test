package com.gmail.kishkevich.domain.usecases

import com.gmail.kishkevich.domain.entity.Student
import com.gmail.kishkevich.domain.repository.StudentRepository
import io.reactivex.Observable

class GetStudentByIdUseCase(private val studentRepository: StudentRepository) : BaseUseCase() {
    fun getStudentById(id: String): Observable<Student> {
        return studentRepository.getStudentById(id)
    }
}