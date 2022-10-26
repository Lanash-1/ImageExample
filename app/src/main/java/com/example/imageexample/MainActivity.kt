package com.example.imageexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var adapter = ImageAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageUrls = mutableListOf(
            ImageUrl("https://dummyjson.com/image/i/products/6/1.png"),
            ImageUrl("https://dummyjson.com/image/i/products/6/2.jpg"),
            ImageUrl("https://dummyjson.com/image/i/products/6/3.png"),
            ImageUrl("https://dummyjson.com/image/i/products/6/4.jpg"),
            ImageUrl("https://dummyjson.com/image/i/products/7/1.jpg"),
            ImageUrl("https://dummyjson.com/image/i/products/7/2.jpg"),
            ImageUrl("https://dummyjson.com/image/i/products/7/3.jpg"),
            ImageUrl("https://dummyjson.com/image/i/products/8/1.jpg"),
            ImageUrl("https://dummyjson.com/image/i/products/8/2.jpg"),
            ImageUrl("https://dummyjson.com/image/i/products/8/3.jpg"),
            ImageUrl("https://dummyjson.com/image/i/products/8/4.jpg"),
            ImageUrl("https://dummyjson.com/image/i/products/7/1.jpg"),
            ImageUrl("https://dummyjson.com/image/i/products/7/2.jpg"),
            ImageUrl("https://dummyjson.com/image/i/products/7/3.jpg")
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        adapter.setUrlList(imageUrls)
        recyclerView.adapter = adapter


        recyclerView.layoutManager = GridLayoutManager(this, 2)


    }
}