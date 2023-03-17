package com.example.moviesbookingapp.activities.viewholders

import android.graphics.Color
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.viewholder_seat.view.*

class SeatViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
    init {
        itemview.setOnClickListener {
            itemview.ivSeatFromSeatSelect.setColorFilter(Color.GREEN)
        }


    }


}

