package com.example.moviesbookingapp.activities.viewholders

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesbookingapp.activities.adapters.ShowTimeAdapter
import com.example.moviesbookingapp.activities.delegates.DateDelegate
import kotlinx.android.synthetic.main.viewholder_cinema_details.view.*

class CinemaDetailsViewHolder(itemView: View, var isExpanded: Boolean, val context: Context,val delegate: DateDelegate) : RecyclerView.ViewHolder(itemView) {
    init {
        isExpanded = false
        itemView.rlHideView.visibility = View.GONE
          setUpRecyclerViewTime()
        itemView.setOnClickListener {
            setUpVisibilityOfLayout()
        }
        itemView.tvSeeDetals.setOnClickListener {
            delegate.onTapDetails()
        }

    }

    private fun setUpRecyclerViewTime() {
        itemView.rvCinemaShowdate.adapter = ShowTimeAdapter(delegate)
        itemView.rvCinemaShowdate.layoutManager = GridLayoutManager(this.context,3,GridLayoutManager.VERTICAL,false)
    }

    private fun setUpVisibilityOfLayout() {
         isExpanded = !isExpanded
        itemView.apply {
            rlHideView.visibility = if (isExpanded) View.VISIBLE else View.GONE

        }

    }


}