package com.example.moviesbookingapp.activities.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesbookingapp.R
import com.example.moviesbookingapp.activities.viewholders.DateViewHolder

class DateAdapter() : RecyclerView.Adapter<DateViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DateViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.viewholder_date, parent, false)

        return DateViewHolder(view)
    }

    override fun onBindViewHolder(holder: DateViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 14
    }
}