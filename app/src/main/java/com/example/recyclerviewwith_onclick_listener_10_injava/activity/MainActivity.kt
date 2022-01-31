package com.example.recyclerviewwith_onclick_listener_10_injava.activity

import android.content.Context
import com.example.recyclerviewwith_onclick_listener_10_injava.activity.MainActivity
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import com.example.recyclerviewwith_onclick_listener_10_injava.R
import com.example.recyclerviewwith_onclick_listener_10_injava.adapter.CustomAdapter.CustomViewHolder
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.recyclerviewwith_onclick_listener_10_injava.adapter.CustomAdapter
import androidx.recyclerview.widget.GridLayoutManager
import com.example.recyclerviewwith_onclick_listener_10_injava.model.Member
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        val members = prepareMemberList()
        refreshAdapter(members)
    }

    private fun prepareMemberList(): List<Member>{
        val members = ArrayList<Member>()
        for (i in 0..29) {
            members.add(Member("Ilhombek $i", "Ubaydullayev $i"))
        }
        return members
    }

    private fun refreshAdapter(members: List<Member>) {
        val adapter = CustomAdapter(this, members)
        recyclerView!!.adapter = adapter
    }

    fun openItemDetails(member: Member) {
        Log.d("@@@", "item is clicked" + member.firstName)
    }

    private fun initView() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView!!.layoutManager = GridLayoutManager(this,1)
    }
}