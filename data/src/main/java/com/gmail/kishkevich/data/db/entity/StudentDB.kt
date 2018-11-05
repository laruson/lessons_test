package com.gmail.kishkevich.data.db.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName="student")
data class StudentDB(
        @PrimaryKey
        val id: String,
        val name: String,
        val age: Int,
        val img:String=""
)