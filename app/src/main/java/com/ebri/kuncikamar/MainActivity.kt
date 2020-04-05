package com.ebri.kuncikamar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //delay
        val handler = Handler()


        //delay fun
        handler.postDelayed(Runnable {
            //pengaktifan intent
            val intent = Intent(this, GreetingActivity::class.java)
            //intent diaktifkan
            startActivity(intent)
        }, 3000)
    }
}
