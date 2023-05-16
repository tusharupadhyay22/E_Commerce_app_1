package com.example.e_commerce_app

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import org.w3c.dom.Text

class Ecommerce_cartPage2 : AppCompatActivity() {

    lateinit var productrelativeview1 : RelativeLayout
    lateinit var productrelativeview2 : RelativeLayout
    lateinit var productrelativeview3 : RelativeLayout

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ecommerce_cart_page2)

        productrelativeview1 = findViewById(R.id.productsrelativeview1)
        productrelativeview2= findViewById(R.id.productsrelativeview2)
        productrelativeview3 = findViewById(R.id.productsrelativeview3)

        var emptycart = findViewById<TextView>(R.id.emptyCart)

        var count = 0
        var plusbut = findViewById<Button>(R.id.plusbut)
        var minusbut = findViewById<Button>(R.id.minusbut)
        var finalprice = findViewById<TextView>(R.id.finalprice)
        var quantitytext = findViewById<TextView>(R.id.quantitytext)

        val productImage: ImageView = findViewById(R.id.Prodid)
        val productTitle: TextView = findViewById(R.id.Prodtitle)
        val productDesc :TextView = findViewById(R.id.ProdDesc)
        val productPrice : TextView = findViewById(R.id.Prodprice)

        val intent = intent
        if (intent?.extras != null) {
            val productImg = intent.getIntExtra("product_image", R.drawable.p5)
            val productTitleText1 = intent.getStringExtra("product_title")
            val productDescText = intent.getStringExtra("product_desc")
            val productPriceText = intent.getStringExtra("product_price")
            productImage.setImageResource(productImg)
            productTitle.text = productTitleText1
            productDesc.text = productDescText
            productPrice.text = productPriceText
            //yahan likh dia
           // finalprice.text = "Price: "+ productPriceText

            //chatgpt code
            val initialQuantity = quantitytext.text.toString().toIntOrNull() ?: 0
            val prodPrice = productPriceText?.toIntOrNull() ?: 0
            var price = initialQuantity * prodPrice
            finalprice.text = "Price: $price"

    }
        else{
            productrelativeview1.visibility= View.INVISIBLE
            productrelativeview2.visibility = View.INVISIBLE
            productrelativeview3.visibility = View.INVISIBLE
            emptycart.setText("Cart is empty")

        }



        plusbut.setOnClickListener(){
            count++
            quantitytext.setText("    "+ count)
            //chat gpt code
            val prodPrice = productPrice.text.toString().toIntOrNull() ?: 0
            var price = count * prodPrice
            finalprice.text = "₹Price: $price"

        }
        minusbut.setOnClickListener(){
            if (count > 0) {
                count--
                quantitytext.setText("    "+ count)
                // update final price on quantity change
                val prodPrice = productPrice.text.toString().toIntOrNull() ?: 0
                var price = count * prodPrice
                finalprice.text = "₹Price: $price"
            }
        }

        //payment method
        //removed

        var chekout = findViewById<Button>(R.id.checkoutbut)
        chekout.setOnClickListener(){
            val intent = Intent(this , Ecommerce_Checkout::class.java)
            startActivity(intent)
        }


        //var price =0
        //var quantity = quantitytext.text.toString().toInt()
        //var prodpricecal = productPrice.text.toString().toInt()

        //var text :String = productPrice.getText().toString()
        //var prodpricecal :Int =Integer.parseInt(text)

       // var text1 :String = quantitytext.getText().toString()
        //var quantity: Int = Integer.parseInt(text1)



      //  fun getProduct(num1: Int, num2: Int): Int {
      //      return num1 * num2
      //  }

      //  if(quantitytext.text.isNotEmpty()){
      //      price = getProduct(quantity , prodpricecal)
      //  }

      //  finalprice.text = price.toString()






}
}

