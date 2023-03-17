package com.example.moviesbookingapp.activities

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.moviesbookingapp.R


class LauncherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)
        navigateToLogin()
    }

    private fun navigateToLogin() {
        Handler().postDelayed(Runnable {
            startActivity(LogInActivity.newIntent(this))
            finish()
        }, 3000)

    }
}