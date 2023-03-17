package com.example.moviesbookingapp.activities.adapters

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.moviesbookingapp.R
import com.example.moviesbookingapp.activities.dummy.Cities
import kotlinx.android.synthetic.main.list_item.view.*

class CitiesListAdapter(private val context: Activity, private val arrayList: ArrayList<Cities>) :
    ArrayAdapter<Cities>(
        context,
        R.layout.list_item, arrayList
    ) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        view.tvCitiesName.text =
            arrayList[position].cityName

        return view
    }
}