package com.example.brjm_aos.ui.login.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.brjm_aos.databinding.ActivityPwBinding

class PwActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPwBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}