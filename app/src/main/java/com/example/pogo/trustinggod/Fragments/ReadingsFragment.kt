package com.example.pogo.trustinggod.Fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.pogo.trustinggod.R


/**
 * A simple [Fragment] subclass.
 */
class ReadingsFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_readings, container, false)
    }

}// Required empty public constructor
