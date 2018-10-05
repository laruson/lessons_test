package com.example.user.lessons

import android.app.Activity
import android.app.Service
import android.content.*
import android.os.Bundle
import android.os.IBinder
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.ProgressBar
import android.widget.Toast

class LessonSeven : Activity() {
    private lateinit var sharedPreferences: SharedPreferences

    companion object {
        const val SHARED_PREFERENCES_NAME="adsasdas"
        const val SHARED_PREFERENCES_HELLO="adsasdaaaaaa"
    }
    private val adapter = StudentListAdapter {
        Log.e("AA", it.name + " " + it.surName)

    }
    private lateinit var progress: ProgressBar
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {

        sharedPreferences = getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_seven)

        recyclerView = findViewById<RecyclerView>(R.id.recycle)
        progress = findViewById<ProgressBar>(R.id.progress)


        val listData = listOf(
                Student("lol1", "kek1"),
                Student("lol2", "kek2"),
                Student("lol3", "kek3"),
                Student("lol4", "kek4"),
                Student("lol5", "kek5"),
                Student("lol6", "kek6"),
                Student("lol1", "kek1"),
                Student("lol2", "kek2"),
                Student("lol3", "kek3"),
                Student("lol4", "kek4"),
                Student("lol5", "kek5"),
                Student("lol6", "kek6"))




        adapter.listData = listData

        recyclerView.adapter = adapter

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

//        adapter.onItemClick = object : StudentListAdapter.OnItemClick{
//            override fun onClick(student: Student) {
//                Log.e("AA", student.name + " "+ student.surName)
//            }
//
//        }
    }

    override fun onStop() {
        super.onStop()
        sharedPreferences.edit()
                .putString(SHARED_PREFERENCES_HELLO, "HELLO")
                .apply()
    }

    override fun onStart() {
        super.onStart()
        val t=sharedPreferences.getString(SHARED_PREFERENCES_HELLO, "no data")
        Toast.makeText(this,t,Toast.LENGTH_LONG).show()
    }


//    override fun onResume() {
//        super.onResume()
//        val intent = Intent(this, MyIntentService::class.java)
//        intent.putExtra(MyIntentService.LINK_EXTRA, "vav1")
//        startService(intent)
//        val intent2 = Intent(this, MyIntentService::class.java)
//        intent.putExtra(MyIntentService.LINK_EXTRA, "vav2")
//        startService(intent2)
//        val intent3 = Intent(this, MyIntentService::class.java)
//        intent.putExtra(MyIntentService.LINK_EXTRA, "vav3")
//        startService(intent3)
//        val intent4 = Intent(this, MyIntentService::class.java)
//        intent.putExtra(MyIntentService.LINK_EXTRA, "vav4")
//        startService(intent4)
//
//
////        bindService(Intent(this, Lesson7::class.java),
////                serviceConnection, Context.BIND_AUTO_CREATE)
//    }
//
//    override fun onPause() {
//        super.onPause()
////        stopService(Intent(this, Lesson7::class.java))
////        unbindService(serviceConnection)
//
//    }
//
////    private val serviceConnection =object : ServiceConnection{
////        override fun onServiceDisconnected(p0: ComponentName?) {
////            Log.e("AAA", "onServiceDisconnected")
////        }
////
////        override fun onServiceConnected(p0: ComponentName?, p1: IBinder?) {
////            Log.e("AAA", "onServiceConnected")
////
////        }
////
////    }
}