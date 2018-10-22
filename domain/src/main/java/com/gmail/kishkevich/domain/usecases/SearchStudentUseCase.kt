package com.gmail.kishkevich.domain.usecases

import com.gmail.kishkevich.domain.entity.Student
import com.gmail.kishkevich.domain.entity.StudentSearch
import com.gmail.kishkevich.domain.repository.StudentRepository
import io.reactivex.Observable

class SearchStudentUseCase(private val studentRepository: StudentRepository) : BaseUseCase() {

    fun search(searchStudent: StudentSearch): Observable<List<Student>> {
        return studentRepository.search(searchStudent)
    }
}