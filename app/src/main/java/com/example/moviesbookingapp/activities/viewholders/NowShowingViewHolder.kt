package com.example.moviesbookingapp.activities.viewholders

import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesbookingapp.activities.delegates.MoviesDelegate
import kotlinx.android.synthetic.main.viewholder_now_showing.view.*

class NowShowingViewHolder(
    itemView: View,
    var isNowShowing: Boolean,
    private val mDelegateMovies: MoviesDelegate
) :

    RecyclerView.ViewHolder(itemView) {
    init {
        when (isNowShowing) {
            true -> {
                itemView.tvDueDate.visibility = View.GONE
            }
            false -> itemView.tvDueDate.visibility = View.VISIBLE
        }

        itemView.setOnClickListener {
            val name= itemView.tvTitleMovies.text.toString()
            val rating = itemView.tvRating.text.toString()
            val type  = itemView.tvType.text.toString()

            mDelegateMovies.onTapMovies(name,rating,type)
        }
    }


}