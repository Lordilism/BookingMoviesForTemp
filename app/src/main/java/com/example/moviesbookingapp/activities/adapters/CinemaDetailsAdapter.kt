package com.example.moviesbookingapp.activities.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesbookingapp.R
import com.example.moviesbookingapp.activities.delegates.DateDelegate
import com.example.moviesbookingapp.activities.viewholders.CinemaDetailsViewHolder

class CinemaDetailsAdapter(val isExpanded:Boolean,private val delegate:DateDelegate,val context: Context): RecyclerView.Adapter<CinemaDetailsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CinemaDetailsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_cinema_details,parent,false)
        return CinemaDetailsViewHolder(view,isExpanded,context,delegate)
    }

    override fun onBindViewHolder(holder: CinemaDetailsViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 6
    }
}