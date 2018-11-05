package com.gmail.kishkevich.data.repository

import com.gmail.kishkevich.data.db.dao.StudentDao
import com.gmail.kishkevich.data.db.entity.transformToDomain
import com.gmail.kishkevich.data.entity.transformToDB
import com.gmail.kishkevich.data.entity.transformToDomain
import com.gmail.kishkevich.data.net.RestService
import com.gmail.kishkevich.domain.entity.Student
import com.gmail.kishkevich.domain.entity.StudentSearch
import com.gmail.kishkevich.domain.repository.StudentRepository
import io.reactivex.Completable
import io.reactivex.Observable

class StudentRepositoryImpl(val restService: RestService,
                            val studentDao: StudentDao) : StudentRepository {
    override fun getStudentById(id: String): Observable<Student> {
        return Observable.just(Student("2", "kek", 25))
    }

    override fun get(): Observable<List<Student>> {
//        val list = listOf(Student("1", "lol",24),
//                Student("2","kek",25),
//                Student("3","lollol",26),
//                Student("4","kekkek",27),
//                Student("5","keklol",28))
//
//
//        return  Observable.just(list)
//        return restService.getStudents().map { it ->
//            it.map {
//                it.transformToDomain()
//            }
//        }

        return studentDao.getAll()
                .flatMap { it ->
                    if (it.isEmpty()) {
                        restService.getStudents()
                                .doOnNext { it ->
                                    it.map {
                                        studentDao.insert(it.transformToDB())
                                    }
                                }
                                .map { it ->
                                    it.map {
                                        it.transformToDomain()
                                    }
                                }
                    } else {
                        Observable.just(it).map { it ->
                            it.map {
                                it.transformToDomain()
                            }
                        }
                    }
                }
    }

    override fun search(search: StudentSearch): Observable<List<Student>> {
        val list = listOf(Student("1", "lol", 24),
                Student("2", "kek", 25),
                Student("3", "lollol", 26))
        return Observable.just(list)
    }

    override fun update(student: Student): Completable {
        return Completable.complete()
    }

    override fun delete(studentId: String): Completable {
        return Completable.complete()
    }
}