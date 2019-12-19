package com.example.myapplication;

import android.app.Application;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaDateUtil {
    public static String getNowDateTime(){
        SimpleDateFormat adf=new SimpleDateFormat("yyyy年MM月dd日HH时mm秒");
        return adf.format(new Date());

    }
}
