package com.ebri.kuncikamar.FragmentMain


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.cardview.widget.CardView
import com.ebri.kuncikamar.LandingActivity
import com.ebri.kuncikamar.R


class WhislistFragment : Fragment() {

    lateinit var btnLogin: Button
    lateinit var cardview: CardView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_whislist, container, false)


        btnLogin = view.findViewById(R.id.btn_login)
        btnLogin.setOnClickListener {
            val intent = Intent(activity, LandingActivity::class.java)
            startActivity(intent)
        }

        return view
    }

    companion object {
        fun newInstance(): WhislistFragment {
            val fragment = WhislistFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}

