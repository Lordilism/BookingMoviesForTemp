package com.example.moviesbookingapp.activities.viewholders

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesbookingapp.activities.adapters.FoodAndBeverageInsideAdapter
import kotlinx.android.synthetic.main.viewholder_food_and_beverage.view.*

class FoodAndBeverageViewHolder(
    itemView: View,
    mFoodAndBeverageInsideAdapter: FoodAndBeverageInsideAdapter,
    context: Context
) : RecyclerView.ViewHolder(itemView) {
    init {

        itemView.rvInsideFoodAndBeverage.adapter =mFoodAndBeverageInsideAdapter
        itemView.rvInsideFoodAndBeverage.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
    }
}