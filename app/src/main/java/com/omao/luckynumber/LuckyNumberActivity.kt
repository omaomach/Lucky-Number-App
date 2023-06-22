package com.omao.luckynumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class LuckyNumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lucky_number)

        val tv2: TextView = findViewById(R.id.tv2)
        val luckNumText: TextView = findViewById(R.id.luckNumText)
        val shareBtn: Button = findViewById(R.id.shareBtn)

        var userName = receiveUserName()
        Toast.makeText(this, ""+userName, Toast.LENGTH_LONG).show()

        var randomNumber = generateRandomNumber()
        luckNumText.text = ""+randomNumber

        shareBtn.setOnClickListener() {
            shareData(userName, randomNumber)
        }

    }

    fun receiveUserName(): String {
        var bundle: Bundle? = intent.extras
        var userName = bundle?.get("name").toString()
        return userName
    }

    // Random Numbers Generator
    fun generateRandomNumber(): Int {
        val random = Random.nextInt(1000)
        return random
    }

    // Sharing the username & number
    fun shareData(userName: String, number: Int) {

        // Implict Intents
        var i = Intent(Intent.ACTION_SEND)
        i.type = "text/plain"
        i.putExtra(Intent.EXTRA_SUBJECT, "$userName is lucky today")
        i.putExtra(Intent.EXTRA_TEXT, "The lucky number is $number")
        startActivity(i)
    }

}

