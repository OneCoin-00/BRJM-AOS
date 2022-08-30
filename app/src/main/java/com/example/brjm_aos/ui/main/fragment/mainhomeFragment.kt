package com.example.brjm_aos.ui.main.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.brjm_aos.databinding.FragmentMainhomeBinding
import com.example.brjm_aos.ui.home.activity.Home1Activity


//fragment 상속
class mainhomeFragment : Fragment() {

    //view binding 정의
    private var binding : FragmentMainhomeBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    // 뷰가 생성되었을 때 - 프레그먼트와 레이아웃을 연결시켜주는 부분
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainhomeBinding.inflate(inflater,
            container, false)

        //버튼 클릭시 각 카테고리에 알맞는 엑티비티로 전환
        binding?.livingbt2?.setOnClickListener {
            activity?.let {
                val intent = Intent(context, Home1Activity::class.java)
                startActivity(intent)
            }
        }

        return binding!!.root

    }

    override fun onDestroyView() { //Fragment 에서 ViewBinding 사용 시 memory leak 의 위험으로 null 처리
        binding = null
        super.onDestroyView()
    }


    companion object { // 프래그먼트의 외부인 액티비티에서 접근하고 메모리에 올라간 프래그먼트 인스턴스 사용
        fun newInstance() : mainhomeFragment{
            return mainhomeFragment()
                }
            }
    }
