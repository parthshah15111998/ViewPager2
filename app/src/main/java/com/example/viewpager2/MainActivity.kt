package com.example.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    lateinit var viewPager2:ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         viewPager2=findViewById<ViewPager2>(R.id.viewpager2)

        val fragment:ArrayList<Fragment> = arrayListOf(
            BlankFragmentA(),
            BlankFragmentB(),
            BlankFragmentC(),
            )
        val adapter = ViewPagerAdapter(fragment,this)
        viewPager2.adapter=adapter

    }

    override fun onBackPressed() {

        if (viewPager2.currentItem == 0) {
            super.onBackPressed()
        }else{
            viewPager2.currentItem=viewPager2.currentItem-1
        }
    }
}