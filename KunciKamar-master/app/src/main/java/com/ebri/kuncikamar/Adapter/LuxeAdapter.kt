package com.ebri.kuncikamar.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.ebri.kuncikamar.DataClassItem.HotelLuxury
import com.ebri.kuncikamar.DataClassItem.HotelPopular
import com.ebri.kuncikamar.R

class LuxeAdapter (val context: FragmentActivity?,var hotelLuxury: ArrayList<HotelLuxury>) : RecyclerView.Adapter<LuxeAdapter.ViewHolder>() {

    class  ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val hotelName: TextView
        val hotelPrice: TextView
        val hotelImage: ImageView

        init {
            this.hotelName = itemView?.findViewById(R.id.hotel_name) as TextView
            this.hotelPrice = itemView.findViewById(R.id.hotel_price) as TextView
            this.hotelImage = itemView.findViewById(R.id.hotel_pic) as ImageView
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.luxury_item, parent, false)

        return ViewHolder(view)
    }
    override fun getItemCount() = hotelLuxury.size
    fun getItem(position: Int): Any {
        return hotelLuxury[position]
    }
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        var hotelLuxury: HotelLuxury = getItem(position) as HotelLuxury

        viewHolder.hotelName.text = hotelLuxury.hotelName
        viewHolder.hotelPrice.text = hotelLuxury.hotelPrice
        viewHolder.hotelImage.setImageResource(hotelLuxury.hotelImage)

    }
}