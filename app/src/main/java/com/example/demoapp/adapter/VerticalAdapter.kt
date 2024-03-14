package com.example.demoapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.demoapp.R
import com.example.demoapp.model.verticalData

class VerticalAdapter(val context: Context, val itemList: List<verticalData>): RecyclerView.Adapter<VerticalAdapter.VerticalViewHolder>() {

    class VerticalViewHolder(view: View): RecyclerView.ViewHolder(view){
        val imgImage: ImageView = view.findViewById(R.id.imageView)
        val tvTitle: TextView = view.findViewById(R.id.tv_title)
        val tvName: TextView = view.findViewById(R.id.tv_name)
        val tvRating: TextView = view.findViewById(R.id.tv_rating)
        val tvPrice: TextView = view.findViewById(R.id.tv_price)
        val tvSize: TextView = view.findViewById(R.id.tv_size)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerticalViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.vertical_item_list, parent, false)
        return VerticalViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: VerticalViewHolder, position: Int) {
        val currentItem = itemList[position]
        holder.imgImage.setImageResource(currentItem.image)
        holder.tvTitle.text = currentItem.title
        holder.tvName.text = currentItem.name
        holder.tvPrice.text = currentItem.price
        holder.tvRating.text = currentItem.rating
        holder.tvSize.text = currentItem.size
    }
}