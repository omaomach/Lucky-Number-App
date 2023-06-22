package com.omao.luckynumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class LuckyNumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lucky_number)

        val tv2: TextView = findViewById(R.id.tv2)
        val luckNumText: TextView = findViewById(R.id.luckNumText)
        val shareBtn: Button = findViewById(R.id.shareBtn)

        var userName = receiveUserName()
        Toast.makeText(this, ""+userName, Toast.LENGTH_LONG).show()

    }

    fun receiveUserName(): String {
        var bundle: Bundle? = intent.extras
        var userName = bundle?.get("name").toString()
        return userName
    }

}

