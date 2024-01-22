package com.example.ui_components

import android.content.Context
import android.widget.Toast

class Toaster {
    fun simpleToast(context: Context, message: String){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}