package com.abdelrahman.kotlinrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.abdelrahman.kotlinrecyclerview.adapters.OrderAdapter
import com.abdelrahman.kotlinrecyclerview.databinding.ActivityMainBinding
import com.abdelrahman.kotlinrecyclerview.models.Order

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val adapter = OrderAdapter(generateData())
        val layoutManager = LinearLayoutManager(applicationContext)
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.itemAnimator = DefaultItemAnimator()
        binding.recyclerView.adapter = adapter
        adapter.notifyDataSetChanged()

    }

    private fun generateData(): ArrayList<Order> {
        val result = ArrayList<Order>()

        for (i in 0..9) {
            val order= Order("Name $i", "Address" , "22/4/1997")
            result.add(order)
        }

        return result
    }
}
