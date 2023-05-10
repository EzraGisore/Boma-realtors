package com.example.bomarealtors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class topr_sell : AppCompatActivity() {
    lateinit var frameTOPs: FrameLayout
    lateinit var logoTOPs: ImageView
    lateinit var typeqs: TextView
    lateinit var radiogroupTOPs: RadioGroup
    lateinit var radioress: RadioButton
    lateinit var radioofs: RadioButton
    lateinit var radiocoms: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topr_sell)
        frameTOPs = findViewById(R.id.frame_TOPs)
        logoTOPs = findViewById(R.id.logo_TOPs)
        typeqs = findViewById(R.id.type_qs)
        radiogroupTOPs = findViewById(R.id.radioGroup_TOPs)
        radioress = findViewById(R.id.radio_res_s)
        radioofs = findViewById(R.id.radio_of_s)
        radiocoms = findViewById(R.id.radio_com_s)

        radioress.setOnClickListener {
            var gotoressub = Intent(this, submit_res::class.java)
            startActivity(gotoressub)
            finish()
        }
        radioofs.setOnClickListener {
            var gotoofsub = Intent(this, submit_off::class.java)
            startActivity(gotoofsub)
            finish()
        }
        radiocoms.setOnClickListener {
            var gotocomsub = Intent(this, submit_com::class.java)
            startActivity(gotocomsub)
            finish()
        }
    }
}