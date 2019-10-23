package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class second : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        secondBotten.setOnClickListener {
            val intent = Intent(this,Therd)
            startActivity(intent)
        }
    }
}
