package com.example.e_commerce_app

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("/products")
    fun getDate(): Call<responseDataClassItem>
}