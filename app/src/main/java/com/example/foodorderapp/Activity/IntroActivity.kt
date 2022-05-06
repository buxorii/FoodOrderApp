package com.example.foodorderapp.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.foodorderapp.R

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val startBtn = findViewById<ConstraintLayout>(R.id.startBtn)
        startBtn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}