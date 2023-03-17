package com.example.moviesbookingapp.activities.delegates

import android.content.Intent

interface MoviesDelegate {
    fun onTapMovies(name:String,rating:String,type:String)
}