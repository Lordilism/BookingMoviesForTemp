package com.example.moviesbookingapp.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.moviesbookingapp.R
import com.example.moviesbookingapp.activities.adapters.FoodAdapter
import com.example.moviesbookingapp.activities.dummy.dummyFoodList
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.activity_grab_bite.*

class GrabBiteActivity : AppCompatActivity() {
    lateinit var mFoodAdapter: FoodAdapter

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, GrabBiteActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grab_bite)
        btnSkip()
        setUpFoodTab()
        setUpGrabFoodRecyclerView()
        setUpSheet()

    }

    private fun setUpSheet() {
        val sheet = BottomSheetBehavior.from(bottomSheet)
        sheet.peekHeight = 0
        sheet.isHideable = true

        bottomSheetIndicator.setOnClickListener {
            when {
                sheet.state != BottomSheetBehavior.STATE_EXPANDED -> {
                    sheet.state = BottomSheetBehavior.STATE_EXPANDED
                    bottomSheetIndicator.rotation = 180F

                }
                else -> {
                    sheet.state = BottomSheetBehavior.STATE_COLLAPSED
                    bottomSheetIndicator.rotation = 0F
                }

            }

        }
    }

    private fun setUpFoodTab() {
        dummyFoodList.forEach {
            tabLayoutGrabBite.newTab().apply {
                text = it
                tabLayoutGrabBite.addTab(this)
            }
        }
    }

    private fun setUpGrabFoodRecyclerView() {
        mFoodAdapter = FoodAdapter()
        rvGrabFood.adapter = mFoodAdapter
        rvGrabFood.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)


    }

    private fun btnSkip() {
        tvSkip.setOnClickListener {
            startActivity(CheckOutActivity.newIntent(this, false))
            finish()
        }
    }
}