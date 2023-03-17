package com.example.moviesbookingapp.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.moviesbookingapp.R
import com.example.moviesbookingapp.activities.adapters.CitiesListAdapter
import com.example.moviesbookingapp.activities.dummy.Cities
import kotlinx.android.synthetic.main.activity_pick_location.*

class PickLocationActivity : AppCompatActivity() {
    private lateinit var mCities: ArrayList<Cities>

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, PickLocationActivity::class.java)

        }


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pick_location)

        setUpListCities()

    }

    private fun setUpListCities() {
        val name = arrayOf(
            "Yangon", "Mandalay", "Naypyitaw", "Bago", "Mawlamyine"
        )

        mCities = ArrayList()
        for (i in name.indices) {
            val citiesName = Cities(name[i])
            mCities.add(citiesName)
        }
        listViewCities.isClickable = true

        listViewCities.adapter = CitiesListAdapter(this, mCities)
        listViewCities.setOnItemClickListener { parent, view, position, id ->
            val name = name[position]

//            intent.putExtra("CITY_NAME",name)
            startActivity(HomeActivity.newIntent(this).putExtra("CITY_NAME",name))
        }
    }
}