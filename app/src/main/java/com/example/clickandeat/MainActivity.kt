package com.example.clickandeat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var etEmail:EditText
    lateinit var etPassword: EditText
    lateinit var btnLogin: Button
    lateinit var btnSignUp1:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etEmail=findViewById(R.id.etEmail)
        etPassword=findViewById(R.id.etPassword)
        btnLogin=findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener {
            Toast.makeText(baseContext, "Loading...", Toast.LENGTH_LONG).show()
        }
        btnSignUp1=findViewById(R.id.btnSignUp1)
        btnSignUp1.setOnClickListener {
            var intent2= Intent(baseContext,CreateAccount::class.java)
            startActivity(intent2)
        }

    }
}