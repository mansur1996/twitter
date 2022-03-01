package com.example.modul5lesson8.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.modul5lesson8.R
import com.example.modul5lesson8.model.Story
import com.google.android.material.imageview.ShapeableImageView

class StoryAdapter(var context: Context, var items : ArrayList<Story>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return StoryViewHolder(LayoutInflater.from(context).inflate(R.layout.item_feed_story, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val story = items[position]

        if(holder is StoryViewHolder){
            holder.apply {
                iv_profile.setImageResource(story.profile)
                tv_fullname.text = story.fullname
            }
        }
    }

    override fun getItemCount(): Int = items.size

    class StoryViewHolder(view: View):RecyclerView.ViewHolder(view){
        var iv_profile = view.findViewById<ShapeableImageView>(R.id.iv_profile)
        var tv_fullname = view.findViewById<TextView>(R.id.tv_fullname)
    }
}