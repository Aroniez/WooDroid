package me.gilo.woodroid.app.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import me.gilo.woodroid.app.R
import me.gilo.woodroid.app.adapter.viewholder.OrderViewHolder
import me.gilo.woodroid.models.Order

class OrderAdapter(private val orders: List<Order>) : RecyclerView.Adapter<OrderViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderViewHolder {
        return OrderViewHolder(
            parent.context,
            LayoutInflater.from(parent.context).inflate(R.layout.single_order_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: OrderViewHolder, position: Int) {
        holder.renderView(orders[position])
    }


    override fun getItemCount(): Int {
        return if (orders.isEmpty()) 0 else orders.size
    }
}
