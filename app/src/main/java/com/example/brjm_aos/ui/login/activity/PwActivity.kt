package com.example.brjm_aos.ui.login.activity


import android.content.ContentValues.TAG
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.brjm_aos.R

import com.example.brjm_aos.databinding.ActivityPwBinding
import java.util.regex.Pattern

class PwActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPwBinding.inflate(layoutInflater)

        setContentView(binding.root)


        binding.pwEdittext2.addTextChangedListener(object : TextWatcher {
            //입력이 끝났을 때
            // 비밀번호 일치하는지 확인
            override fun afterTextChanged(p0: Editable?) {
                if(!Pattern.matches("^(?=.*\\d)(?=.*[a-zA-Z])[0-9a-zA-Z]{6,20}\$", binding.pwEdittext1.text)) {
                    binding.pwTv1.text = "영문, 숫자를 포함하여 6자 이상"
                    binding.pwTv1.setTextColor(Color.parseColor("#e35252"))

                }else
                {
                    binding.pwTv1.text = "비밀번호를 확인했습니다."
                    binding.pwTv1.setTextColor(Color.parseColor("#32a05f"))
                    //binding.pwTv1.backgroundTintList = ContextCompat.getColorStateList(applicationContext, R.color.starticon_selector )

                    if(binding.pwEdittext1.getText().toString().equals(binding.pwEdittext2.getText().toString())){
                        binding.pwTv2.text = "비밀번호가 일치합니다."
                        binding.pwTv2.setTextColor(Color.parseColor("#32a05f"))
                        Log.d(TAG,"일치")


                    }
                    else{
                        binding.pwTv2.text = "비밀번호가 일치하지 않습니다."
                        binding.pwTv2.setTextColor(Color.parseColor("#e35252"))
                    }
                }

            }
            //입력하기 전
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//                binding.pwTv1.text = "영문, 숫자를 포함하여 6자 이상"
//                binding.pwTv1.setTextColor(Color.parseColor("#e35252"))

            }
            //텍스트 변화가 있을 시
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                if(!Pattern.matches("^(?=.*\\d)(?=.*[a-zA-Z])[0-9a-zA-Z]{6,20}\$", binding.pwEdittext1.text)) {
                    binding.pwTv1.text = "영문, 숫자를 포함하여 6자 이상"
                    binding.pwTv1.setTextColor(Color.parseColor("#e35252"))

                }else
                {
                    binding.pwTv1.text = "비밀번호를 확인했습니다."
                    binding.pwTv1.setTextColor(Color.parseColor("#32a05f"))
                    //binding.pwTv1.backgroundTintList = ContextCompat.getColorStateList(applicationContext, R.color.starticon_selector )
                    if(binding.pwEdittext1.getText().toString().equals(binding.pwEdittext2.getText().toString())){
                        binding.pwTv2.text = "비밀번호가 일치합니다."
                        binding.pwTv2.setTextColor(Color.parseColor("#32a05f"))
                        Log.d(TAG,"일치")
                    }
                    else{
                        binding.pwTv2.text = "비밀번호가 일치하지 않습니다."
                        binding.pwTv2.setTextColor(Color.parseColor("#e35252"))
                        Log.d(TAG,"불일치")
                }


                }
            }
        })

        binding.pwButton.setOnClickListener {

            if((binding.pwEdittext1.getText().toString().equals(binding.pwEdittext2.getText().toString()))&&Pattern.matches("^(?=.*\\d)(?=.*[a-zA-Z])[0-9a-zA-Z]{6,20}\$", binding.pwEdittext1.text)){

                val intent = Intent(this, Join2Activity::class.java)
                startActivity(intent)
            }
            else
            {
                Toast.makeText(this, "비밀번호를 확인해주세요", Toast.LENGTH_SHORT).show()
            }
        }
    }

}



