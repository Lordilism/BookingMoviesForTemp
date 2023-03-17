package com.example.moviesbookingapp.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviesbookingapp.R
import com.example.moviesbookingapp.activities.adapters.CinemaDetailsAdapter
import com.example.moviesbookingapp.activities.adapters.DateAdapter
import com.example.moviesbookingapp.activities.delegates.DateDelegate
import kotlinx.android.synthetic.main.activity_date_select.*

class DateSelectActivity : AppCompatActivity(), DateDelegate {
    lateinit var mDateAdapter: DateAdapter
    lateinit var mCinemaDetailsAdapter: CinemaDetailsAdapter
    private var isExpanded = false
    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context,DateSelectActivity::class.java)

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_select)
        NavigateBack()
        setUpDateSelect()
        setUpAboutCinema()
    }

    private fun NavigateBack() {
        btnBackFromDateSelect.setOnClickListener {
            super.onBackPressed()
        }
    }

    private fun setUpAboutCinema() {
        mCinemaDetailsAdapter = CinemaDetailsAdapter(false,this,this)
        rvAboutCinemas.adapter = mCinemaDetailsAdapter
        rvAboutCinemas.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
    }

    private fun setUpDateSelect() {
        mDateAdapter= DateAdapter()
        rvDate.adapter = mDateAdapter
        rvDate.layoutManager= LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)


    }

    override fun onTapDate() {
        startActivity(SeatSelectActivity.newIntent(this))
    }

    override fun onTapDetails() {

    }
}