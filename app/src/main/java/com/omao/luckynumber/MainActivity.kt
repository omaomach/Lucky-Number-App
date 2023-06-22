package com.omao.luckynumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn1: Button = findViewById(R.id.btn1)
        var tv1: TextView = findViewById(R.id.tv1)
        var et1: EditText = findViewById(R.id.et1)

        btn1.setOnClickListener() {
            var name = et1.text

            // Explicit Intents
            var i = Intent(this, LuckyNumberActivity::class.java)

            // Passing the user name
            i.putExtra("name", name)

            startActivity(i)

        }

    }
}