package com.example.myapplication

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


/**RecyclerView 基础适配器
 *
 *
 *
 *
 *
 *
 *
 * */
class RecyclerSuperAdapter<T>(context: Context, private val layoutId:Int
                              ,private val items:List<T>,val init:(View,T)-> Unit)
    :RecyclerBaseAdapter<RecyclerSuperAdapter.ItemHolder<T>>(context)
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view:View = inflater.inflate(layoutId,parent,false)
        return ItemHolder<T>(view,init)
    }

    override fun getItemCount(): Int =items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val vh: ItemHolder<T> = holder as ItemHolder<T>
        vh.bind(items.get(position))
        vh.view.setOnLongClickListener{itemLongClickListener.invoke(vh.view,position);true}
        vh.view.setOnClickListener{itemClickListener.invoke(vh.view,position)}
    }
     class ItemHolder<in T>(val view:View,val init: (View, T) -> Unit): RecyclerView.ViewHolder(view){
        fun bind(item: T){
            init(view,item)
        }
    }
}