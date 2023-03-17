package com.example.moviesbookingapp.activities.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesbookingapp.R
import com.example.moviesbookingapp.activities.delegates.MoviesDelegate
import com.example.moviesbookingapp.activities.viewholders.NowShowingViewHolder
import kotlinx.android.synthetic.main.viewholder_now_showing.view.*

class NowShowingAdapter(val isNowShowwing:Boolean,private val mDelegateMovies:MoviesDelegate) : RecyclerView.Adapter<NowShowingViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NowShowingViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.viewholder_now_showing, parent, false)
        return NowShowingViewHolder(view,isNowShowwing,mDelegateMovies)

    }


    override fun getItemCount(): Int {
        return 12
    }

    override fun onBindViewHolder(holder: NowShowingViewHolder, position: Int) {

    }
}