package com.example.brjm_aos.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.brjm_aos.R
import com.example.brjm_aos.databinding.ActivityMainBinding
import com.example.brjm_aos.ui.main.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator



class MainActivity : AppCompatActivity(){


    private val tabIconList = listOf(R.drawable.icon_home_test, R.drawable.icon_write_test, R.drawable.icon_plus_test,R.drawable.icon_news_test, R.drawable.icon_my_test)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        binding.viewPager01.adapter = ViewPagerAdapter(this)
        setContentView(binding.root)

        TabLayoutMediator(binding.tabLayout01, binding.viewPager01) { tab, pos ->
            tab.setIcon(tabIconList[pos])
        }.attach()


    }
}




