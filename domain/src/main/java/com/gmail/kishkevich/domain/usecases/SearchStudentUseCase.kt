package com.gmail.kishkevich.domain.usecases

import com.gmail.kishkevich.domain.entity.Student
import com.gmail.kishkevich.domain.entity.StudentSearch
import com.gmail.kishkevich.domain.executer.PostExecutorThread
import com.gmail.kishkevich.domain.repository.StudentRepository
import io.reactivex.Observable
import javax.inject.Inject

class SearchStudentUseCase @Inject constructor(
        postExecutorThread: PostExecutorThread,
        private val studentRepository: StudentRepository) : BaseUseCase(postExecutorThread) {

    fun search(searchStudent: StudentSearch): Observable<List<Student>> {
        return studentRepository
                .search(searchStudent)
                .observeOn(postExecutorThread)
                .subscribeOn(workExecutorThread)
    }
}