package com.gmail.kishkevich.data.repository

import com.gmail.kishkevich.domain.entity.Student
import com.gmail.kishkevich.domain.entity.StudentSearch
import com.gmail.kishkevich.domain.repository.StudentRepository
import io.reactivex.Completable
import io.reactivex.Observable

class StudentRepositoryImpl : StudentRepository{
    override fun getStudentById(id: String): Observable<Student> {
        return Observable.just(Student("2","kek",25))
    }

    override fun get(): Observable<List<Student>> {
        val list = listOf(Student("1", "lol",24),
                Student("2","kek",25),
                Student("3","lollol",26),
                Student("4","kekkek",27),
                Student("5","keklol",28))


        return  Observable.just(list)
    }

    override fun search(search: StudentSearch): Observable<List<Student>> {
        val list=listOf(Student("1", "lol",24),
                Student("2","kek",25),
                Student("3","lollol",26))
        return  Observable.just(list)
    }

    override fun update(student: Student): Completable {
        return Completable.complete()
    }

    override fun delete(studentId: String): Completable {
        return Completable.complete()
    }
}