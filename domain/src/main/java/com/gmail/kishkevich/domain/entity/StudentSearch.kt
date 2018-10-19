package com.gmail.kishkevich.domain.entity

import com.gmail.kishkevich.domain.entity.DomainEntity

data class StudentSearch(
        val name:String="",
        val age: Int = 0) : DomainEntity