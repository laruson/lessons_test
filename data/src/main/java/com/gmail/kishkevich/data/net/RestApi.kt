package com.gmail.kishkevich.data.net

import com.gmail.kishkevich.data.entity.StudentDeleteRequest
import com.gmail.kishkevich.data.entity.StudentRequest
import com.gmail.kishkevich.data.entity.StudentResponse
import com.gmail.kishkevich.domain.entity.Student
import io.reactivex.Observable
import retrofit2.http.*

interface RestApi {

    @GET("students")
    fun getStudents(): Observable<List<StudentResponse>>

//     defApi/students?id=dasd&name=ads
    @GET("students")
    fun getStudentById(@Query("id") id: String,
                       @Query("name") name: String): Observable<StudentResponse>

//    defApi/students/213213/
    @GET("students/{id}")
    fun getStudentById(@Path("id") id: String): Observable<StudentResponse>

    //defApi/students/
    @POST("students")
    fun updateStudent(@Body student: StudentRequest): Observable<StudentResponse>

    //defApi/students/2321312/
    @POST("students/{id}")
    fun updateStudent(@Path("id") id: String,
                      @Body student: StudentRequest): Observable<StudentResponse>

    //defApi/students/2321312/
    @DELETE("students/{id}")
    fun deleteStudent(@Path("id") id: String): Observable<Void>

    //defApi/students
    @DELETE("students")
//    @Header("key:valuse")
    fun deleteStudent(@Body student: StudentDeleteRequest): Observable<Void>
}