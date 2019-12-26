package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import org.jetbrains.anko.intentFor

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
//        val bundle = intent.extras
//
//        val str = bundle.getParcelable<Animal>("1")
//        textView1.text="${str.age.toString()}${str.str}"

        result.setOnClickListener{
            val intent=Intent()
            intent.putExtra("name",editText.text.toString())
            setResult(0,intent)
            finish()
        }
    }
}
