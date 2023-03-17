package com.example.moviesbookingapp.activities.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesbookingapp.R
import com.example.moviesbookingapp.activities.viewholders.FoodAndBeverageViewHolder

class FoodAndBeverageAdapter(val mFoodAndBeverageInsideAdapter: FoodAndBeverageInsideAdapter,val context: Context): RecyclerView.Adapter<FoodAndBeverageViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodAndBeverageViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_food_and_beverage,parent,false)
        return FoodAndBeverageViewHolder(view, mFoodAndBeverageInsideAdapter,context)
    }

    override fun onBindViewHolder(holder: FoodAndBeverageViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
        return 1
    }
}