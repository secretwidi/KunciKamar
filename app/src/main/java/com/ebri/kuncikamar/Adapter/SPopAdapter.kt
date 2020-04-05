package com.ebri.kuncikamar.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.ebri.kuncikamar.DataClassItem.HotelPopular
import com.ebri.kuncikamar.R

class SPopAdapter (val hotelPopular: ArrayList<HotelPopular>) : RecyclerView.Adapter<SPopAdapter.ViewHolder>() {
    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val hotelName: TextView
        val hotelDesc: TextView
        val hotelPrice: TextView
        val hotelImage: ImageView

        init {
            this.hotelName = itemView.findViewById(R.id.hotel_name) as TextView
            this.hotelDesc = itemView.findViewById(R.id.hotel_desc) as TextView
            this.hotelPrice = itemView.findViewById(R.id.hotel_price) as TextView
            this.hotelImage = itemView.findViewById(R.id.hotel_pic) as ImageView
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.hotelpop_item, parent, false)

        return ViewHolder(view)
    }
    override fun getItemCount() = hotelPopular.size
    fun getItem(position: Int): Any {
        return hotelPopular[position]
    }
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        var hotelPopular: HotelPopular = getItem(position) as HotelPopular

        viewHolder.hotelName.text = hotelPopular.hotelName
        viewHolder.hotelDesc.text = hotelPopular.hotelDesc
        viewHolder.hotelPrice.text = hotelPopular.hotelPrice
        viewHolder.hotelImage.setImageResource(hotelPopular.hotelPic)

    }
}