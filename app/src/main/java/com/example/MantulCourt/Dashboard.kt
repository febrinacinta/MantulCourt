package com.example.MantulCourt

import androidx.recyclerview.widget.RecyclerView

class Dashboard {
    lateinit var recyclerView : RecyclerView
    lateinit var adapter: MyAdapter

    init()
    recyclerView.layoutManager = GridLayoutManager(this, 2)
    recyclerView.adapter = adapter

}

private fun init(){
    recyclerView = findViewById(R.id.rv_itemlist)

    var data = ArrayList<Food>()
    data.add(Food(R.drawable.ayam_bakar, "Rp. 13.000", "Ayam Bakar", "55"))
    data.add(Food(R.drawable.sate, "Rp. 15.000", "Sate Ayam", "40"))
    data.add(Food(R.drawable.bakso, "Rp. 10.000", "Bakso Sapi", "20"))
    data.add(Food(R.drawable.esteh, "Rp. 3.000", "Es Teh Manis", "80"))
    data.add(Food(R.drawable.mineral, "Rp. 3.000", "Air Mineral", "64"))
    data.add(Food(R.drawable.jus, "Rp. 7.000", "Aneka Jus", "25"))
    data.add(Food(R.drawable.chickencrisp, "Rp. 20.000", "Chicken Crispy", "28"))
    data.add(Food(R.drawable.nasigoreng, "Rp. 15.000", "Nasi Goreng", "35"))
    data.add(Food(R.drawable.nasikuning, "Rp. 15.000", "Nasi Kuning", "15"))
    data.add(Food(R.drawable.nasiuduk, "Rp. 15.000", "Nasi Uduk", "10"))
    data.add(Food(R.drawable.salad, "Rp. 20.000", "Salad", "48"))
    data.add(Food(R.drawable.steak, "Rp. 30.000", "Steak", "60"))
    data.add(Food(R.drawable.cakes, "Rp. 15.000", "Cakes", "33"))
    data.add(Food(R.drawable.oceanblue, "Rp. 12.000", "Ocean Blue", "47"))
    data.add(Food(R.drawable.frappe, "Rp. 15.000", "Oreo Frappe", "18"))
    data.add(Food(R.drawable.milkshake, "Rp. 12.000", "Milkshake", "29"))

    adapter = MyAdapter(data)
}
}