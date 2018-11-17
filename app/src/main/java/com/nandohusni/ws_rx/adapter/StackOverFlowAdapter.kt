package com.nandohusni.ws_rx.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nandohusni.ws_rx.R
import kotlinx.android.synthetic.main.itemlist.view.*

class StackOverFlowAdapter(private val data: List<Any>?, private val c: Context) :
    RecyclerView.Adapter<StackOverFlowAdapter.MyHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): MyHolder {
        return MyHolder(LayoutInflater.from(c).inflate(R.layout.itemlist, viewGroup, false)
        )
    }

    override fun onBindViewHolder(myHolder: MyHolder, @SuppressLint("RecyclerView") i: Int) {
        //myHolder.bind(data?.get(i))

       // myHolder.itemView.setOnClickListener { }

    }

    override fun getItemCount(): Int {
        return data?.size!!
    }

    inner class MyHolder(itemViews: View) : RecyclerView.ViewHolder(itemViews) {


       // fun bind(itemsItem: ItemsItem?) {
           // itemView.itemTitle.text = itemsItem?.displayName



    }


}
