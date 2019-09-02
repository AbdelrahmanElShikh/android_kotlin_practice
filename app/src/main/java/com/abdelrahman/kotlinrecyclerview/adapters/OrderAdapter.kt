package com.abdelrahman.kotlinrecyclerview.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.abdelrahman.kotlinrecyclerview.databinding.ListItemBinding
import com.abdelrahman.kotlinrecyclerview.models.Order


/**
@author  Abdel-Rahman El-Shikh on 02-Sep-19.
 */
class OrderAdapter(private var orders: ArrayList<Order>) :
    RecyclerView.Adapter<OrderAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ListItemBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return this.orders.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val order = orders.get(position)
        holder.binding.order = order
    }

    class ViewHolder(var binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)
}