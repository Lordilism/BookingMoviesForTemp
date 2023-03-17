package com.example.moviesbookingapp.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moviesbookingapp.R
import kotlinx.android.synthetic.main.activity_get_otpactivity.*

class GetOTPActivity : AppCompatActivity() {
    companion object{
        fun newIntent(context: Context): Intent {
            return Intent(context,GetOTPActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_otpactivity)
        navigateToPickLocation()
    }

    private fun navigateToPickLocation() {
        btnConfirmOTP.setOnClickListener {
            startActivity(PickLocationActivity.newIntent(this))
        }
    }
}