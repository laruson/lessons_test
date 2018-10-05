package com.example.user.lessons.fragments_lessons

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.user.lessons.R
//
//ViewPager
//ViewPagerAdapter
//TabLayout

class OneFragment : Fragment() {
    private var textx : String =""

    companion object {
        const val TEXT="TEXT"
        fun getFragment(string : String) : OneFragment{
            val fragment = OneFragment()
            val bundle = Bundle()
            bundle.putString(TEXT, string)
            fragment.arguments= bundle
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        textx= arguments?.getString(TEXT)?: ""
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? { //set content
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}