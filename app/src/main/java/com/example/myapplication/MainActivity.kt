package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.TransitionManager
import android.util.Log
import android.view.View
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintSet
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*
import java.text.SimpleDateFormat
import org.jetbrains.anko.alert


class MainActivity : AppCompatActivity() {
    private var ismoved = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var arr = listOf("1","2", "3", "4", "5")

        text1.text = "1111111111111"

        button2.setOnClickListener {
            /**anko库提供了intentFor方法用户简单生成intent对象*/
//            val intent = intentFor<Main2Activity>()

            /**anko  activity跳转写法*/
            startActivity<Main2Activity>()
            //弹出对话框anko写法，items表示单选形式的对话框
//            alert {
//                title = "asdf"
//                items(arr) { dialog, item, index -> toast(item.toString())}
//                positiveButton("取消") {}
//
//            }.show()
            //弹出对话框也可以这样写
//            selector("yige",arr){dialogInterface, i ->
//                toast(i.toString())
//            }
                /**kotlin常规对话框写法*/
//            AlertDialog.Builder(this)
//                .setItems(arr){}
//                .setTitle("asdf")
//                .setPositiveButton("sadf"){}
//        }
        }
    }
    /**从下一个页面返回数据时的回调方法*/
//        override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//            super.onActivityResult(requestCode, resultCode, data)
//            if (data != null) {
//                text1.text = data!!.extras.getString("name")
//            }
//        }
    }