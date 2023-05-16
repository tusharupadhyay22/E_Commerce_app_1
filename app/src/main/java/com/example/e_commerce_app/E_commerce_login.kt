package com.example.e_commerce_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.e_commerce_app.databinding.ActivityEcommerceLoginBinding
import com.google.firebase.auth.FirebaseAuth

class E_commerce_login : AppCompatActivity() {

    private lateinit var binding: ActivityEcommerceLoginBinding
    private lateinit var firebaseAuth : FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEcommerceLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //go to registration
        var signupRedirectText = findViewById<TextView>(R.id.signupRedirectText)
        signupRedirectText.setOnClickListener(){
            val intent = Intent(this , E_commercer_registration::class.java)
            startActivity(intent)
        }

        var safe = findViewById<Button>(R.id.safe)
        safe.setOnClickListener(){
            val intent = Intent(this , Ecommerce_ProductsList::class.java)
            startActivity(intent)

        }

        firebaseAuth = FirebaseAuth.getInstance()

        binding.loginbut.setOnClickListener(){
            val email = binding.emaillogin.text.toString()
            val password = binding.passlogin.text.toString()

            if(email.isNotEmpty() && password.isNotEmpty()){
                firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener{
                    if(it.isSuccessful){
                        val intent = Intent(this , MainActivity::class.java)
                        startActivity(intent)
                    }else{
                        Toast.makeText(this , it.exception.toString(),Toast.LENGTH_SHORT).show()
                    }
                }
            }else
            {
                Toast.makeText(this , "Field cannot be empty",Toast.LENGTH_LONG).show()
            }
        }

    }
}