package com.gmail.kishkevich.data.repository

import com.gmail.kishkevich.data.db.dao.StudentDao
import com.gmail.kishkevich.data.db.entity.transformToDomain
import com.gmail.kishkevich.data.entity.transformToDB
import com.gmail.kishkevich.data.entity.transformToDomain
import com.gmail.kishkevich.data.net.RestService
import com.gmail.kishkevich.domain.entity.AppErrorType
import com.gmail.kishkevich.domain.entity.AppException
import com.gmail.kishkevich.domain.entity.Student
import com.gmail.kishkevich.domain.entity.StudentSearch
import com.gmail.kishkevich.domain.repository.StudentRepository
import io.reactivex.Completable
import io.reactivex.Observable
import java.net.SocketTimeoutException

class StudentRepositoryImpl(val restService: RestService,
                            val studentDao: StudentDao) : StudentRepository {

    private var lastTimeUpdate = 0L

    companion object {
        private var TIME_BUFFER = 60000
    }

    override fun getStudentById(id: String): Observable<Student> {
        return Observable.just(Student("2", "kek", 25))
                .doOnError {
                    if (it is SocketTimeoutException)
                        AppException(AppErrorType.SERVER_IS_NOT_AVAILABLE)
                    else
                        AppException(AppErrorType.UNKNOWN)
                }
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
                .flatMap { list ->
                    if (list.isEmpty() || System.currentTimeMillis() - lastTimeUpdate > TIME_BUFFER) {
                        restService.getStudents()
                                .doOnNext { it ->
                                    lastTimeUpdate = System.currentTimeMillis()
                                    studentDao.deleteAll()
                                    it.map {
                                        studentDao.insert(it.transformToDB())
                                    }
                                }
                                .map { it ->
                                    it.map {
                                        it.transformToDomain()
                                    }
                                }
                                .onErrorReturn { it ->
                                    if (list.isEmpty()) {
                                        throw it
                                    } else {
                                        list.map {
                                            it.transformToDomain()
                                        }
                                    }
                                }
                    } else {
                        Observable.just(list).map { it ->
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