//Powered by Tenter
package com.tenter.postagetracker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NewPostage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_postage)

        //Action Bar Action
        setSupportActionBar(findViewById(R.id.newPostageToolbarId))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowTitleEnabled(false)

        //Navigation
        val button = findViewById<Button>(R.id.newPostageSubmit)
        val editLocation = findViewById<TextView>(R.id.finalLocation)
        button.setOnClickListener {
            val intent = Intent(this, PrintPay::class.java)
            startActivity(intent)
        }

        editLocation.setOnClickListener {
            val intent = Intent(this, ToLocation::class.java)
            startActivity(intent);
        }
    }

    //Navigation for Back Press
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}