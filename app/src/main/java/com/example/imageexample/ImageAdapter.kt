package com.example.imageexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.imageexample.databinding.ItemImageBinding

class ImageAdapter: RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    private lateinit var urlList: List<ImageUrl>

    fun setUrlList(newList: List<ImageUrl>){
        urlList = newList
    }

    inner class ImageViewHolder(val binding: ItemImageBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemImageBinding.inflate(layoutInflater, parent, false)
        return ImageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val url = urlList[position].url
        Glide.with(holder.itemView.context)
            .load(url)
            .into(holder.binding.image)
    }

    override fun getItemCount(): Int {
        return urlList.size
    }
}