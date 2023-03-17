package com.example.moviesbookingapp.activities.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesbookingapp.R
import com.example.moviesbookingapp.activities.viewholders.FoodAndBeverageInsideViewHolder

class FoodAndBeverageInsideAdapter: RecyclerView.Adapter<FoodAndBeverageInsideViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FoodAndBeverageInsideViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_inside_food_and_beverage,parent,false)
        return FoodAndBeverageInsideViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodAndBeverageInsideViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
       return 2
    }
}