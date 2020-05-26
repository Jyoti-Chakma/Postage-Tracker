package com.tenter.postagetracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AccountInfo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_info)

        //Action Bar Action
        setSupportActionBar(findViewById(R.id.accountToolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //Navigation
        val button = findViewById<Button>(R.id.accountNextButton);
        button.setOnClickListener {
            val intent = Intent(this, SetPassword::class.java);
            startActivity(intent);
        }
    }

    //Navigation for Back Press
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}
