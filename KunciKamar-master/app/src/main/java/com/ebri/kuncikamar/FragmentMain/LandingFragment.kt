package com.ebri.kuncikamar.FragmentMain


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.GridView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.OrientationHelper
import androidx.recyclerview.widget.RecyclerView
import com.ebri.kuncikamar.Adapter.LuxeAdapter
import com.ebri.kuncikamar.Adapter.PopAdapter
import com.ebri.kuncikamar.BuatAkunActivity
import com.ebri.kuncikamar.DataClassItem.HotelLuxury
import com.ebri.kuncikamar.DataClassItem.HotelPopular

import com.ebri.kuncikamar.R
import com.ebri.kuncikamar.TampilkanPopActivity
import kotlinx.android.synthetic.main.activity_tampilkan_pop.*
import kotlinx.android.synthetic.main.luxury_item.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class LandingFragment : Fragment() {
//    Near Hotel
//    Popular Hotel
    lateinit var up: CardView
    lateinit var gridView: RecyclerView
    lateinit var gridView2: RecyclerView
    lateinit var popList: RecyclerView
    var arrHotelPopular: ArrayList<HotelPopular> = ArrayList()
    var arrHotelPopular2: ArrayList<HotelPopular> = ArrayList()
    var arrHotelPopular3: ArrayList<HotelPopular> = ArrayList()
//    Luxe Hotel
    lateinit var recyclerView: RecyclerView
    var arrHotelLuxury: ArrayList<HotelLuxury> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_landing, container, false)

        up = view.findViewById(R.id.show1)
        up.setOnClickListener {
            val fb = Intent(activity, TampilkanPopActivity::class.java)
            startActivity(fb)
        }
    //    Near Hotel

    //    Popular Hotel
        gridView = view.findViewById(R.id.grid_popular)
        gridView.layoutManager = GridLayoutManager(activity, 2)
        arrHotelPopular.add(HotelPopular("AMARTA BEACH - KERAMBITAN", "The property is a 30-minute drive from the Butterfly Park", "425", R.drawable.img_amarta_beach))
        arrHotelPopular.add(HotelPopular("D'JABU VILLAS - CANGGU", "Featuring an outdoor pool and a garden", "250", R.drawable.img_ddjabu))
        gridView.adapter = PopAdapter( activity, arrHotelPopular)

        gridView2 = view.findViewById(R.id.grid_popular2)
        gridView2.layoutManager = GridLayoutManager(activity, 2)
        arrHotelPopular2.add(HotelPopular("RANAISSANCE RESORT - ULUWATU", "outdoor swimming pool and a fitness centre", "500", R.drawable.img_renaissance))
        arrHotelPopular2.add(HotelPopular("RIJASA AGUUNG RESORT - PAYANGAN", "Offers an outdoor pool overlooking Mount Batukaru", "128", R.drawable.img_rijasa_agung))
        gridView2.adapter = PopAdapter( activity, arrHotelPopular2)
    //    Luxe Hotel
        recyclerView = view.findViewById(R.id.luxe_list)
        recyclerView.layoutManager = LinearLayoutManager(activity, OrientationHelper.HORIZONTAL, false)
        arrHotelLuxury.add(HotelLuxury( "JAKARTA","DoubleTree by Hilton • Asia's Leading City Resort",  "3800", R.drawable.img_doubletree))
        arrHotelLuxury.add(HotelLuxury( "BALI","Four Seasons Resort Bali • Asia's Leading Honeymoon Resort",  "4200", R.drawable.img_fourseason))
        recyclerView.adapter = LuxeAdapter( activity, arrHotelLuxury)
    // Tampilkan Pop

        return view
    }
    companion object {
        fun newInstance(): LandingFragment {
            val fragment = LandingFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}
