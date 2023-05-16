package com.example.e_commerce_app

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.Toast
import android.widget.VideoView

class Ecommerce_splash : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ecommerce_splash)
        val videoPath = "android.resource://"+packageName+"/"+R.raw.splashvideo
        val uri = Uri.parse(videoPath)
        var videoView = findViewById<VideoView>(R.id.videoView1)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.setOnCompletionListener {
            Toast.makeText(this,"Your order is placed successfully", Toast.LENGTH_SHORT).show()
        }
        videoView.start()

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this,E_commercer_registration::class.java)
            startActivity(intent)
            finish()
        },7000)

        //skip button
        val skipButton = findViewById<Button>(R.id.skitbut)
        skipButton.visibility = View.INVISIBLE
        val handler = Handler()
        handler.postDelayed({
            skipButton.visibility = View.VISIBLE
        }, 3000)

        skipButton.setOnClickListener(){
            val intent = Intent(this , E_commercer_registration::class.java)
            startActivity(intent)
        }

    }
}