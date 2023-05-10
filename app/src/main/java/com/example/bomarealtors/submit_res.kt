package com.example.bomarealtors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class submit_res : AppCompatActivity() {
    lateinit var s_name:EditText
    lateinit var s_email:EditText
    lateinit var s_phone:EditText
    lateinit var s_res:EditText
    lateinit var s_rooms:EditText
    lateinit var s_price:EditText
    lateinit var s_address:EditText
    lateinit var s_upl_btn:Button
    lateinit var s_back:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submit_res)
        s_name = findViewById(R.id.name_s)
        s_email = findViewById(R.id.email_s)
        s_phone = findViewById(R.id.phone_s)
        s_res = findViewById(R.id.res_s)
        s_rooms = findViewById(R.id.room_s)
        s_price = findViewById(R.id.price_s)
        s_address = findViewById(R.id.address_s)
        s_upl_btn = findViewById(R.id.btn_upl)
        s_back = findViewById(R.id.back_btn_res_s)

        s_upl_btn.setOnClickListener {
            if ()

        }
        s_back.setOnClickListener {
            var gototoprs = Intent(this, topr_sell::class.java)
            startActivity(gototoprs)
            finish()
        }
    }
}