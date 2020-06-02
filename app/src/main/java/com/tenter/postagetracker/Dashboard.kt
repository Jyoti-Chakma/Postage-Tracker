//Powered by Tenter
package com.tenter.postagetracker

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_dashboard.*

class Dashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        addPostage.setOnClickListener {
            val intent = Intent(this, NewPostage::class.java)
            startActivity(intent)
        }

        //Navigation
        val imageView = findViewById<ImageView>(R.id.dashboardIcon)
        imageView.setOnClickListener {
            val intent = Intent(this, ManageAccount::class.java)
            startActivity(intent)
        }

        val cardView1 = findViewById<CardView>(R.id.card1)
        cardView1.setOnClickListener {
            val intent = Intent(this, Detail1::class.java)
            startActivity(intent)
        }

        val cardView2 = findViewById<CardView>(R.id.card2)
        cardView2.setOnClickListener {
            val intent = Intent(this, Detail2::class.java)
            startActivity(intent)
        }

        val cardView3 = findViewById<CardView>(R.id.card3)
        cardView3.setOnClickListener {
            val intent = Intent(this, Detail3::class.java)
            startActivity(intent)
        }
    }
}