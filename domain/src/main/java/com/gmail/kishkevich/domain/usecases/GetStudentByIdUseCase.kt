package com.gmail.kishkevich.domain.usecases

import com.gmail.kishkevich.domain.entity.Student
import com.gmail.kishkevich.domain.executer.PostExecutorThread
import com.gmail.kishkevich.domain.repository.StudentRepository
import io.reactivex.Observable

class GetStudentByIdUseCase(postExecutorThread : PostExecutorThread,
                            private val studentRepository: StudentRepository) : BaseUseCase(postExecutorThread) {
    fun getStudentById(id: String): Observable<Student> {
        return studentRepository
                .getStudentById(id)
                .observeOn(postExecutorThread)
                .subscribeOn(workExecutorThread)
    }
}