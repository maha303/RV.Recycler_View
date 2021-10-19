package com.example.rvrecycler_view_activity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class RVAdapter (val ite:ArrayList<User>):RecyclerView.Adapter<RVAdapter.ItemViewHolder>() {
    class ItemViewHolder (itemView:View):RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
return ItemViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_row,parent,false))   }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = ite[position]
        holder.itemView.apply {
            tvMessage.text="User Name : ${item.name} \n Phone : ${item.phone} \n  Email : ${item.email}  \n Address : ${item.address}"
        }
    }

    override fun getItemCount()=ite.size
}