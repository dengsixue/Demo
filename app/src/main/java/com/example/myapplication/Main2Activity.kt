package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.toast

class Main2Activity : AppCompatActivity(){


    private var mutableList: MutableList<ListData>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        /**接收序列化对象*/
//        val bundle = intent.extras
//        val str = bundle.getParcelable<Animal>("1")
//        textView1.text="${str.age.toString()}${str.str}"

          /**传递数据给上一个activity*/
//        result.setOnClickListener{
//            val intent=Intent()
//            intent.putExtra("name",editText.text.toString())
//            setResult(0,intent)
//            finish()
//        }

        mutableList= mutableListOf(ListData("asdfg"),
              ListData("21342343"),
              ListData("xncvbv"),
              ListData("23453453"),
              ListData("ghtgu678686"))
//        recyclerView.layoutManager=LinearLayoutManager(this)
//        val adapter = RecyclerLinearAdapter(this, mutableList!!)
//        recyclerView.adapter = adapter

//        adapter.setOnItemClick(Click())
//        adapter.setOnLongItemClick{ RecyclerLinearAdapter.OnItemClickListener? }

//        adapter.setOnItemClickListener { position, item -> toast(item) }
//        adapter.setOnLongItemClickListener { position, item -> toast("您长按了${item}");true }
//        recyclerView.itemAnimator=DefaultItemAnimator()
//        recyclerView.addItemDecoration(DividerItemDecoration(this,1))

//        recyclerView.layoutManager=LinearLayoutManager(this)
//        val adapter = RecyclerClickAdapter(this, mutableList!!)
//        recyclerView.adapter = adapter
//        adapter.setOnItemClickListener { v, posion -> toast("asdf") }
//        adapter.setOnItemLongClickListener { v, posion -> toast("sdfa") }
//        recyclerView.itemAnimator=DefaultItemAnimator()
//        recyclerView.addItemDecoration(DividerItemDecoration(this,1))

        recyclerView.layoutManager=LinearLayoutManager(this)
        val adapter = RecyclerSuperAdapter(this,R.layout.image, mutableList!!
        ) { view, listData ->
            val title = view.findViewById<TextView>(R.id.data)
            title.text=listData.name
        }
        recyclerView.adapter = adapter
        adapter.setOnItemClickListener { v, posion -> toast("asdf") }
        adapter.setOnItemLongClickListener { v, posion -> toast("sdfa") }
        recyclerView.itemAnimator=DefaultItemAnimator()
        recyclerView.addItemDecoration(DividerItemDecoration(this,1))


    }

//    inner class Click:RecyclerLinearAdapter.OnItemClickListener{
//        override fun OnItemClick(view: View, position: Int) {
//            this@Main2Activity.toast(mutableList!![position].name)
//        }
//
//    }
}
