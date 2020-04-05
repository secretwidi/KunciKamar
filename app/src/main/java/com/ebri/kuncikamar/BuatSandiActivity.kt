package com.ebri.kuncikamar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class BuatSandiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buat_sandi)
    }
    fun back(v: View?){
        onBackPressed()
    }
}
