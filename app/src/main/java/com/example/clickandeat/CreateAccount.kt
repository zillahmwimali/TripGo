package com.example.clickandeat

import android.content.ComponentCallbacks2
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.*
import com.google.android.material.textfield.TextInputLayout

class CreateAccount : AppCompatActivity() {
    lateinit var etName: EditText
    lateinit var spGender: Spinner
    lateinit var etEmail:EditText
    lateinit var etPhone: EditText
    lateinit var etPassword: EditText
    lateinit var btnLogin2: Button
    lateinit var btnSignUp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)
        castViews()


    }

    fun castViews() {
        etName = findViewById(R.id.etName)
        spGender = findViewById(R.id.spGender)
        etEmail = findViewById(R.id.etEmail)
        etPhone = findViewById(R.id.etPhone)
        etPassword = findViewById(R.id.etPassword)
        btnLogin2=findViewById(R.id.btnLogin2)
        btnSignUp = findViewById(R.id.btnSignUp)

        var genders = arrayOf("Male", "Female", "Other")
        var gendersAdapter =ArrayAdapter(baseContext, android.R.layout.simple_spinner_item, genders)
        gendersAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spGender.adapter = gendersAdapter
        signUp()
    }

    fun signUp() {
        btnSignUp.setOnClickListener {
            var name = etName.text.toString()
            if (name.isEmpty()) {
                etName.setError("Name is required")
            }
            var gender = ""

            var email = etEmail.text.toString()
            if (email.isEmpty()) {
                etEmail.setError("Email is required")
            }
            var phone = etPhone.text.toString()
            if (phone.isEmpty()) {
                etPhone.setError("Input phone number")
            }
            var password = etPassword.text.toString()
            if (password.isEmpty()) {
                etPassword.setError("Input password")
            }
            else if (password.length<8){
                etPassword.setError("Password must be at least 8 characters")
            }
                else if (password.length>16){
                    etPassword.setError("Password must not exceed 18 characters")
            }
                else {
                Toast.makeText(baseContext, "You have successfully created an account!", Toast.LENGTH_LONG).show()
            }
            logIn()

        }
    }
    fun logIn() {
        btnLogin2 = findViewById(R.id.btnLogin2)
        btnLogin2.setOnClickListener {
            var intent1 = Intent(baseContext, MainActivity::class.java)
            startActivity(intent1)
        }
    }
}


