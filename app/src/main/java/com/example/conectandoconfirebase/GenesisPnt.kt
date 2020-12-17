package com.example.conectandoconfirebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_genesis_pnt.*

class GenesisPnt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_genesis_pnt)

        backbtn4.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
    }
}