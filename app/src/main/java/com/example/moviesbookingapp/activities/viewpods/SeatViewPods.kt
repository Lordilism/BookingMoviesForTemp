package com.example.moviesbookingapp.activities.viewpods

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviesbookingapp.activities.adapters.SeatAdapter
import kotlinx.android.synthetic.main.viewpod_seat.view.*

class SeatViewPods @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : RelativeLayout(context, attrs) {
    lateinit var mSeatAdapter :SeatAdapter
    override fun onFinishInflate() {
        setUpSeatRecyclerview()
        super.onFinishInflate()

    }
    fun setUpSeatViewPod(tvPrice: String,tvRowOne: String,tvRowTwo:String){
         tvPriceFromSeatSelect.text = tvPrice
        tvRow.text = tvRowOne
        tvRowEnd.text = tvRowOne
        tvRowTwoFromSeatSelect.text = tvRowTwo
        tvRowTwoEnd.text = tvRowTwo



    }


    private fun setUpSeatRecyclerview() {
        mSeatAdapter = SeatAdapter()
        rvSeatRowOne.adapter = mSeatAdapter
        rvSeatRowOne.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)

        rvSeatRowOneEnd.adapter = mSeatAdapter
        rvSeatRowOneEnd.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)

        rvSeatRowTwo.adapter = mSeatAdapter
        rvSeatRowTwo.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)

        rvSeatRowTwoEnd.adapter = mSeatAdapter
        rvSeatRowTwoEnd.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
    }

}