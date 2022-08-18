package com.example.brjm_aos.ui.login.activity


import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log

import com.example.brjm_aos.databinding.ActivityPwBinding

class PwActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPwBinding.inflate(layoutInflater)

        setContentView(binding.root)


        binding.pwEdittext2.addTextChangedListener(object : TextWatcher {
            //입력이 끝났을 때
            //4. 비밀번호 일치하는지 확인
            override fun afterTextChanged(p0: Editable?) {
                if(binding.pwEdittext1.getText().toString().equals(binding.pwEdittext2.getText().toString())){

                    Log.d(TAG,"일치")
                }
                else{
                    Log.d(TAG,"불일치")
                }
            }
            //입력하기 전
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }
            //텍스트 변화가 있을 시
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if(binding.pwEdittext1.getText().toString().equals(binding.pwEdittext2.getText().toString())){
                    Log.d(TAG,"일치")
                }
                else{
                    Log.d(TAG,"불일치")
                }
            }
        })
    }

}