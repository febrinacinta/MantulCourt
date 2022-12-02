package com.example.MantulCourt

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Login: AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.formlogin)


        val buttonlogin : Button = findViewById(R.id.buttonlogin)
        val username: EditText = findViewById(R.id.username)
        val password: EditText = findViewById(R.id.pass)

        buttonlogin.setOnClickListener(){
            if(username.getText().toString().equals("Cinta")&& password.getText().toString().equals("123")){

                startActivity(Intent(this@Login, MainActivity::class.java));
            }
            else{
                Toast.makeText(this@Login, "Username atau Password Salah", Toast.LENGTH_SHORT).show();
            }
        }
    }
};
