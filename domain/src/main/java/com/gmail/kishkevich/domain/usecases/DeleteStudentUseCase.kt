package com.gmail.kishkevich.domain.usecases

import com.gmail.kishkevich.domain.executer.PostExecutorThread
import com.gmail.kishkevich.domain.repository.StudentRepository
import io.reactivex.Completable

class DeleteStudentUseCase(postExecutorThread : PostExecutorThread,
        private val studentRepository: StudentRepository) : BaseUseCase(postExecutorThread) {
    fun delete(studentId: String) : Completable{
        return studentRepository
                .delete(studentId)
                .observeOn(postExecutorThread)
                .subscribeOn(workExecutorThread)
    }
}