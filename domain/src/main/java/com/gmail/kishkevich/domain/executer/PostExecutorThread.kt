package com.gmail.kishkevich.domain.executer

import io.reactivex.Scheduler

interface PostExecutorThread {
    fun getScheduler(): Scheduler
}