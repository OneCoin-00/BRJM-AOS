package com.example.brjm_aos.ui.login.activity

import android.content.ContentValues.TAG
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.util.Patterns

import com.example.brjm_aos.databinding.ActivityJoinBinding



class JoinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityJoinBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //join2Button 버튼 이벤트 : 카테고리 선택 엑티비티로 이동
        binding.join2Button.setOnClickListener {
            val intent = Intent(this, PwActivity::class.java)
            startActivity(intent)
        }


        binding.questionEmail.addTextChangedListener(object : TextWatcher{

            override fun beforeTextChanged(p0: CharSequence?,
                                           p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?,
                                       p1: Int, p2: Int, p3: Int) {
                // 이메일 유효성 검사
                if (p0.isValidEmail()){
                    binding.questionEmailGreen.text = "사용할 수 있는 이메일 입니다."
                    binding.questionEmailGreen.setTextColor(Color.parseColor("#32a05f"))
                    Log.d(TAG,"성공")
                }else{
                    binding.questionEmailGreen.text = "사용할 수 없는 이메일 입니다."
                    binding.questionEmailGreen.setTextColor(Color.parseColor("#e35252"))
                    Log.d(TAG,"실패")
                }
            }

            override fun afterTextChanged(p0: Editable?) { }
        })


    }
}

// extension function to validate edit text inputted email address
fun CharSequence?.isValidEmail():Boolean{
    return !isNullOrEmpty() && Patterns.EMAIL_ADDRESS.matcher(this).matches()
}