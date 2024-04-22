package com.example.myhelloandoridapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.myhelloandoridapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // textView instance
        val textView = TextView(this)

        // set text and properties of textview
        textView.text = "Hello Android"
        textView.textSize = 24f
        textView.setTextColor(ContextCompat.getColor(this, android.R.color.black))

        // set textView as content view
        setContentView(textView)
        }
    }

