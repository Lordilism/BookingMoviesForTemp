package com.example.moviesbookingapp.activities.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.moviesbookingapp.activities.fragments.CommingSoonFragment
import com.example.moviesbookingapp.activities.fragments.NowShowingFragment

class NowShowingCommingSoonAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> {
                val nowShowingAdapter = NowShowingFragment()
                return nowShowingAdapter
            }
            else -> {
                val commingSoonFragment = CommingSoonFragment()
                return commingSoonFragment
            }


        }
    }
}