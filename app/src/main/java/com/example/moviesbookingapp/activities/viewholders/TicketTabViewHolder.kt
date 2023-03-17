package com.example.moviesbookingapp.activities.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesbookingapp.activities.delegates.TicketDelegate

class TicketTabViewHolder(itemView: View,ticketDelegate: TicketDelegate) : RecyclerView.ViewHolder(itemView) {
    init {
        itemView.setOnClickListener {
            ticketDelegate.onTapTicket()
        }
    }
}