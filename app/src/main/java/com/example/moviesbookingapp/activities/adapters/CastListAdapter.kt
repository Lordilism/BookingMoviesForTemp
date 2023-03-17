package com.example.moviesbookingapp.activities.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesbookingapp.R
import com.example.moviesbookingapp.activities.viewholders.CastListViewHolder

class CastListAdapter:RecyclerView.Adapter<CastListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CastListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_cast_list,parent,false)
        return CastListViewHolder(view)

    }

    override fun onBindViewHolder(holder: CastListViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 10
    }
}