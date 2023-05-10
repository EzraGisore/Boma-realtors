package com.example.bomarealtors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var scoutbtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        scoutbtn = findViewById(R.id.scout_btn)

        scoutbtn.setOnClickListener {
            var gotogoal = Intent(this, goal::class.java)
            startActivity(gotogoal)
            finish()
        }

    }
}
