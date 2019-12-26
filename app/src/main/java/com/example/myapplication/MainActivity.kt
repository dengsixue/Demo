package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.TransitionManager
import android.util.Log
import android.view.View
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.RadioGroup
import androidx.constraintlayout.widget.ConstraintSet
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import org.jetbrains.anko.dip


class MainActivity : AppCompatActivity() {
    private var ismoved = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text1.text="111111111111111111卡死了的空间开发是那算了肯定就感觉比1111111111111132222222222222222333333334"


    }
}