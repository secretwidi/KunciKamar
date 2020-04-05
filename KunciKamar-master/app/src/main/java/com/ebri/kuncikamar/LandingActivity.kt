package com.ebri.kuncikamar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialog




class LandingActivity : AppCompatActivity() {

    lateinit var btnSrch: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)

        btnSrch = findViewById(R.id.btn_carim)
        btnSrch.setOnClickListener {
            val dialog = BottomSheetDialog(this, R.style.SheetDialog)
            val searchView = layoutInflater.inflate(R.layout.activity_search, null)
            dialog.setContentView(searchView)
            dialog.show()
        }
    }
}
