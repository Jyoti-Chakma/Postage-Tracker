//Powered by Tenter
package com.tenter.postagetracker

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class ForgotPassword : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        //Action Bar Action
        setSupportActionBar(findViewById(R.id.forgotToolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowTitleEnabled(false)

        //Navigation
        val button = findViewById<Button>(R.id.sendMailButton)
        val editText = findViewById<EditText>(R.id.resetEdit)
        val layout = findViewById<View>(R.id.resetError)
        button.setOnClickListener {
            if (editText?.text.toString().trim().isNotEmpty() ||
                editText?.text.toString().trim().isNotBlank()) {
                //Coding
                layout.visibility  = View.INVISIBLE
                val intent = Intent(this, CheckEmail::class.java)
                startActivity(intent)
            } else {
                layout.visibility  = View.VISIBLE
            }
        }
    }

    //Navigation for Back Press
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}