package com.example.brjm_aos.ui.main.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.brjm_aos.databinding.FragmentMypageBinding
import com.example.brjm_aos.ui.mypage.adapter.ViewpagerAdapter2


class mypageFragment : Fragment() {
    //view binding 정의
    private var binding : FragmentMypageBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

    }

    // 뷰가 생성되었을 때 - 프레그먼트와 레이아웃을 연결시켜주는 부분
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMypageBinding.inflate(inflater,
            container, false)
        return binding!!.root

    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }

    companion object { // 프래그먼트의 외부인 액티비티에서 접근하고 메모리에 올라간 프래그먼트 인스턴스 사용
        fun newInstance() : mypageFragment{
            return mypageFragment()
        }
    }



}