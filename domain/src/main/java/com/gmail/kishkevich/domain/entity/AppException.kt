package com.gmail.kishkevich.domain.entity

import java.lang.Exception

data class AppException(
        val errorType : AppErrorType) : Exception(), DomainEntity