package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView

/**抽象父类，定义了基础适配器的几个抽象发放，封装了点击监听器
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * */
abstract class RecyclerBaseAdapter<VH : RecyclerView.ViewHolder>(val context:Context)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    var itemClickListener ={v:View,posion:Int->Unit}
    var itemLongClickListener ={v:View,posion:Int->Unit}

    fun setOnItemClickListener(listener: (v:View,posion:Int)->Unit){this.itemClickListener=listener}
    fun setOnItemLongClickListener(listener: (v:View,posion:Int)->Unit){this.itemLongClickListener=listener}

    val inflater : LayoutInflater = LayoutInflater.from(context)
    override abstract fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder
    override abstract fun getItemCount(): Int
    override abstract fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int)
    override fun getItemId(position: Int): Long =position.toLong()
    override fun getItemViewType(position: Int): Int =0
}