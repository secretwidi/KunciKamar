package com.ebri.kuncikamar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_search.*
import kotlinx.android.synthetic.main.card_cari.*
import android.R.attr.animation
import android.os.Handler
import android.widget.RelativeLayout
import androidx.core.os.HandlerCompat.postDelayed



class SearchActivity : AppCompatActivity() {

    lateinit var cardview: RelativeLayout
    lateinit var bottom: Animation
    lateinit var fade: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        cardview = card_cari
        cardview.setBackgroundResource(R.drawable.rounded_all_top)

        fade = AnimationUtils.loadAnimation( this, R.anim.abc_fade_in)
        bottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom)

        card_cari.startAnimation(bottom)

    }
}
