package com.example.brjm_aos.ui.home.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.brjm_aos.databinding.ActivityHome3Binding

class Home3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityHome3Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}