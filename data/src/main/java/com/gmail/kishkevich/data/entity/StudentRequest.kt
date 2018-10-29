package com.gmail.kishkevich.data.entity

import com.google.gson.annotations.SerializedName

data class StudentRequest(
        @SerializedName("id")
        val id: String,
        @SerializedName("name")
        val name: String,
        @SerializedName("age")
        val age: Int) : DataEntity