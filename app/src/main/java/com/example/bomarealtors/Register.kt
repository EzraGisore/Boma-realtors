package com.example.bomarealtors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class Register : AppCompatActivity() {
    lateinit var namereg: EditText
    lateinit var emailreg: EditText
    lateinit var passreg: EditText
    lateinit var crebtn: Button
    lateinit var logreg:TextView
    //Initialize firebase
    lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        namereg = findViewById(R.id.name_reg)
        emailreg = findViewById(R.id.email_reg)
        passreg = findViewById(R.id.pass_reg)
        crebtn = findViewById(R.id.cre_btn)
        logreg = findViewById(R.id.log_reg)

        //Initialize firebase again
        auth = FirebaseAuth.getInstance()

        crebtn.setOnClickListener {
            var name_r = namereg.text.toString().trim()
            var email_r = emailreg.text.toString().trim()
            var pass_r = passreg.text.toString().trim()
            //Validate entries
            if (name_r.isEmpty()||email_r.isEmpty()||pass_r.isEmpty()){
                Toast.makeText(this, "Invalid Entry!", Toast.LENGTH_SHORT).show()
            }else{
                auth.createUserWithEmailAndPassword(email_r, pass_r).addOnCompleteListener(this){
                    if(it.isSuccessful){
                        Toast.makeText(this, "User Created Successfully", Toast.LENGTH_SHORT).show()
                        var gotolog = Intent(this, login::class.java)
                        startActivity(gotolog)
                        finish()
                    }else{
                        Toast.makeText(this, "Failed to Create Account.", Toast.LENGTH_SHORT).show()
                    }
                }
            }

        }
        logreg.setOnClickListener {
            var gotolog = Intent(this, login::class.java)
            startActivity(gotolog)
            finish()
        }
    }
}