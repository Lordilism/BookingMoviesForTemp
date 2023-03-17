package com.example.moviesbookingapp.activities.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.example.moviesbookingapp.R
import com.example.moviesbookingapp.activities.fragments.MoviesFragment

class AdapterBanner(private val fragment: MoviesFragment): PagerAdapter() {
    override fun getCount(): Int {
        return 3
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view==`object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view =LayoutInflater.from(fragment.context).inflate(R.layout.view_item_banner,container,false)
        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)

    }
}