package com.example.brjm_aos.ui.login.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.brjm_aos.databinding.ActivityJoin2Binding

class Join2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityJoin2Binding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.livingbt?.setOnClickListener {
            Toast.makeText(this, "버튼 눌림", Toast.LENGTH_SHORT).show()
            binding.livingbt?.isSelected = binding.livingbt?.isSelected != true
            }

        binding.testbt?.setOnClickListener {
            Toast.makeText(this, "2번 버튼 눌림", Toast.LENGTH_SHORT).show()
            binding.testbt?.isSelected = binding.livingbt?.isSelected != true
        }

        binding.beautybt?.setOnClickListener {
            Toast.makeText(this, "3번 버튼 눌림", Toast.LENGTH_SHORT).show()
            binding.beautybt?.isSelected = binding.livingbt?.isSelected != true
        }
        binding.treebt?.setOnClickListener {
            Toast.makeText(this, "4번 버튼 눌림", Toast.LENGTH_SHORT).show()
            binding.treebt?.isSelected = binding.livingbt?.isSelected != true
        }
        binding.clothbt?.setOnClickListener {
            Toast.makeText(this, "5번 버튼 눌림", Toast.LENGTH_SHORT).show()
            binding.clothbt?.isSelected = binding.livingbt?.isSelected != true
        }
        binding.diybt?.setOnClickListener {
            Toast.makeText(this, "6번 버튼 눌림", Toast.LENGTH_SHORT).show()
            binding.diybt?.isSelected = binding.livingbt?.isSelected != true
        }
        binding.furnbt?.setOnClickListener {
            Toast.makeText(this, "7번 버튼 눌림", Toast.LENGTH_SHORT).show()
            binding.furnbt?.isSelected = binding.livingbt?.isSelected != true
        }
        binding.propbt?.setOnClickListener {
            Toast.makeText(this, "8번 버튼 눌림", Toast.LENGTH_SHORT).show()
            binding.propbt?.isSelected = binding.livingbt?.isSelected != true
        }
        }
    }
