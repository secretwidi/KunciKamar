package com.ebri.kuncikamar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //delay
        val handler = Handler()


        //delay fun
        handler.post(Runnable {
            //pengaktifan intent
            val intent = Intent(this,FragmentAwalActivity::class.java)
            //intent diaktifkan
            startActivity(intent)
        })
    }
}
