package com.abdelrahman.kotlinrecyclerview.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.abdelrahman.kotlinrecyclerview.R
import com.abdelrahman.kotlinrecyclerview.databinding.ListItemBinding
import com.abdelrahman.kotlinrecyclerview.models.Order


/**
@author  Abdel-Rahman El-Shikh on 02-Sep-19.
 */
class OrderAdapter(private var orders: ArrayList<Order>): RecyclerView.Adapter<OrderAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val itemView = LayoutInflater.from(parent?.context).inflate(R.layout.list_item,parent,false)
            return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return orders.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var order = orders.get(position)
    }

    class ViewHolder(viewItem: View ) : RecyclerView.ViewHolder(viewItem) {
        lateinit var binding: ListItemBinding
    }
}