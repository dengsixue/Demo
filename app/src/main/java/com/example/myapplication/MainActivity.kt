package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count= intArrayOf(0,1,2,3,4,5,6)

        var animal=Animal(4,"234",this)

        button2.setOnClickListener {
            text1.text = animal.i.toString()
            
        }
    }

//    fun setText():String{
//        var str=""
////        for (i in count.indices){
////                if (i==count.size-1) str="${str}${count[i]}" else str="${str}${count[i]},"
////            }
//
//        return JavaDateUtil.getNowDateTime()
//    }
}
