package com.example.moviesbookingapp.activities.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.viewholder_food.view.*

class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    init {
        var initialState = true
        itemView.btnAdd.setOnClickListener {
            initialState=!initialState
            it.visibility = View.GONE
        }
    }

}