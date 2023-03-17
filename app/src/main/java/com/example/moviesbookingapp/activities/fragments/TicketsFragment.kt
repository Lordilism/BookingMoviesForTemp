package com.example.moviesbookingapp.activities.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviesbookingapp.R
import com.example.moviesbookingapp.activities.CheckOutActivity
import com.example.moviesbookingapp.activities.adapters.TicketTabAdapter
import com.example.moviesbookingapp.activities.delegates.TicketDelegate
import com.example.moviesbookingapp.activities.viewholders.TicketTabViewHolder
import kotlinx.android.synthetic.main.fragment_tickets.view.*


class TicketsFragment : Fragment(),TicketDelegate {
    companion object{
        const val IE_TO_CHECKOUT="IE_TO_CHECKOUT"
    }

    lateinit var mTicketTabAdapter: TicketTabAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tickets, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        mTicketTabAdapter = TicketTabAdapter(this)
        view.rvFromTicketTab.adapter= mTicketTabAdapter
        view.rvFromTicketTab.layoutManager = LinearLayoutManager(this.context,LinearLayoutManager.VERTICAL,false)
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onTapTicket() {
        startActivity(this.context?.let { CheckOutActivity.newIntent(it,true) })
    }



}