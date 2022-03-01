package com.example.modul5lesson8.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.modul5lesson8.R
import com.example.modul5lesson8.adapter.FeedAdapter
import com.example.modul5lesson8.adapter.StoryAdapter
import com.example.modul5lesson8.model.Post
import com.example.modul5lesson8.model.Story

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerStory: RecyclerView
    private lateinit var recyclerFeed: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews(){
        recyclerStory = findViewById(R.id.recyclerStory)
        recyclerStory.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        recyclerFeed = findViewById(R.id.recyclerFeed)
        recyclerFeed.layoutManager = GridLayoutManager(this, 1)

        refreshStoryAdapter(getAllStories())
        refreshFeedAdapter(getAllFeeds())
    }

    fun refreshStoryAdapter(chats : ArrayList<Story>){
        recyclerStory.adapter = StoryAdapter(this, chats)
    }

    fun refreshFeedAdapter(posts : ArrayList<Post>){
        recyclerFeed.adapter = FeedAdapter(this, posts)
    }

    fun getAllStories() : ArrayList<Story>{
        val stories : ArrayList<Story> = ArrayList()

        for (i in 0..10){
            stories.add(Story(R.drawable.img_profile, "Mansur$i"))
        }
        return stories
    }

    fun getAllFeeds() : ArrayList<Post>{
        val posts : ArrayList<Post> = ArrayList()
        posts.add(Post(R.drawable.img_profile, "Mansur Mirzayev1", R.drawable.img_watch_1))
        posts.add(Post(R.drawable.img_profile, "Mansur Mirzayev1", R.drawable.img_watch_1))
        posts.add(Post(R.drawable.img_profile, "Mansur Mirzayev1", R.drawable.img_watch_1))
        posts.add(Post(R.drawable.img_profile, "Mansur Mirzayev1", R.drawable.img_watch_1))
        posts.add(Post(R.drawable.img_profile, "Mansur Mirzayev1", R.drawable.img_watch_1))
        posts.add(Post(R.drawable.img_profile, "Mansur Mirzayev1", R.drawable.img_watch_1))
        posts.add(Post(R.drawable.img_profile, "Mansur Mirzayev1", R.drawable.img_watch_1))
        return posts
    }
}