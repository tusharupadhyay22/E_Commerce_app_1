package com.example.e_commerce_app

import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.app.NotificationCompat
import com.android.car.ui.AlertDialogBuilder
import com.google.android.material.navigation.NavigationView
import org.w3c.dom.Text

class Ecommerce_ProductsList : AppCompatActivity() {

    lateinit var pd1Image: ImageView
    lateinit var pd1Title: TextView
    lateinit var pd1price :TextView
    lateinit var pd1desc :TextView
    lateinit var pd1AddButton: Button

    lateinit var pd2Image: ImageView
    lateinit var pd2Title: TextView
    lateinit var pd2price :TextView
    lateinit var pd2desc :TextView
    lateinit var pd2AddButton: Button

    lateinit var p3Image: ImageView
    lateinit var pd3Title: TextView
    lateinit var pd3price :TextView
    lateinit var pd3desc :TextView
    lateinit var pd3AddButton: Button

    lateinit var pd4Image: ImageView
    lateinit var pd4Title: TextView
    lateinit var pd4price :TextView
    lateinit var pd4desc :TextView
    lateinit var pd4AddButton: Button

    lateinit var pd5Image: ImageView
    lateinit var pd5Title: TextView
    lateinit var pd5price :TextView
    lateinit var pd5desc :TextView
    lateinit var pd5AddButton: Button

    lateinit var pd6Image: ImageView
    lateinit var pd6Title: TextView
    lateinit var pd6price :TextView
    lateinit var pd6desc :TextView
    lateinit var pd6AddButton: Button

    lateinit var pd7Image: ImageView
    lateinit var pd7Title: TextView
    lateinit var pd7price :TextView
    lateinit var pd7desc :TextView
    lateinit var pd7AddButton: Button

    lateinit var pd8Image: ImageView
    lateinit var pd8Title: TextView
    lateinit var pd8price :TextView
    lateinit var pd8desc :TextView
    lateinit var pd8AddButton: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ecommerce_products_list)

        pd1Image = findViewById(R.id.pd1)
        pd1Title = findViewById(R.id.pd1title)
        pd1price = findViewById(R.id.pd1price)
        pd1desc = findViewById(R.id.pd1desc)
        pd1AddButton = findViewById(R.id.pd1but)

        pd2Image = findViewById(R.id.pd2)
        pd2Title = findViewById(R.id.pd2title)
        pd2price = findViewById(R.id.pd2price)
        pd2desc = findViewById(R.id.pd2desc)
        pd2AddButton = findViewById(R.id.pd2but)

        p3Image = findViewById(R.id.pd3)
        pd3Title = findViewById(R.id.pd1title)
        pd3price = findViewById(R.id.pd3price)
        pd3desc = findViewById(R.id.pd3desc)
        pd3AddButton = findViewById(R.id.pd3but)

        pd4Image = findViewById(R.id.pd4)
        pd4Title = findViewById(R.id.pd4title)
        pd4price = findViewById(R.id.pd4price)
        pd4desc = findViewById(R.id.pd4desc)
        pd4AddButton = findViewById(R.id.pd4but)

        pd5Image = findViewById(R.id.pd5)
        pd5Title = findViewById(R.id.pd5title)
        pd5price = findViewById(R.id.pd5price)
        pd5desc = findViewById(R.id.pd5desc)
        pd5AddButton = findViewById(R.id.pd5but)

        pd6Image = findViewById(R.id.pd6)
        pd6Title = findViewById(R.id.pd6title)
        pd6price = findViewById(R.id.pd6price)
        pd6desc = findViewById(R.id.pd6desc)
        pd6AddButton = findViewById(R.id.pd6but)

        pd7Image = findViewById(R.id.pd7)
        pd7Title = findViewById(R.id.pd7title)
        pd7price = findViewById(R.id.pd7price)
        pd7desc = findViewById(R.id.pd7desc)
        pd7AddButton = findViewById(R.id.pd7but)

        pd8Image = findViewById(R.id.pd8)
        pd8Title = findViewById(R.id.pd8title)
        pd8price = findViewById(R.id.pd8price)
        pd8desc = findViewById(R.id.pd8desc)
        pd8AddButton = findViewById(R.id.pd8but)



        pd1AddButton.setOnClickListener {
            val intent = Intent(this, Ecommerce_productDetails::class.java)
            intent.putExtra("product_image", R.drawable.p5)
            intent.putExtra("product_title", pd1Title.text.toString())
            intent.putExtra("product_price" ,pd1price.text.toString() )
            intent.putExtra("product_desc" , pd1desc.text.toString())
            startActivity(intent)
        }

        pd2AddButton.setOnClickListener {
            val intent = Intent(this, Ecommerce_productDetails::class.java)
            intent.putExtra("product_image", R.drawable.p6)
            intent.putExtra("product_title", pd2Title.text.toString())
            intent.putExtra("product_price" ,pd2price.text.toString() )
            intent.putExtra("product_desc" , pd2desc.text.toString())
            startActivity(intent)
        }

        pd3AddButton.setOnClickListener {
            val intent = Intent(this, Ecommerce_productDetails::class.java)
            intent.putExtra("product_image", R.drawable.p7)
            intent.putExtra("product_title", pd3Title.text.toString())
            intent.putExtra("product_price" ,pd3price.text.toString() )
            intent.putExtra("product_desc" , pd3desc.text.toString())
            startActivity(intent)
        }
        pd4AddButton.setOnClickListener {
            val intent = Intent(this, Ecommerce_productDetails::class.java)
            intent.putExtra("product_image", R.drawable.p8)
            intent.putExtra("product_title", pd4Title.text.toString())
            intent.putExtra("product_price" ,pd4price.text.toString() )
            intent.putExtra("product_desc" , pd4desc.text.toString())
            startActivity(intent)
        }

        pd5AddButton.setOnClickListener {
            val intent = Intent(this, Ecommerce_productDetails::class.java)
            intent.putExtra("product_image", R.drawable.p9)
            intent.putExtra("product_title", pd5Title.text.toString())
            intent.putExtra("product_price" ,pd5price.text.toString() )
            intent.putExtra("product_desc" , pd5desc.text.toString())
            startActivity(intent)
        }

        pd6AddButton.setOnClickListener {
            val intent = Intent(this, Ecommerce_productDetails::class.java)
            intent.putExtra("product_image", R.drawable.p10)
            intent.putExtra("product_title", pd6Title.text.toString())
            intent.putExtra("product_price" ,pd6price.text.toString() )
            intent.putExtra("product_desc" , pd6desc.text.toString())
            startActivity(intent)
        }

        pd7AddButton.setOnClickListener {
            val intent = Intent(this, Ecommerce_productDetails::class.java)
            intent.putExtra("product_image", R.drawable.p11)
            intent.putExtra("product_title", pd7Title.text.toString())
            intent.putExtra("product_price" ,pd7price.text.toString() )
            intent.putExtra("product_desc" , pd7desc.text.toString())
            startActivity(intent)
        }

        pd8AddButton.setOnClickListener {
            val intent = Intent(this, Ecommerce_productDetails::class.java)
            intent.putExtra("product_image", R.drawable.p12)
            intent.putExtra("product_title", pd8Title.text.toString())
            intent.putExtra("product_price" ,pd8price.text.toString() )
            intent.putExtra("product_desc" , pd8desc.text.toString())
            startActivity(intent)
        }



        val navigationView = findViewById<NavigationView>(R.id.navigationview)
        val logout = navigationView.menu.findItem(R.id.menu_item_4)

        //alert dialog box
        logout.setOnMenuItemClickListener {
            AlertDialog.Builder(this)
                .setTitle("Logout")
                .setMessage("Are you sure you want to logout?")
                .setPositiveButton("Yes") {  dialogInterface, which ->
                    val intent = Intent(this , E_commercer_registration::class.java)
                    startActivity(intent);
                         }

                .setNegativeButton("No"){
                        dialogInterface, which ->
                    Toast.makeText(applicationContext,"Enjoy your shopping", Toast.LENGTH_LONG).show()
                }
                .show()

            true


        }


        navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.menu_item_1 -> {
                    val intent = Intent(this, Ecommerce_ProductsList::class.java)
                    startActivity(intent)
                    true
                }
                R.id.menu_item_3 -> {
                    val intent = Intent(this, Ecommerce_cartPage2::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }

        //notification

        val notificationiconimage = findViewById<ImageView>(R.id.notificationicon)

// Define the notification channel ID
        val CHANNEL_ID = "my_channel_id"

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            // Create the notification channel
            val name = "ADIO SHOP"
            val descriptionText = "We will notify you with upcoming trends"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(CHANNEL_ID, name, importance).apply {
                description = descriptionText
            }

            // Register the notification channel with the system
            val notificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }

        val builder = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(R.drawable.notification)
            .setContentTitle("ADIO Shop")
            .setContentText("We will notify you with upcoming trends")

        val NOTIFICATION_ID = 123



        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.notify(NOTIFICATION_ID, builder.build())

        notificationiconimage.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            val pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)

            // Create a notification builder
            val builder = NotificationCompat.Builder(this, CHANNEL_ID)
                .setSmallIcon(R.drawable.notification)
                .setContentTitle("ADIO Shop")
                .setContentText("This is my notification text")
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)

            // Show the notification
            notificationManager.notify(0, builder.build())


        }







    }
}