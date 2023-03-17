package com.example.moviesbookingapp.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moviesbookingapp.R
import kotlinx.android.synthetic.main.activity_log_in.*

class LogInActivity : AppCompatActivity() {
    companion object{
        fun newIntent(context: Context):Intent{
            return Intent(context,LogInActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        navigateToOTP()
    }

    private fun navigateToOTP() {
        btnVerifyYourPhoneNumber.setOnClickListener {
            startActivity(GetOTPActivity.newIntent(this))
        }

    }
}