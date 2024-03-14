package com.example.demoapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.demoapp.model.HorizontalData
import com.example.demoapp.R

class HorizontalAdapter(context: Context, val itemList: List<HorizontalData>): RecyclerView.Adapter<HorizontalAdapter.myViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.horizontal_item_list, parent, false)
        return myViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        val currentItem = itemList[position]
        holder.txtTitle.text = currentItem.title
        holder.imgView.setImageResource(currentItem.image)
    }

    class myViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val imgView: ImageView = view.findViewById(R.id.imageView)
        val txtTitle: TextView = view.findViewById(R.id.txt_title)

    }

}