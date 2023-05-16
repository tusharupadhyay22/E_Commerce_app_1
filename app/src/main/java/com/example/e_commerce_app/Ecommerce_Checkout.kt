package com.example.e_commerce_app

import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

import androidx.core.app.NotificationCompat

class Ecommerce_Checkout : AppCompatActivity() {
    //spinner
    var menu = arrayOf<String?>("Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal")
    //@SuppressLint("MissingInflatedId")

    //for passing values :
    private lateinit var nameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var fullAddressEditText: EditText
    private lateinit var pinCodeEditText: EditText
    private lateinit var phoneNumberEditText: EditText


    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ecommerce_checkout)

        //for pssing values to the orderconfirm
        nameEditText = findViewById(R.id.name1)
        emailEditText = findViewById(R.id.email1)
        fullAddressEditText = findViewById(R.id.fulladdresss1)
        pinCodeEditText = findViewById(R.id.pincode1)
        phoneNumberEditText = findViewById(R.id.phonenumber1)


        val orderConfirmButton: Button = findViewById(R.id.orderconfirm)
        //orderConfirmButton.setOnClickListener {
            // Get the values entered by the user
      //      val name = nameEditText.text.toString()
      //      val email = emailEditText.text.toString()
     //       val fullAddress = fullAddressEditText.text.toString()
     //       val pinCode = pinCodeEditText.text.toString()
     //       val phoneNumber = phoneNumberEditText.text.toString()

            // Create an Intent to start the Activity_Confirm
   //         val intent = Intent(this, Ecommerce_orderConfirm::class.java)

            // Put the values in the Intent as extras
    //        intent.putExtra("name", name)
     //       intent.putExtra("email", email)
     //       intent.putExtra("fullAddress", fullAddress)
      //      intent.putExtra("pinCode", pinCode)
     //       intent.putExtra("phoneNumber", phoneNumber)

            // Start the Activity_Confirm
       //     startActivity(intent)
    //    }



        //notification of order


        // Define the notification channel ID
        val CHANNEL_ID = "my_channel_id"

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            // Create the notification channel
            val name1 = "ADIO SHOP"
            val descriptionText = "We will notify you with upcoming trends"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(CHANNEL_ID, name1, importance).apply {
                description = descriptionText
            }

            // Register the notification channel with the system


        val NOTIFICATION_ID = 123



        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

            orderConfirmButton.setOnClickListener(){
           if(nameEditText.text.isNotEmpty() && emailEditText.text.isNotEmpty() && fullAddressEditText.text.isNotEmpty()  && phoneNumberEditText.text.isNotEmpty() && pinCodeEditText.text.isNotEmpty()){

           val intent = Intent(this, MainActivity::class.java)
            val pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)
            val customer = nameEditText.text.toString()
            val customeraddress = fullAddressEditText.text.toString()
            // Create a notification builder
            val builder = NotificationCompat.Builder(this, CHANNEL_ID)
                .setSmallIcon(R.drawable.notification)
                .setContentTitle(customer+" "+"Congratulation Your Order is confirmed")
                .setContentText("Your order will be tranfered in 4 days to: "+ " "+customeraddress)
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)

            // Show the notification
            notificationManager.notify(0, builder.build())

           //passing
           val name = nameEditText.text.toString()
           val email = emailEditText.text.toString()
           val fullAddress = fullAddressEditText.text.toString()
           val pinCode = pinCodeEditText.text.toString()
           val phoneNumber = phoneNumberEditText.text.toString()

           // Create an Intent to start the Activity_Confirm
           val intent1 = Intent(this, Ecommerce_orderConfirm::class.java)

           // Put the values in the Intent as extras
           intent1.putExtra("name", name)
           intent1.putExtra("email", email)
           intent1.putExtra("fullAddress", fullAddress)
           intent1.putExtra("pinCode", pinCode)
           intent1.putExtra("phoneNumber", phoneNumber)

           // Start the Activity_Confirm
           startActivity(intent1)



       }
            }










        //esign activity
        var esign = findViewById<Button>(R.id.esign)
        esign.setOnClickListener(){
            val intent = Intent(this , Drawing::class.java)
            startActivity(intent)
            var esignsubmittext = findViewById<TextView>(R.id.esignsubmitted)
            esignsubmittext.setText("Your E-Signature is submitted")
        }


        //payment button code
        var paytm = findViewById<ImageView>(R.id.paytm)
        var phonepay = findViewById<ImageView>(R.id.phonepay)
        var gpay = findViewById<ImageView>(R.id.gpay)

        paytm.setOnClickListener(){
            var url = "http://www.phonepe.com/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setDataAndType(Uri.parse(url), "text/plain")
            val choose = Intent.createChooser(intent, "Share URL")
            startActivity(choose)

        }

        phonepay.setOnClickListener(){
            var url = "http://www.phonepe.com/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setDataAndType(Uri.parse(url), "text/plain")
            val choose = Intent.createChooser(intent, "Share URL")
            startActivity(choose)

        }

        gpay.setOnClickListener(){
            var url = "http://www.phonepe.com/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setDataAndType(Uri.parse(url), "text/plain")
            val choose = Intent.createChooser(intent, "Share URL")
            startActivity(choose)

        }

        //spinner code
        var state = findViewById<TextView>(R.id.stateTextview)
        val click = findViewById<Spinner>(R.id.Spinner)
        click.onItemClickListener

        val ad : ArrayAdapter<*> = ArrayAdapter<Any?>(
            this,
            android.R.layout.simple_dropdown_item_1line, menu)

        ad.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        click.adapter=ad

    //}
    fun onItemSelected(parent: AdapterView<*>?,
                       view: View, position: Int,
                       id: Long) {
        var state = findViewById<TextView>(R.id.stateTextview)
        Toast.makeText(applicationContext, menu[position], Toast.LENGTH_LONG).show()
        state.setText(menu[position])

    }

    fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        TODO("Not yet imlemented")

    }

    //for passing values to orderconfirm


    }}}
