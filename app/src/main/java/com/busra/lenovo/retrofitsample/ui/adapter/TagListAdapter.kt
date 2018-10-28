package com.busra.lenovo.retrofitsample.ui.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.busra.lenovo.retrofitsample.dto.TagDTO

class TagListAdapter(val itemList:List<TagDTO>):RecyclerView.Adapter<TagListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TagListViewHolder {

        return TagListViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: TagListViewHolder, position: Int) {
        holder.bindTo(itemList[position])

    }
}