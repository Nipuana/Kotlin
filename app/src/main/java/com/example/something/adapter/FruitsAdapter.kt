package com.example.something.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.something.R

class FruitsAdapter(
    val context: Context,
    val imageList: ArrayList<Int>,
    val TitleList: ArrayList<String>,
    val DescList: ArrayList<String>,
    )
    :RecyclerView.Adapter<FruitsAdapter.FruitsViewHolder>()
{
        class FruitsViewHolder(itemView: View) :
            RecyclerView.ViewHolder(itemView){
            val image :ImageView =itemView.findViewById(R.id.elephant1)
            val title :TextView =itemView.findViewById(R.id.elephantText1)
            val desc :TextView =itemView.findViewById(R.id.elephantText2)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitsViewHolder {
        val view : View = LayoutInflater.from(context).inflate(R.layout.sample_fruits,parent,false)
        return FruitsViewHolder(view)
    }

    override fun getItemCount(): Int {
//        return imageList.size
          return  3
    }

    override fun onBindViewHolder(holder: FruitsViewHolder, position: Int) {

        holder.title.text= TitleList[position]
        holder.desc.text=  DescList[position]
        holder.image.setImageResource(imageList[position])
    }

}