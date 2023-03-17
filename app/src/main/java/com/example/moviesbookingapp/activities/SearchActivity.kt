package com.example.moviesbookingapp.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviesbookingapp.R
import com.example.moviesbookingapp.activities.adapters.CinemaDetailsAdapter
import com.example.moviesbookingapp.activities.adapters.NowShowingAdapter
import com.example.moviesbookingapp.activities.delegates.DateDelegate
import com.example.moviesbookingapp.activities.delegates.MoviesDelegate
import com.example.moviesbookingapp.activities.dummy.facilitiesList
import com.example.moviesbookingapp.activities.dummy.formatList
import kotlinx.android.synthetic.main.activity_search.*

class SearchActivity : AppCompatActivity(), MoviesDelegate, DateDelegate {

    companion object {
        const val IE_FROM_CINEMA = "IE_FROM_CINEMA"
        fun newIntent(context: Context, isNow: Boolean): Intent {
            return Intent(context, SearchActivity::class.java).putExtra("Flag", isNow)
        }

        fun newIntent1(context: Context, isFromCinema: Boolean): Intent {
            return Intent(context, SearchActivity::class.java).putExtra(
                IE_FROM_CINEMA,
                isFromCinema
            )
        }

    }

    lateinit var mNowShowingAdapter: NowShowingAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        val isFromCinema = intent.getBooleanExtra(IE_FROM_CINEMA, false)

        searchMovies(isFromCinema)
        setUpListeners(isFromCinema)

        setUpSpinner()


    }

    private fun setUpSpinner() {
        val demoFacilities = ArrayAdapter(
            applicationContext, android.R.layout.simple_spinner_item,
            facilitiesList
        )
        demoFacilities.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinnerFacilities.adapter = demoFacilities

        val demoFormat = ArrayAdapter(
            applicationContext, android.R.layout.simple_spinner_item,
            formatList
        )
        demoFormat.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinnerFormat.adapter = demoFormat
    }

    private fun setUpListeners(isFromCinema: Boolean) {
        when (isFromCinema) {
            true -> {
                llFromCinemaSearch.visibility = View.VISIBLE
                tvPriceRange.visibility = View.VISIBLE
                sliderPrice.visibility = View.VISIBLE
                tvShowTime.visibility = View.VISIBLE
                sliderTime.visibility = View.VISIBLE
                setUpRecyclerViewCinema()
            }
            false -> {
                setupSearchRecyclerView()
            }
        }

    }

    private fun setUpRecyclerViewCinema() {
        rvFromCinemaSearch.adapter = CinemaDetailsAdapter(false, this, this)
        rvFromCinemaSearch.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    private fun setupSearchRecyclerView() {
        val flag = intent.getBooleanExtra("Flag", true)
        mNowShowingAdapter = NowShowingAdapter(flag, this)
        rvSearch.adapter = mNowShowingAdapter
        rvSearch.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
    }

    private fun searchMovies(isFromCinema: Boolean) {

        searchViewMovies.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {

                return when {
                    query?.isEmpty()!! -> {
                        Toast.makeText(this@SearchActivity, "Hello", Toast.LENGTH_SHORT).show()
                        false
                    }

                    else -> {
                        if (isFromCinema) {
                            rvSearch.visibility = View.GONE
                            rvFromCinemaSearch.visibility = View.VISIBLE
                        } else rvSearch.visibility = View.VISIBLE
                        true
                    }
                }

            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return when {
                    newText?.isEmpty()!! -> {
                        rvSearch.visibility = View.GONE
                        rvFromCinemaSearch.visibility = View.GONE
                        true
                    }
                    else -> {
                        false
                    }
                }
            }
        })
    }

    override fun onTapMovies(name: String, rating: String, type: String) {

    }

    override fun onTapDate() {
    }

    override fun onTapDetails() {
        startActivity(TicketDetailsActivity.newIntent(this))
    }
}



