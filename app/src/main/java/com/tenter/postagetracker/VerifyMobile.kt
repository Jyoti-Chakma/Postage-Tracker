package com.tenter.postagetracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_verify_mobile.*

class VerifyMobile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_mobile)

        //Action Bar Action
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //Navigation
        val button = findViewById<Button>(R.id.verifyNextButton);
        button.setOnClickListener {
            val intent = Intent(this, AccountInfo::class.java);
            startActivity(intent);
        }
    }

    //Navigation for Back Press
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}