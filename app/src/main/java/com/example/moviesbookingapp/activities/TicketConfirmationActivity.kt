package com.example.moviesbookingapp.activities

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.moviesbookingapp.R

class TicketConfirmationActivity : AppCompatActivity() {
    companion object{
        fun newIntent(context: Context): Intent {
            return Intent(context,TicketConfirmationActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ticket_confirmation)
        setupSuccessBooking()

    }



    private fun setupSuccessBooking() {
        val builder = AlertDialog.Builder(this,R.style.myFullscreenAlertDialogStyle)
        val inflater = this.layoutInflater
        builder.setView(inflater.inflate(R.layout.booking_success,null,true))
        builder.setCancelable(false)
        val dialog=builder.create()
        dialog.show()
            Handler().postDelayed(Runnable {
                dialog.dismiss()
            },3000)
    }
}