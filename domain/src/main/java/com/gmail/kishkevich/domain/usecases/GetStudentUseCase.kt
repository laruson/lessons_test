package com.gmail.kishkevich.domain.usecases

import com.gmail.kishkevich.domain.entity.Student
import com.gmail.kishkevich.domain.repository.StudentRepository
import io.reactivex.Observable

class GetStudentUseCase(private val studentRepository: StudentRepository) : BaseUseCase() {
    fun get(): Observable<List<Student>> {
        return studentRepository.get()
    }

}