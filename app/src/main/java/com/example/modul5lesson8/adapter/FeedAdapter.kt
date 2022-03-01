package com.example.modul5lesson8.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.modul5lesson8.R
import com.example.modul5lesson8.model.Post
import com.google.android.material.imageview.ShapeableImageView

class FeedAdapter(var context: Context, var items : ArrayList<Post>)
    :RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return FeedViewHolder(LayoutInflater.from(context).inflate(R.layout.item_feed_post, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val feed = items[position]

        if(holder is FeedViewHolder){
            holder.apply {
                iv_profile.setImageResource(feed.profile)
                post.setImageResource(feed.photo)
                tv_fullname.text = feed.fullname
            }
        }
    }

    override fun getItemCount(): Int = items.size

    class FeedViewHolder(view : View) : RecyclerView.ViewHolder(view){
        var iv_profile = view.findViewById<ImageView>(R.id.iv_profile)
        var post = view.findViewById<ShapeableImageView>(R.id.iv_post)
        var tv_fullname = view.findViewById<TextView>(R.id.tv_fullname)
    }
}