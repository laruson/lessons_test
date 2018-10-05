package com.example.user.lessons

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class ServiceLesson : Service() {
    override fun onCreate() {
        super.onCreate()
        Log.e("AAAAAAA", "onCreate")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("AAAAAAA", "onDestroy")

    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.e("AAAAAAA", "onStartCommand")

        return super.onStartCommand(intent, flags, startId)
    }



    override fun onBind(p0: Intent?): IBinder {
        Log.e("AAAAAAA", "onBind")

        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onUnbind(intent: Intent?): Boolean {
        Log.e("AAAAAAA", "onUnbind")

        return super.onUnbind(intent)
    }
}