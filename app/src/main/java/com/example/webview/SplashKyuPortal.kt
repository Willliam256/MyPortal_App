package com.example.webview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashKyuPortal : AppCompatActivity() {
    private val SPLASH_TIME_OUT = 4000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_kyu_portal)

        Handler().postDelayed({
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        },SPLASH_TIME_OUT)
        finish()
    }

}