//Powered by Tenter
package com.tenter.postagetracker

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.chaos.view.PinView

class VerifyMobile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_mobile)

        //Action Bar Action
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowTitleEnabled(false)

        //Findings
        val button = findViewById<Button>(R.id.verifyNextButton)
        val pin = findViewById<PinView>(R.id.pinId)
        val layout = findViewById<View>(R.id.pinError)
        val textButton = findViewById<TextView>(R.id.resendButton)
        val resendLayout = findViewById<View>(R.id.resendCode)

        //Navigation
        button.setOnClickListener {
            if (pin?.text.toString().trim().isNotEmpty() ||
                pin?.text.toString().trim().isNotBlank()) {
                //Coding
                layout.visibility  = View.INVISIBLE
                val intent = Intent(this, AccountInfo::class.java)
                startActivity(intent)
            } else {
                layout.visibility  = View.VISIBLE
            }
        }

        textButton.setOnClickListener {
            resendLayout.visibility = View.VISIBLE
        }
    }

    //Navigation for Back Press
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}