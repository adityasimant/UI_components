package com.example.ui_components


import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class GreenButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatButton(context, attrs, defStyleAttr) {

    init {
        setBackgroundColor(Color.GREEN)
        text = "Click me"
        setTextColor(Color.BLACK)
    }
}
