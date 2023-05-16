package com.example.e_commerce_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductAdapter(private val productList: List<Product>) :
    RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(productList[position])
    }

    fun updateList(newList: List<Product>) {
        productList.clear()
        productList.addAll(newList)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = productList.size
   

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val productImage = itemView.findViewById<ImageView>(R.id.product_image)
        private val productTitle = itemView.findViewById<TextView>(R.id.product_title)
        private val productDesc = itemView.findViewById<TextView>(R.id.product_desc)

        fun bind(product: Product) {
            productImage.setImageResource(product.image)
            productTitle.text = product.title
            productDesc.text = product.description
        }
    }
}

private fun <E> List<E>.addAll(newList: List<E>) {

}

private fun <E> List<E>.clear() {
    TODO("Not yet implemented")
}
