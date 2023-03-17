package com.example.moviesbookingapp.activities

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import androidx.appcompat.app.AppCompatActivity
import com.example.moviesbookingapp.R
import com.example.moviesbookingapp.R.raw.videoplayback
import kotlinx.android.synthetic.main.activity_cinemas_details.*

class TicketDetailsActivity : AppCompatActivity() {
    companion object{
        fun newIntent(context: Context):Intent{
            return Intent(context,TicketDetailsActivity::class.java)

        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cinemas_details)

        setUpCinemaDetailsVideo()

    }

    override fun onStart() {
        playerViewCinemaDetails.stopPlayback()
        super.onStart()
    }

    private fun setUpCinemaDetailsVideo() {
        val mediaController = MediaController(this)
//        playerViewCinemaDetails.setMediaController(mediaController)
//        mediaController.setAnchorView(playerViewCinemaDetails)
        val uri = Uri.parse("android.resource://${packageName}/${R.raw.videoplayback}")
        playerViewCinemaDetails.setVideoURI(uri)
        playerViewCinemaDetails.requestFocus()

        playBtnCinemaDetails.setOnClickListener {
            playBtnCinemaDetails.visibility = View.GONE
            playerViewCinemaDetails.start()
            playerViewCinemaDetails.canPause()
        }




    }
}
