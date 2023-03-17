package com.example.moviesbookingapp.activities.adapters

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.moviesbookingapp.activities.fragments.CommingSoonFragment
import com.example.moviesbookingapp.activities.fragments.NowShowingFragment

class NSCSAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> {
                val nowShowingFragment = NowShowingFragment()

                return nowShowingFragment
            }
            else -> {
                val commingSoonFragment = CommingSoonFragment()
                return commingSoonFragment
            }
        }
    }
}