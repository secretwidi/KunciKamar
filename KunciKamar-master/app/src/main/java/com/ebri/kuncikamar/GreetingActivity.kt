package com.ebri.kuncikamar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView

class GreetingActivity : AppCompatActivity() {

    lateinit var login: TextView
    lateinit var fb: CardView
    lateinit var up: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)

        login = findViewById(R.id.login)
        login.setOnClickListener {
            val login = Intent(this, LoginActivity::class.java)
            startActivity(login)
        }
        fb = findViewById(R.id.fb_in)
        fb.setOnClickListener {
            val fb = Intent(this, FacebookActivity::class.java)
            startActivity(fb)
        }
        up = findViewById(R.id.signup)
        up.setOnClickListener {
            val fb = Intent(this, BuatAkunActivity::class.java)
            startActivity(fb)
        }
    }
}