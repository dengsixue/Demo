package com.example.myapplication

import android.content.Context
import android.os.Parcelable
import android.util.Log
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Animal(var age:Int=0,var str:String) : Parcelable {

}
