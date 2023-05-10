package com.example.bomarealtors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.TextView

class goal : AppCompatActivity(){
    lateinit var framegoal:FrameLayout
    lateinit var logogoal:ImageView
    lateinit var goalq:TextView
    lateinit var buy_r:RadioButton
    lateinit var sell_r:RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_goal)
        framegoal = findViewById(R.id.frame_goal)
        logogoal = findViewById(R.id.logo_goal)
        goalq = findViewById(R.id.goal_q)
        buy_r = findViewById(R.id.radio_buy)
        sell_r = findViewById(R.id.radio_sell)

        buy_r.setOnClickListener {
            var gototopr = Intent(this, TOPr::class.java)
            startActivity(gototopr)
            finish()
        }
        sell_r.setOnClickListener {
            var gototoprs = Intent(this, topr_sell::class.java)
            startActivity(gototoprs)
            finish()
        }
    }
}