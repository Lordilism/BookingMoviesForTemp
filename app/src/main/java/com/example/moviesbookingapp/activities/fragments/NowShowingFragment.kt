package com.example.moviesbookingapp.activities.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.moviesbookingapp.R
import com.example.moviesbookingapp.activities.MoviesDetailsActivity
import com.example.moviesbookingapp.activities.adapters.NowShowingAdapter
import com.example.moviesbookingapp.activities.delegates.MoviesDelegate
import kotlinx.android.synthetic.main.fragment_now_showing.view.*


class NowShowingFragment : Fragment(), MoviesDelegate {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_now_showing, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.rvMoviesFromNowShowing.adapter = NowShowingAdapter(true, this)

        view.rvMoviesFromNowShowing.layoutManager =
            GridLayoutManager(this.context, 2, GridLayoutManager.VERTICAL, false)


    }


    override fun onTapMovies(name: String, rating: String, type: String) {

        startActivity(this.context?.let {
            MoviesDetailsActivity.newIntent(it).apply {
                putExtra("Movies_Name", name)
                putExtra("Rating_Status", rating)
                putExtra("Type_Cinema", type)
                putExtra("IS_NOW_SHOWING", true)
            }
        })
    }


}