package com.ebri.kuncikamar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class NewEmailActivity : AppCompatActivity() {

    lateinit var intnt: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_email)
        intnt = findViewById(R.id.mainnext)
        intnt.setOnClickListener{
            val login = Intent(this, FragmentMainActivity::class.java)
            startActivity(login)
        }
    }
    fun back(v: View?){
        onBackPressed()
    }
}
