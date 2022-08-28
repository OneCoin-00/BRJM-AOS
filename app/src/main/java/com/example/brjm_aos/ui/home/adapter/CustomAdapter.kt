package com.example.brjm_aos.ui.home.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.brjm_aos.R
import com.example.brjm_aos.ui.home.activity.Home1Activity
import com.example.brjm_aos.ui.home.activity.Home2Activity

class CustomAdapter : RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {
    private val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.itemtest_view, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.bind(list[position])
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView?.context, Home2Activity::class.java)
            ContextCompat.startActivity(holder.itemView.context, intent, null)
        }


    }

    override fun getItemCount(): Int {
        return list.size
    }


    class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtView: TextView = view.findViewById(R.id.item_name)
        val likebutton: Button = view.findViewById(R.id.likebutton)

        fun bind(position: Int) {
            txtView.text = "TEXT $position"
        }

        init {//좋아요버튼
            likebutton.setOnClickListener{
                likebutton.isSelected = likebutton.isSelected != true
            }
        }
    }
}