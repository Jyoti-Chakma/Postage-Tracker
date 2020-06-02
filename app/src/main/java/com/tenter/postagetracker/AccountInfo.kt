//Powered by Tenter
package com.tenter.postagetracker

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class AccountInfo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_info)

        //Action Bar Action
        setSupportActionBar(findViewById(R.id.accountToolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowTitleEnabled(false)

        //Findings
        val button = findViewById<Button>(R.id.accountNextButton)
        val firstName = findViewById<EditText>(R.id.firstNameEdit)
        val lastName = findViewById<EditText>(R.id.lastNameEdit)
        val email = findViewById<EditText>(R.id.emailEdit)
        val layout1 = findViewById<View>(R.id.firstNameError)
        val layout2 = findViewById<View>(R.id.lastNameError)
        val layout3 = findViewById<View>(R.id.emailError)

        //Navigation
        button.setOnClickListener {
            if ((firstName?.text.toString().trim().isNotEmpty() ||
                firstName?.text.toString().trim().isNotBlank()) &&
                (lastName?.text.toString().trim().isNotEmpty() ||
                lastName?.text.toString().trim().isNotBlank()) &&
                (email?.text.toString().trim().isNotEmpty() ||
                email?.text.toString().trim().isNotBlank())) {
                //Coding
                layout1.visibility  = View.INVISIBLE
                layout2.visibility  = View.INVISIBLE
                layout3.visibility  = View.INVISIBLE
                val intent = Intent(this, SetPassword::class.java)
                startActivity(intent)
            } else if (
                (firstName?.text.toString().trim().isNotEmpty() ||
                firstName?.text.toString().trim().isNotBlank()) &&
                (lastName?.text.toString().trim().isNotEmpty() ||
                lastName?.text.toString().trim().isNotBlank())) {
                layout1.visibility  = View.INVISIBLE
                layout2.visibility  = View.INVISIBLE
                layout3.visibility  = View.VISIBLE
            } else if (
                (firstName?.text.toString().trim().isNotEmpty() ||
                firstName?.text.toString().trim().isNotBlank()) &&
                (email?.text.toString().trim().isNotEmpty() ||
                email?.text.toString().trim().isNotBlank())) {
                layout1.visibility  = View.INVISIBLE
                layout2.visibility  = View.VISIBLE
                layout3.visibility  = View.INVISIBLE
            } else if (
                (lastName?.text.toString().trim().isNotEmpty() ||
                lastName?.text.toString().trim().isNotBlank()) &&
                (email?.text.toString().trim().isNotEmpty() ||
                email?.text.toString().trim().isNotBlank())) {
                layout1.visibility  = View.VISIBLE
                layout2.visibility  = View.INVISIBLE
                layout3.visibility  = View.INVISIBLE
            } else if (
                firstName?.text.toString().trim().isNotEmpty() ||
                firstName?.text.toString().trim().isNotBlank()) {
                layout1.visibility  = View.INVISIBLE
                layout2.visibility  = View.VISIBLE
                layout3.visibility  = View.VISIBLE
            } else if (
                lastName?.text.toString().trim().isNotEmpty() ||
                lastName?.text.toString().trim().isNotBlank()) {
                layout1.visibility  = View.VISIBLE
                layout2.visibility  = View.INVISIBLE
                layout3.visibility  = View.VISIBLE
            } else if (
                email?.text.toString().trim().isNotEmpty() ||
                email?.text.toString().trim().isNotBlank()) {
                layout1.visibility  = View.VISIBLE
                layout2.visibility  = View.VISIBLE
                layout3.visibility  = View.INVISIBLE
            } else {
                layout1.visibility  = View.VISIBLE
                layout2.visibility  = View.VISIBLE
                layout3.visibility  = View.VISIBLE
            }
        }
    }

    //Navigation for Back Press
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}