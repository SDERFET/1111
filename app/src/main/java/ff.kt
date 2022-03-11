package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.SeekBar
import android.widget.SeekBar.*
import android.widget.TextView
import android.widget.SeekBar.OnSeekBarChangeListener as OnSeekBarChangeListener1

class `ff` : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
        val Button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView2)
        Button.setOnClickListener(View.OnClickListener() {
            textView.setText("каталог")
        })
    }
}