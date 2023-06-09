package com.example.bomarealtors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth


class login : AppCompatActivity() {
    lateinit var email_log: EditText
    lateinit var pass_log: EditText
    lateinit var log_btn: Button
    lateinit var reg_log: TextView
    lateinit var auth:FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        email_log = findViewById(R.id.email_reg)
        pass_log = findViewById(R.id.pass_reg)
        log_btn = findViewById(R.id.cre_btn)
        reg_log = findViewById(R.id.log_reg)

        auth = FirebaseAuth.getInstance()

        log_btn.setOnClickListener {
            var email_l = email_log.text.toString().trim()
            var pass_l = pass_log.text.toString().trim()

            if(email_l.isEmpty()||pass_l.isEmpty()){
                Toast.makeText(this, "Invalid Entry!", Toast.LENGTH_SHORT).show()
            }else{
                auth.signInWithEmailAndPassword(email_l,pass_l).addOnCompleteListener(this){
                    if (it.isSuccessful){
                        Toast.makeText(this, "Signed in Successfully!", Toast.LENGTH_SHORT).show()
                        var gotomain= Intent(this, MainActivity::class.java)
                        startActivity(gotomain)
                        finish()
                    }else{
                        Toast.makeText(this, "Sign in Attempt Unsuccessful!", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
        reg_log.setOnClickListener {
            var gotoreg= Intent(this, Register::class.java)
            startActivity(gotoreg)
            finish()
        }


    }
}