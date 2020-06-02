//Powered by Tenter
package com.tenter.postagetracker

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class ManageAccount : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manage_account)

        //Navigation
        val imageView = findViewById<ImageView>(R.id.crossIcon)
        imageView.setOnClickListener {
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
        }

        val imageView2 = findViewById<ImageView>(R.id.editIcon)
        imageView2.setOnClickListener {
            val intent = Intent(this, EditAccount::class.java)
            startActivity(intent)
        }

        val cardView = findViewById<CardView>(R.id.passResetOption)
        cardView.setOnClickListener {
            val intent = Intent(this, ChangePassword::class.java)
            startActivity(intent)
        }
    }
}