package com.example.topnewsmvvmkotlin.ui.splash

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.topnewsmvvmkotlin.R
import com.example.topnewsmvvmkotlin.ui.MainActivity
import java.util.*

class SplashActivity : AppCompatActivity() {

    private var timer = Timer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION + View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        scheduleTask()
    }
    private fun scheduleTask() {
        val intent = Intent(this, MainActivity::class.java)
        val task = object : TimerTask() {
            override fun run() {
                startActivity(intent)
                finish()
            }
        }
        timer.schedule(task, 2_000L)

    }

}