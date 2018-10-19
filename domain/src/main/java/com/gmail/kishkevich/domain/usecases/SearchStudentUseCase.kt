package com.gmail.kishkevich.domain.usecases

import com.gmail.kishkevich.domain.repository.StudentRepository
import com.gmail.kishkevich.domain.entity.StudentSearch

class SearchStudentUseCase(private val studentRepository: StudentRepository) : BaseUseCase() {
    fun search(searchStudent: StudentSearch) = studentRepository.search(searchStudent)
}