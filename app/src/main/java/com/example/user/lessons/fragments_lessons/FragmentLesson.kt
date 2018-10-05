package com.example.user.lessons.fragments_lessons

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.example.user.lessons.R

class FragmentLesson : AppCompatActivity() {
    private var isFeratFragment=false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        val textView =findViewById<TextView>(R.id.title_frame).setOnClickListener {
            changeFragment()
        }
        changeFragment()
    }

    private fun changeFragment(){

    }


}