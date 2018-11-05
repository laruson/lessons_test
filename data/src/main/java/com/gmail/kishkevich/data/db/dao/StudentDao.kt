package com.gmail.kishkevich.data.db.dao

import android.arch.persistence.room.*
import com.gmail.kishkevich.data.db.entity.StudentDB
import io.reactivex.Observable

@Dao
interface StudentDao {
    @Insert
    fun insert(vararg student: StudentDB)

    @Update
    fun update(student: StudentDB)

    @Query("DELETE FROM student WHERE id=:id")
    fun deleteById(id: String)

    @Query("DELETE FROM student")
    fun deleteAll()

    @Query("SELECT * FROM student ORDER BY name")
    fun getAll(): Observable<List<StudentDB>>

    @Query("SELECT * FROM student WHERE id=:id LIMIT 1")
    fun getById(id: String): Observable<StudentDB>
}