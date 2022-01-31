package com.example.recyclerviewwith_onclick_listener_10_injava.adapter

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
import android.view.View
import android.view.ViewParent
import com.example.recyclerviewwith_onclick_listener_10_injava.adapter.CustomAdapter
import androidx.recyclerview.widget.GridLayoutManager
import com.example.recyclerviewwith_onclick_listener_10_injava.model.Member

class CustomAdapter(private val activity: MainActivity, private val members: List<Member>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_custom_layout, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val member = members[position]
        if (holder is CustomViewHolder) {

            holder.first_name.text = member.firstName
            holder.last_name.text = member.lastName

            holder.lay_click.setOnClickListener {
                activity.openItemDetails(member)
            }
        }
    }

    override fun getItemCount(): Int {
        return members.size
    }

   class CustomViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

          val lay_click: LinearLayout = itemView.findViewById<LinearLayout>(R.id.lay_click)
          val first_name: TextView = itemView.findViewById<TextView>(R.id.first_name)
          val last_name: TextView = itemView.findViewById<TextView>(R.id.last_name)
    }
}