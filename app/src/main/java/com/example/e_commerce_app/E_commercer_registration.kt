package com.example.e_commerce_app

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import com.example.e_commerce_app.databinding.ActivityEcommercerRegistrationBinding
import com.google.firebase.auth.FirebaseAuth
import java.util.Calendar

class E_commercer_registration : AppCompatActivity() {

    private lateinit var binding : ActivityEcommercerRegistrationBinding
    private lateinit var firebaseAuth : FirebaseAuth


    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEcommercerRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.registerbut.setOnClickListener(){
            val email = binding.emailregister.text.toString()
            val password = binding.passregister.text.toString()

            if(email.isNotEmpty() && password.isNotEmpty()){
                firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener{
                    if(it.isSuccessful){
                        val intent = Intent(this , E_commerce_login::class.java)
                        startActivity(intent)
                    }
                    else{
                        Toast.makeText(this , it.exception.toString(), Toast.LENGTH_SHORT).show()
                    }
                }
            }
            else{
                Toast.makeText(this , "Fields cannot be empty", Toast.LENGTH_SHORT).show()

            }
        }
        binding.loginRedirectText.setOnClickListener{
            val loginIntent = Intent(this , E_commerce_login::class.java)
            startActivity(loginIntent)
        }


        //date seletion






    }
}