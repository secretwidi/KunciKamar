package com.ebri.kuncikamar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class TanggalLahirActivity : AppCompatActivity() {

    lateinit var intnt: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanggal_lahir)
        intnt = findViewById(R.id.mainnext)
        intnt.setOnClickListener{
            val login = Intent(this, NewEmailActivity::class.java)
            startActivity(login)
        }
    }
    fun back(v: View?){
        onBackPressed()
    }
}
