//Powered by Tenter
//For any types of Software, just contact developers.tenter@gmail.com
package com.tenter.postagetracker

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Findings
        val button = findViewById<Button>(R.id.registerButton)
        val layout = findViewById<View>(R.id.numberError)
        val editTextView = findViewById<EditText>(R.id.phoneNumber)
        val text = findViewById<TextView>(R.id.haveAccount)

        //Navigation
        button.setOnClickListener {
            if (editTextView?.text.toString().trim().isNotEmpty() ||
                editTextView?.text.toString().trim().isNotBlank()) {
                //Coding
                layout.visibility  = View.INVISIBLE
                val intent = Intent(this, VerifyMobile::class.java)
                startActivity(intent)
            } else {
                layout.visibility  = View.VISIBLE
            }
        }

        //Navigation for Back Press
        text.setOnClickListener {
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)
        }
    }
}