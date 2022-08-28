package com.example.brjm_aos.ui.home.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.brjm_aos.databinding.ActivityHome1Binding
import com.example.brjm_aos.ui.home.adapter.CustomAdapter

class Home1Activity : AppCompatActivity() {

    private lateinit var verticalManager: LinearLayoutManager
    private lateinit var cAdapter: CustomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityHome1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        cAdapter = CustomAdapter()


        // Vertical .. 수평, 수직으로 처리하는 레이아웃 매니저
        verticalManager = LinearLayoutManager(this@Home1Activity)
        verticalManager.orientation = LinearLayoutManager.VERTICAL //방향속성

        binding.recyclerVertical.apply {
            layoutManager = verticalManager
            adapter = cAdapter


        }


    }
}