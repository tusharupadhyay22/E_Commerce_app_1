package com.example.e_commerce_app

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class Ecommerce_CartPage : AppCompatActivity() {

    private lateinit var cartRecyclerView: RecyclerView
    private lateinit var cartAdapter: ProductAdapter
    private var productList = mutableListOf<Product>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ecommerce_cart_page)

        cartRecyclerView = findViewById(R.id.cartRecyclerView)
        cartRecyclerView.layoutManager = LinearLayoutManager(this)
        cartAdapter = ProductAdapter(productList)
        cartRecyclerView.adapter = cartAdapter

        // Get cart data from SharedPreferences
        val sharedPreferences = getSharedPreferences("cart", Context.MODE_PRIVATE)
        val cartJson = sharedPreferences.getString("cart_data", null)
        if (cartJson != null) {
            // Parse JSON data into list of products
            val gson = Gson()
            productList = gson.fromJson(cartJson, object : TypeToken<List<Product>>() {}.type)
            cartAdapter.updateList(productList)
        }

    }
}