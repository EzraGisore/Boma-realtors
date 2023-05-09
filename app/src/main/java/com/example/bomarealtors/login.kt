package com.example.bomarealtors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        lateinit var email_log: EditText
        lateinit var pass_log: EditText
        lateinit var log_btn: Button
        lateinit var reg_log: TextView

    }
}