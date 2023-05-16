package com.example.e_commerce_app

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.widget.VideoView
import androidx.core.app.NotificationCompat

class Ecommerce_orderConfirm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ecommerce_order_confirm)

        val videoPath = "android.resource://"+packageName+"/"+R.raw.checkoutvideo
        val uri = Uri.parse(videoPath)
        var videoView = findViewById<VideoView>(R.id.videoView)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.setOnCompletionListener {
            Toast.makeText(this,"Your order is placed successfully", Toast.LENGTH_SHORT).show()
        }
        videoView.start()


        //getting value from checkout page
        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val fullAddress = intent.getStringExtra("fullAddress")
        val pinCode = intent.getStringExtra("pinCode")
        val phoneNumber = intent.getStringExtra("phoneNumber")

        // Set the values to the TextView views
        val nameTextView: TextView = findViewById(R.id.name2)
        nameTextView.text = "NAME"+" "+ name

        val emailTextView: TextView = findViewById(R.id.email2)
        emailTextView.text = "EMAIl" +" "+email

        val fullAddressTextView: TextView = findViewById(R.id.fulladdress2)
        fullAddressTextView.text = "ADDDRESS"+ " "+fullAddress

        val pinCodeTextView: TextView = findViewById(R.id.pincode2)
        pinCodeTextView.text = "PIN CODE" +" "+pinCode

        val phoneNumberTextView: TextView = findViewById(R.id.phonenumber2)
        phoneNumberTextView.text = "PHONE NUMBER"+" "+phoneNumber

        //notifcation


        }


    }
