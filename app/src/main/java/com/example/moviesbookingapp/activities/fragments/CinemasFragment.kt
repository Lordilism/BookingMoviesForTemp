package com.example.moviesbookingapp.activities.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviesbookingapp.R
import com.example.moviesbookingapp.activities.TicketDetailsActivity
import com.example.moviesbookingapp.activities.adapters.CinemaDetailsAdapter
import com.example.moviesbookingapp.activities.delegates.DateDelegate
import kotlinx.android.synthetic.main.fragment_cinemas.view.*


class CinemasFragment : Fragment(),DateDelegate {

     lateinit var mCinemaDetailsAdapter : CinemaDetailsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cinemas, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val context = this.context ?:null
        mCinemaDetailsAdapter = CinemaDetailsAdapter(false,this, this.requireActivity().applicationContext)
        view.rvFromCinemaFragment.adapter = mCinemaDetailsAdapter
        view.rvFromCinemaFragment.layoutManager = LinearLayoutManager(this.context,LinearLayoutManager.VERTICAL,false)
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onTapDate() {

    }

    override fun onTapDetails() {
        startActivity(this.context?.let { TicketDetailsActivity.newIntent(it) })
    }


}