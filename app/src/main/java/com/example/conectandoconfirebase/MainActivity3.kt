package com.example.conectandoconfirebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main2.btnpantalla1
import kotlinx.android.synthetic.main.activity_main2.btnpantalla2
import kotlinx.android.synthetic.main.activity_main2.btnpantalla3
import kotlinx.android.synthetic.main.activity_main2.btnpantalla4
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

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
        personalizarbtn3.setOnClickListener {
            val intent: Intent = Intent(this, MilenioPnt::class.java)
            startActivity(intent)
        }
    }

}