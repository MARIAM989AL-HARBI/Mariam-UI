package com.example.mariam_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_instagram.*

class Facebook : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facebook)
        arrow_back_i.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}