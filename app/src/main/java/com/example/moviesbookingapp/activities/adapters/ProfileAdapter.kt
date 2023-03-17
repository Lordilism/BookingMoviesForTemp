package com.example.moviesbookingapp.activities.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesbookingapp.R
import com.example.moviesbookingapp.activities.viewholders.ProfileViewHolder

class ProfileAdapter: RecyclerView.Adapter<ProfileViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_profile,parent,false)
        return ProfileViewHolder(view)

    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 7
    }
}