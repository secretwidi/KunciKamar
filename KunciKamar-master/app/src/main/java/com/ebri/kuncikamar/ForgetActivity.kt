package com.ebri.kuncikamar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ForgetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget)
    }
    fun back(v: View?){
        onBackPressed()
    }
}
