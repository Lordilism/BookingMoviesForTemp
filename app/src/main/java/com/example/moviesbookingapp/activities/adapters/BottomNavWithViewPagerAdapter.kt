package com.example.moviesbookingapp.activities.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.moviesbookingapp.activities.fragments.CinemasFragment
import com.example.moviesbookingapp.activities.fragments.MoviesFragment
import com.example.moviesbookingapp.activities.fragments.ProfileFragment
import com.example.moviesbookingapp.activities.fragments.TicketsFragment

class BottomNavWithViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> MoviesFragment()
            1 -> CinemasFragment()
            2 -> TicketsFragment()
            else -> ProfileFragment()
        }
    }
}
