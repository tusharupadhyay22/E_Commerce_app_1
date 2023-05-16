package com.example.e_commerce_app

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.google.gson.Gson

class Ecommerce_productDetails : AppCompatActivity() {


    lateinit var productImage: ImageView
    lateinit var productTitle: TextView
    lateinit var addtocart :Button
    lateinit var productprice :TextView
    lateinit var productDesc :TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ecommerce_product_details)


        val xsbut = findViewById<Button>(R.id.xs)
        val sbut = findViewById<Button>(R.id.s)
        val mbut = findViewById<Button>(R.id.m)
        val lbut = findViewById<Button>(R.id.l)
        val xlbut = findViewById<Button>(R.id.xl)
        val xxlbut = findViewById<Button>(R.id.xxl)

        val malebut = findViewById<Button>(R.id.malebut)
        val femalebut = findViewById<Button>(R.id.femalebut)


        val sharedPref = getSharedPreferences("myPref", MODE_PRIVATE)
        val editor = sharedPref.edit()

        addtocart =findViewById(R.id.addtocart)

        productImage = findViewById(R.id.product_image)
        productTitle = findViewById(R.id.product_title)
        productprice  = findViewById(R.id.product_price)
        productDesc = findViewById(R.id.product_desc)

        val intent = intent
        if (intent != null) {
            val productImg = intent.getIntExtra("product_image", R.drawable.p5)
            val productTitleText = intent.getStringExtra("product_title")
            val productpriceText = intent.getStringExtra("product_price")
            val productdescText = intent.getStringExtra("product_desc")
            productImage.setImageResource(productImg)
            productTitle.text = productTitleText
            productprice.text = productpriceText
            productDesc.text = productdescText
        }

        //to pass values to cart page
        val productImage: ImageView = findViewById(R.id.product_image)
        val productTitle: TextView = findViewById(R.id.product_title)
        val productPrice : TextView = findViewById(R.id.product_price)
        val productDesc : TextView = findViewById(R.id.product_desc)

        val productImg = intent.getIntExtra("product_image", R.drawable.p1)
        val productTitleText1 = intent.getStringExtra("product_title")
        val productPricetext = intent.getStringExtra("product_price")
        val productDescText = intent.getStringExtra("product_desc")

        addtocart.setOnClickListener {
            val intent = Intent(this, Ecommerce_cartPage2::class.java)
            intent.putExtra("product_image", productImg)
            intent.putExtra("product_title", productTitleText1)
            intent.putExtra("product_desc" , productDescText)
            intent.putExtra("product_price" , productPricetext)
            startActivity(intent)
        }


        xsbut.setOnClickListener(){
            xsbut.setBackgroundColor(Color.GREEN)
        }
        sbut.setOnClickListener(){
            sbut.setBackgroundColor(Color.GREEN)
        }
        mbut.setOnClickListener(){
            mbut.setBackgroundColor(Color.GREEN)
        }

        lbut.setOnClickListener(){
            lbut.setBackgroundColor(Color.GREEN)
        }

        xlbut.setOnClickListener(){
            xlbut.setBackgroundColor(Color.GREEN)
        }
        xxlbut.setOnClickListener(){
            xxlbut.setBackgroundColor(Color.GREEN)
        }
        malebut.setOnClickListener(){
            malebut.setBackgroundColor(Color.GREEN)
        }
        femalebut.setOnClickListener(){
            femalebut.setBackgroundColor(Color.GREEN)
        }








    }
}

private fun <E> ArrayList<E>.add(element: Unit) {

}
