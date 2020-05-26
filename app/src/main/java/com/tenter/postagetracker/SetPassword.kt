package com.tenter.postagetracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.widget.Button
import kotlinx.android.synthetic.main.activity_set_password.*

class SetPassword : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_password)

        //Action Bar Action
        setSupportActionBar(findViewById(R.id.setPassToolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //Navigation
        val button = findViewById<Button>(R.id.setPassNextButton);
        button.setOnClickListener {
            val intent = Intent(this, CheckEmail::class.java);
            startActivity(intent);
        }
    }

    //Navigation for Back Press
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}
