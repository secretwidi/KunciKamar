package com.ebri.kuncikamar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ebri.kuncikamar.Adapter.PopAdapter
import com.ebri.kuncikamar.Adapter.SPopAdapter
import com.ebri.kuncikamar.DataClassItem.HotelPopular

class TampilkanPopActivity : AppCompatActivity() {

    lateinit var popList: RecyclerView
    var arrHotelPopular3: ArrayList<HotelPopular> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampilkan_pop)

        popList = findViewById(R.id.pop_list)
        popList.layoutManager = LinearLayoutManager(this)
        arrHotelPopular3.add(HotelPopular("AMARTA BEACH - KERAMBITAN", "The property is a 30-minute drive from the Butterfly Park", "425", R.drawable.img_amarta_beach))
        arrHotelPopular3.add(HotelPopular("D'JABU VILLAS - CANGGU", "Featuring an outdoor pool and a garden", "250", R.drawable.img_ddjabu))
        arrHotelPopular3.add(HotelPopular("RANAISSANCE RESORT - ULUWATU", "outdoor swimming pool and a fitness centre", "500", R.drawable.img_renaissance))
        arrHotelPopular3.add(HotelPopular("RIJASA AGUUNG RESORT - PAYANGAN", "Offers an outdoor pool overlooking Mount Batukaru", "128", R.drawable.img_rijasa_agung))
        popList.adapter = SPopAdapter(arrHotelPopular3)


    }
}
