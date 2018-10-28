package com.busra.lenovo.retrofitsample.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.busra.lenovo.retrofitsample.R
import com.busra.lenovo.retrofitsample.dto.TagDTO

class TagListViewHolder(viewGroup: ViewGroup):RecyclerView.ViewHolder(LayoutInflater.from(viewGroup.context)
    .inflate(R.layout.adapter_item_tag_list,viewGroup,false)) {


    private val txtName by lazy {itemView.findViewById<TextView>(R.id.txtName) }
    private val txtIsPrimary by lazy {itemView.findViewById<TextView>(R.id.txtIsPrimary) }

    fun bindTo(tagDTO: TagDTO){
        txtName.text=tagDTO.name
        txtIsPrimary.text=tagDTO.isPrimary.toString()

    }
}