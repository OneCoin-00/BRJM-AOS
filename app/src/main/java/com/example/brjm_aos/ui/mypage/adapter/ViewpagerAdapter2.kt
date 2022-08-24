package com.example.brjm_aos.ui.mypage.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.brjm_aos.ui.main.fragment.*
import com.example.brjm_aos.ui.mypage.fragment.Fragment_like
import com.example.brjm_aos.ui.mypage.fragment.Fragment_myalarm
import com.example.brjm_aos.ui.mypage.fragment.Fragment_write

class ViewpagerAdapter2 (fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> Fragment_myalarm()
            1 -> Fragment_write()
            else -> Fragment_like()
        }
    }

}