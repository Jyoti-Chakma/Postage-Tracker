//Powered by Tenter
package com.tenter.postagetracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SignIn : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        //Action Bar Action
        setSupportActionBar(findViewById(R.id.signInToolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowTitleEnabled(false)

        //Findings
        val button = findViewById<Button>(R.id.signInNextButton)
        val signEdit1 = findViewById<EditText>(R.id.signEmail)
        val signEdit2 = findViewById<EditText>(R.id.signPass)
        val errorMsg1 = findViewById<View>(R.id.emailSignError)
        val errorMsg2 = findViewById<View>(R.id.signInError)

        //Navigation
        button.setOnClickListener {
            if ((signEdit1?.text.toString().trim().isNotEmpty() ||
                signEdit1?.text.toString().trim().isNotBlank()) &&
                (signEdit2?.text.toString().trim().isNotEmpty() ||
                signEdit2?.text.toString().trim().isNotBlank())) {
                errorMsg1.visibility  = View.INVISIBLE
                errorMsg2.visibility  = View.INVISIBLE
                val intent = Intent(this, Dashboard::class.java)
                startActivity(intent)
            } else if (
                signEdit1?.text.toString().trim().isNotEmpty() ||
                signEdit1?.text.toString().trim().isNotBlank()){
                errorMsg1.visibility  = View.INVISIBLE
                errorMsg2.visibility  = View.VISIBLE
            } else if (
                signEdit2?.text.toString().trim().isNotEmpty() ||
                signEdit2?.text.toString().trim().isNotBlank()){
                errorMsg1.visibility  = View.VISIBLE
                errorMsg2.visibility  = View.INVISIBLE
            } else {
                errorMsg1.visibility  = View.VISIBLE
                errorMsg2.visibility  = View.VISIBLE
            }
        }

        val text = findViewById<TextView>(R.id.forgotPass)
        text.setOnClickListener {
            val intent = Intent(this, ForgotPassword::class.java)
            startActivity(intent)
        }
    }

    //Navigation for Back Press
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}