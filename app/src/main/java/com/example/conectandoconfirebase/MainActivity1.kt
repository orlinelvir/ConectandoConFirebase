package com.example.conectandoconfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main1.*
import kotlinx.android.synthetic.main.activity_main2.btnpantalla1
import kotlinx.android.synthetic.main.activity_main2.btnpantalla2
import kotlinx.android.synthetic.main.activity_main2.btnpantalla3
import kotlinx.android.synthetic.main.activity_main2.btnpantalla4


class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        btnpantalla1.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity1::class.java)
            startActivity(intent)
        }
        btnpantalla2.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        btnpantalla3.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        btnpantalla4.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
        personalizarbtn1.setOnClickListener {
            val intent: Intent = Intent(this, ChronosPnt::class.java)
            startActivity(intent)
        }
    }
}