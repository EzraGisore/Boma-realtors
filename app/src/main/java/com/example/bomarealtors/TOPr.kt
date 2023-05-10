package com.example.bomarealtors

import android.content.Intent
import android.hardware.usb.UsbInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class TOPr : AppCompatActivity() {
    lateinit var frameTOP:FrameLayout
    lateinit var logoTOP:ImageView
    lateinit var typeq:TextView
    lateinit var radiogroupTOP:RadioGroup
    lateinit var radiores:RadioButton
    lateinit var radioof:RadioButton
    lateinit var radiocom:RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topr)
        frameTOP = findViewById(R.id.frame_TOP)
        logoTOP = findViewById(R.id.logo_TOP)
        typeq = findViewById(R.id.type_q)
        radiogroupTOP = findViewById(R.id.radioGroup_TOP)
        radiores = findViewById(R.id.radio_res)
        radioof = findViewById(R.id.radio_of)
        radiocom = findViewById(R.id.radio_com)

        radiores.setOnClickListener {
            var gotoresview = Intent(this, view_residential::class.java)
            startActivity(gotoresview)
            finish()
        }
        radioof.setOnClickListener {
            var gotoofview = Intent(this, view_office::class.java)
            startActivity(gotoofview)
            finish()
        }
        radiocom.setOnClickListener {
            var gotocomview = Intent(this, view_commercial::class.java)
            startActivity(gotocomview)
            finish()
        }
    }
}