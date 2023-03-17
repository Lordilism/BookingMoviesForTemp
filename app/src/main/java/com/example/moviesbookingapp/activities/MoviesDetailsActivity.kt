package com.example.moviesbookingapp.activities

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviesbookingapp.R
import com.example.moviesbookingapp.activities.adapters.CastListAdapter
import kotlinx.android.synthetic.main.activity_cinemas_details.*
import kotlinx.android.synthetic.main.activity_movies_details.*

class MoviesDetailsActivity : AppCompatActivity() {
    lateinit var mCastListAdapter: CastListAdapter


    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, MoviesDetailsActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies_details)

        setVisibilityOfNotify()
        setUpMoviesInfo()
        setUpBackBtn()
        setUpCastRecyclerView()
        navigateToDateSelect()
        setUpVideo()


    }

    private fun setUpVideo() {
        val uri = Uri.parse("android.resource://${packageName}/${R.raw.demo_trailor}")
        vdMovieTrailer.apply {
            setVideoURI(uri)
            requestFocus()
            start()
            canPause()
        }





    }

    override fun onRestart() {
        vdMovieTrailer.resume()
        vdMovieTrailer.start()
        super.onRestart()
    }

    private fun navigateToDateSelect() {
        btnBooking.setOnClickListener {
            startActivity(DateSelectActivity.newIntent(this))

        }
    }

    private fun setUpMoviesInfo() {
        val title = intent.getStringExtra("Movies_Name").toString()
        val rating = intent.getStringExtra("Rating_Status").toString()
        tvMoviesTitleFromDetails.text = title
        tvRatingFromDetails.text = rating
    }

    private fun setUpBackBtn() {
        btnBack.setOnClickListener {

            super.onBackPressed()
        }
    }

    private fun setUpCastRecyclerView() {
        mCastListAdapter = CastListAdapter()
        rvCast.adapter = mCastListAdapter
        rvCast.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    }

    private fun setVisibilityOfNotify() {
        val isNowShowing = intent.getBooleanExtra("IS_NOW_SHOWING", false)
        when (isNowShowing) {
            true -> {
                flNotification.visibility = View.GONE


            }
            else -> {
                flNotification.visibility = View.VISIBLE
                viewGradient.visibility = View.GONE
                btnBooking.visibility = View.GONE
            }
        }
    }
}