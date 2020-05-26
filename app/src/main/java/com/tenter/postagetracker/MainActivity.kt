package com.tenter.postagetracker

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Navigation
        val button = findViewById<Button>(R.id.registerButton);
        button.setOnClickListener {
            val intent = Intent(this, VerifyMobile::class.java);
            startActivity(intent);
        }

        //Navigation for Back Press
        val text = findViewById<TextView>(R.id.haveAccount);
        text.setOnClickListener {
            val intent = Intent(this, SignIn::class.java);
            startActivity(intent);
        }
    }
}