package com.example.moviesbookingapp.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moviesbookingapp.R
import com.example.moviesbookingapp.activities.viewpods.SeatViewPods
import kotlinx.android.synthetic.main.activity_seat_select.*

class SeatSelectActivity : AppCompatActivity() {
    companion object{
        fun newIntent(context:Context): Intent {
            return Intent(context, SeatSelectActivity::class.java)

        }
    }
    lateinit var mVpExecytive: SeatViewPods
    lateinit var mVpPremium : SeatViewPods

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seat_select)

        btnBuyTickets.setOnClickListener {
            setUpbtnBuy()
        }
        setUpViewPod()

    }

    private fun setUpViewPod() {
        mVpExecytive = vpExecutive as SeatViewPods
        mVpExecytive.setUpSeatViewPod("Executive (6500ks)","C","D")

        mVpPremium =vpPremium as SeatViewPods
        mVpPremium.setUpSeatViewPod("Premium (8500ks)","E","F")
    }
    private fun setUpbtnBuy(){
        startActivity(GrabBiteActivity.newIntent(this))
        finish()
    }
}