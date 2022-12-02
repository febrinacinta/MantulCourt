package com.example.MantulCourt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
//private lateinit var adapter : MyAdapter
//private lateinit var recyclerView: RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var Username : EditText
    lateinit var Password : EditText
    lateinit var Login : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.formlogin)

        Username = findViewById(R.id.username)
        Password = findViewById(R.id.pass)
        Login = findViewById(R.id.buttonlogin)

        Login.setOnClickListener{
            val bundle = Bundle()

            bundle.putString("username", Username.text.toString())
            bundle.putString("password",Password.text.toString())

            val intent = Intent(this, Dashboard::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
}