package com.example.moviesbookingapp.activities.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesbookingapp.activities.delegates.DateDelegate

class ShowTimeViewHolder(itemView: View, val delegate: DateDelegate) :
    RecyclerView.ViewHolder(itemView) {
    init {
        itemView.setOnClickListener {

            delegate.onTapDate()

        }
    }
}