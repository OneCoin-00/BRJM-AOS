package com.example.brjm_aos.ui.main


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.brjm_aos.R
import com.example.brjm_aos.databinding.ActivityMainBinding
import com.example.brjm_aos.ui.main.fragment.*


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        initNavigationBar() //네이게이션 바의 각 메뉴 탭을 눌렀을 때 화면이 전환되도록 하는 함수.
    }


    private fun initNavigationBar() {


        binding.bottomNavigationView.run {
            setOnItemSelectedListener() {
                when (it.itemId) {
                    R.id.home_ic1 -> {
                        changeFragment(mainhomeFragment())

                    }
                    R.id.home_ic2 -> {
                        changeFragment(wpFragment())
                    }
                    R.id.home_ic3 -> {
                        changeFragment(postFragment())
                    }
                    R.id.home_ic4 -> {
                        changeFragment(newsFragment())
                    }
                    R.id.home_ic5 -> {
                        changeFragment(mypageFragment())
                    }
                }
                true
            }
            selectedItemId = R.id.home_ic1
        }
    }




    private fun changeFragment(fragment: Fragment) {
            supportFragmentManager.beginTransaction()
                .replace(binding.frameLayout.id, fragment).commit()
        }
    }







