package com.example.brjm_aos.ui.login.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.brjm_aos.databinding.ActivityJoinBinding
import com.example.brjm_aos.databinding.ActivityStartBinding

class JoinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityJoinBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.join2Button.setOnClickListener {
            val intent = Intent(this, Join2Activity::class.java)
            startActivity(intent)
        }



    }
}
