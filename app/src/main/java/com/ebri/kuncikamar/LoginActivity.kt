package com.ebri.kuncikamar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    lateinit var intnt : TextView
    lateinit var intnt2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        intnt = findViewById(R.id.forget)
        intnt.setOnClickListener{
            val login = Intent(this, ForgetActivity::class.java)
            startActivity(login)
        }
        intnt2 = findViewById(R.id.mainnext)
        intnt2.setOnClickListener{
            val login = Intent(this, FragmentMainActivity::class.java)
            startActivity(login)
        }
    }

    fun back(v: View?){
        onBackPressed()
    }
}
