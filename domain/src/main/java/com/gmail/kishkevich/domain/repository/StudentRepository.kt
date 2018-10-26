package com.gmail.kishkevich.domain.repository

import com.gmail.kishkevich.domain.entity.Student
import com.gmail.kishkevich.domain.entity.StudentSearch
import io.reactivex.Completable
import io.reactivex.Observable

interface StudentRepository : BaseRepository {
    fun get(): Observable<List<Student>>

    fun getStudentById(id : String): Observable<Student>


    fun search(search: StudentSearch): Observable<List<Student>>

    fun update(student: Student): Completable

    fun delete(studentId: String): Completable
}