package com.example.something.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.something.databinding.ItemPhotoBinding

class Week5TaskAdapter(
    private val context: Context,
    private val imgList: List<Int>,
    private val titleList: List<String>,
    private val descList: List<String>
) : RecyclerView.Adapter<Week5TaskAdapter.PhotoViewHolder>() {
    inner class PhotoViewHolder(val binding: ItemPhotoBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        val binding = ItemPhotoBinding.inflate(LayoutInflater.from(context), parent, false)
        return PhotoViewHolder(binding)
    }

    override fun getItemCount():
        Int = imgList.size


    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        holder.binding.PhotoImage.setImageResource(imgList[position])
        holder.binding.TitleName.text = titleList[position]
        holder.binding.DescName.text = descList[position]
    }
}