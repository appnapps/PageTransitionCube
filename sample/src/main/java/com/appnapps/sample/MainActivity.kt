package com.appnapps.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.viewpager2.widget.ViewPager2
import com.appnapps.cubepagertransformer.CubePageTransformer

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        viewPager.adapter = SimplePagerAdapter(this)
        viewPager.setPageTransformer(CubePageTransformer())
    }
}