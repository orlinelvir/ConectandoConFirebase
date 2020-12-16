package com.example.conectandoconfirebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_chronos_pnt.*

class ChronosPnt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chronos_pnt)

        backbtn1.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity1::class.java)
            startActivity(intent)
        }
    }
}