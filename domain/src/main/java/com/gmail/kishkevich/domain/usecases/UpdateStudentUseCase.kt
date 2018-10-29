package com.gmail.kishkevich.domain.usecases

import com.gmail.kishkevich.domain.entity.Student
import com.gmail.kishkevich.domain.executer.PostExecutorThread
import com.gmail.kishkevich.domain.repository.StudentRepository
import io.reactivex.Completable

class UpdateStudentUseCase(postExecutorThread : PostExecutorThread,
                           private val studentRepository: StudentRepository) : BaseUseCase(postExecutorThread) {
    fun update(student: Student) :Completable {
        return studentRepository
                .update(student)
                .observeOn(postExecutorThread)
                .subscribeOn(workExecutorThread)
    }
}