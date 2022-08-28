package com.example.brjm_aos.ui.home.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.brjm_aos.databinding.ActivityHome7Binding

class Home7Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityHome7Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}