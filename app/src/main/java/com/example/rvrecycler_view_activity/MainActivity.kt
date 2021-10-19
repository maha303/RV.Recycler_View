package com.example.rvrecycler_view_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var edName:EditText
    private lateinit var edEmail:EditText
    private lateinit var edPhone:EditText
    private lateinit var edAdress:EditText
    private lateinit var btnSave:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edName=findViewById(R.id.edName)
        edEmail=findViewById(R.id.edEmail)
        edPhone=findViewById(R.id.edPhone)
        edAdress=findViewById(R.id.ediAddress)

        btnSave=findViewById(R.id.btnSave)



        btnSave.setOnClickListener {

            val name=edName.text.toString()
            val email=edEmail.text.toString()
            val phone=edPhone.text.toString()
            val address=edAdress.text.toString()

            val int = Intent(this,MainActivity2::class.java)

            int.putExtra("name",name)
            int.putExtra("email",email)
            int.putExtra("phone",phone)
            int.putExtra("address",address)
            startActivity(int)
        }



    }
}