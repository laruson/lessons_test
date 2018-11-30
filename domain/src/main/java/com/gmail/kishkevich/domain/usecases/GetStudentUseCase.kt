package com.gmail.kishkevich.domain.usecases

import com.gmail.kishkevich.domain.entity.Student
import com.gmail.kishkevich.domain.executer.PostExecutorThread
import com.gmail.kishkevich.domain.repository.StudentRepository
import io.reactivex.Observable
import javax.inject.Inject

class GetStudentUseCase @Inject constructor(
        postExecutorThread: PostExecutorThread,
        private val studentRepository: StudentRepository) : BaseUseCase(postExecutorThread) {
    fun get(): Observable<List<Student>> {
        return studentRepository
                .get()
                .observeOn(postExecutorThread)
                .subscribeOn(workExecutorThread)
    }

}