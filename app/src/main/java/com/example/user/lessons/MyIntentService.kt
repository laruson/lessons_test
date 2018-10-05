package com.example.user.lessons

import android.app.IntentService
import android.content.Intent
import android.util.Log

class MyIntentService : IntentService("asasd") {
    companion object {
        val LINK_EXTRA = "hello"

    }


    override fun onHandleIntent(intent: Intent) {
        val link= intent.getStringExtra(LINK_EXTRA)
        Log.e("AAA", "link = $link")
        Thread.sleep(3000)
        Log.e("AAA", "link = $link")
    }
}