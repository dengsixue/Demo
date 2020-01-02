package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.OrientationEventListener
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.jetbrains.anko.toast

class RecyclerLinearAdapter(private val context:Context,private val infos : MutableList<ListData>) : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{
//    private var mListener : ((Int , String) -> Unit)? = null
      private var mListener = {i:Int,s:String -> Unit}
//      var mLongListener={i:Int,s:String -> true}
      private var mLongListener : ((Int , String) -> Boolean)? = null
//    private var mLongListener : ((Int , String) -> Boolean)? = null
//    private var mItemClickListener:OnItemClickListener?=null
//    private var mItemLongClickListener:OnItemLongClickListener?=null
      val inflater : LayoutInflater = LayoutInflater.from(context)

//    interface OnItemClickListener{
//        fun OnItemClick(view: View,position: Int)
//
//    }
//    interface OnItemLongClickListener{
//        fun OnItemLongClick(view: View,position: Int)
//    }
//     fun setOnItemClick(onItemClickListener: OnItemClickListener?){
//         this.mItemClickListener=onItemClickListener
//    }
//    fun setOnLongItemClick(onItemClickListener: OnItemClickListener?){
//        this.mItemClickListener=onItemClickListener
//    }

    fun setOnItemClickListener(mListener : (position : Int, item : String) -> Unit){
        this.mListener = mListener
    }
    fun setOnLongItemClickListener(mLongListener : (position : Int, item : String) -> Boolean){
        this.mLongListener = mLongListener
    }



//     fun setonItemLongClick(onItemLongClick: IItemLongClickListener): Boolean {
//            this.ItemLongClickListener=onItemLongClick
//
////         infos.removeAt(position)
////         notifyDataSetChanged()
//         return false
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view : View  = inflater.inflate(R.layout.image,parent,false)
        return ItemHolder(view)
    }

    inner class ItemHolder(view:View) : RecyclerView.ViewHolder(view){
        var item = view.findViewById<LinearLayout>(R.id.line1)
        var text = view.findViewById<TextView>(R.id.data)
    }

    override fun getItemCount(): Int {
        return  infos.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val vh:ItemHolder = holder as ItemHolder
        vh.text.text = infos[position].name
        var b:Boolean = false
        vh.item.setOnClickListener {
            mListener?.invoke(position, infos[position].name)
        }
        vh.item.setOnLongClickListener {
            mLongListener?.invoke(position,infos[position].name)
            true
        }




//        vh.item.setOnClickListener { mItemClickListener!!.OnItemClick(vh.item,position) }
//        vh.item.setOnLongClickListener { mItemLongClickListener!!.OnItemLongClick(vh.item,position);true}
    }



}