package com.example.brjm_aos.ui.main.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.brjm_aos.ui.main.fragment.*

class ViewPagerAdapter (fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = 5

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> mainhomeFragment()
            1 -> wpFragment()
            2 -> postFragment()
            3 -> newsFragment()
            else -> mypageFragment()
        }
    }

}
