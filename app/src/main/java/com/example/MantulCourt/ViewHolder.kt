package com.example.MantulCourt

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
RecyclerView.ViewHolder(inflater.inflate(R.layout.view_item, parent, false))
{
    private lateinit var imageView: ImageView
    private lateinit var tv_harga : TextView
    private lateinit var tv_nama_produk : TextView
    private lateinit var tv_rating : TextView

    init {
        imageView = itemView.findViewById(R.id.iv_list)
        tv_harga = itemView.findViewById(R.id.tv_Harga)
        tv_nama_produk = itemView.findViewById(R.id.tv_Nama_Produk)
        tv_rating = itemView.findViewById(R.id.tv_rating)
    }

    fun bind(data: Food){
        imageView.setImageResource(data.ImageView)
        tv_harga.text = data.tv_harga
        tv_nama_produk.text = data.tv_Nama_Produk
        tv_rating.text = data.tv_rating
    }
}