package com.example.bomarealtors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase

class submit_res : AppCompatActivity() {
    lateinit var sname:EditText
    lateinit var semail:EditText
    lateinit var sphone:EditText
    lateinit var sres:EditText
    lateinit var srooms:EditText
    lateinit var sprice:EditText
    lateinit var saddress:EditText
    lateinit var supl_btn:Button
    lateinit var sback:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submit_res)
        sname = findViewById(R.id.name_s)
        semail = findViewById(R.id.email_s)
        sphone = findViewById(R.id.phone_s)
        sres = findViewById(R.id.res_s)
        srooms = findViewById(R.id.room_s)
        sprice = findViewById(R.id.price_s)
        saddress = findViewById(R.id.address_s)
        supl_btn = findViewById(R.id.btn_upl)
        sback = findViewById(R.id.back_btn_res_s)
        var database = FirebaseDatabase.getInstance()
        var databaseref = database.getReference("property")



        supl_btn.setOnClickListener {
            var snames = sname.text.toString().trim()
            var semails = semail.text.toString().trim()
            var sphones = sphone.text.toString().trim()
            var sress = sres.text.toString().trim()
            var srooms = srooms.text.toString().trim()
            var sprices = sprice.text.toString().trim()
            var saddresss = saddress.text.toString().trim()



            if(snames.isEmpty()||semails.isEmpty()||sphones.isEmpty()||sress.isEmpty()||srooms.isEmpty()||sprices.isEmpty()||saddresss.isEmpty()){
                Toast.makeText(this, "Invalid Entry!", Toast.LENGTH_SHORT).show()
            }else{
                var s_property = Property(snames,semails,sphones,sress,srooms,sprices,saddresss)
                var ref = FirebaseDatabase.getInstance().getReference().child("property")

                ref.setValue(s_property).addOnCompleteListener {
                    if(it.isSuccessful){
                        Toast.makeText(this, "Data Uploaded successfully!", Toast.LENGTH_SHORT).show()
                    }else{
                        Toast.makeText(this, "Failed to upload car data!", Toast.LENGTH_SHORT).show()
                    }
                }


            }
        }
        sback.setOnClickListener {
            var gototoprs = Intent(this, topr_sell::class.java)
            startActivity(gototoprs)
            finish()
        }
    }
}