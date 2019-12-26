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
//            alert {
//                title = "asdf"
//                items(arr) { dialog, item, index -> toast(item.toString())}
//                positiveButton("取消") {}
//
//            }.show()
            selector("yige",arr){dialogInterface, i ->

            }

//            AlertDialog.Builder(this)
//                .setItems(arr){}
//                .setTitle("asdf")
//                .setPositiveButton("sadf"){}
//        }
        }
    }
        override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
            super.onActivityResult(requestCode, resultCode, data)
            if (data != null) {
                text1.text = data!!.extras.getString("name")
            }
        }
    }