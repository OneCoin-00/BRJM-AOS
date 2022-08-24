package com.example.brjm_aos.ui.login.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.brjm_aos.databinding.ActivityJoin2Binding


class Join2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityJoin2Binding.inflate(layoutInflater)
        setContentView(binding.root)



//            binding.livingbt?.setOnClickListener {
//            Toast.makeText(this, "버튼 눌림", Toast.LENGTH_SHORT).show()
//            binding.livingbt?.isSelected = binding.livingbt?.isSelected != true
//        }


        binding.joinslbutton.setOnClickListener {
            val intent = Intent(this, StartActivity::class.java)
            startActivity(intent)
        }


    }
}
