package com.example.mylibrary

import android.content.Context
import android.widget.Toast

class ToastMessage {
    fun showToastMessage(context: Context,message:String){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
    }
}