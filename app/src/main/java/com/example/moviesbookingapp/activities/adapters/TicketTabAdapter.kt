package com.example.moviesbookingapp.activities.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesbookingapp.R
import com.example.moviesbookingapp.activities.delegates.TicketDelegate
import com.example.moviesbookingapp.activities.viewholders.TicketTabViewHolder

class TicketTabAdapter(val ticketDelegate: TicketDelegate):RecyclerView.Adapter<TicketTabViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TicketTabViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_ticket_tab,parent,false)
        return TicketTabViewHolder(view,ticketDelegate)
    }

    override fun onBindViewHolder(holder: TicketTabViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }
}