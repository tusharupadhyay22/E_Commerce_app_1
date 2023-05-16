package com.example.e_commerce_app

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.e_commerce_app.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    //https://fakestoreapi.com/products

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setContentView(R.layout.activity_main)

        getData()

        binding.buttonprod.setOnClickListener(){
            getData()
        }
    }

    private fun getData() {

        val progressDialog = ProgressDialog(this)
        progressDialog.setMessage("please wait data is fethcing")
        progressDialog.show()

       RetrofitInstance.apiinterface.getDate().enqueue(object : Callback<responseDataClassItem?> {
           override fun onResponse(
               call: Call<responseDataClassItem?>,
               response: Response<responseDataClassItem?>
           ) {

               binding.title.text=response.body()?.title
               Glide.with(this@MainActivity).load(response.body()?.image).into(binding.prod1);
               progressDialog.dismiss()
           }

           override fun onFailure(call: Call<responseDataClassItem?>, t: Throwable) {
              Toast.makeText(this@MainActivity, "${t.localizedMessage}",Toast.LENGTH_SHORT).show()
              progressDialog.dismiss()
           }
       })
    }
}

private fun <T> Call<T>.enqueue(callback: Callback<responseDataClassItem?>) {


}
