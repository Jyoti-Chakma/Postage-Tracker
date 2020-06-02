//Powered by Tenter
package com.tenter.postagetracker

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class SetPassword : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_password)

        //Action Bar Action
        setSupportActionBar(findViewById(R.id.setPassToolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowTitleEnabled(false)

        //Findings
        val button = findViewById<Button>(R.id.setPassNextButton)
        val editText1 = findViewById<EditText>(R.id.passId)
        val editText2 = findViewById<EditText>(R.id.repeatPassId)
        val layout1 = findViewById<View>(R.id.passError)
        val layout2 = findViewById<View>(R.id.repeatPassError)

        //Navigation
        button.setOnClickListener {
            if ((editText1?.text.toString().trim().isNotEmpty() ||
                editText1?.text.toString().trim().isNotBlank()) &&
                (editText2?.text.toString().trim().isNotEmpty() ||
                editText2?.text.toString().trim().isNotBlank())) {
                //Coding
                layout1.visibility  = View.INVISIBLE
                layout1.visibility  = View.INVISIBLE
                val intent = Intent(this, CheckEmail::class.java)
                startActivity(intent)
            } else if (
                editText1?.text.toString().trim().isNotEmpty() ||
                editText1?.text.toString().trim().isNotBlank()){
                layout1.visibility  = View.INVISIBLE
                layout2.visibility  = View.VISIBLE
            } else if (
                editText2?.text.toString().trim().isNotEmpty() ||
                editText2?.text.toString().trim().isNotBlank()){
                layout1.visibility  = View.VISIBLE
                layout1.visibility  = View.INVISIBLE
            } else {
                layout1.visibility  = View.VISIBLE
                layout2.visibility  = View.VISIBLE
            }
        }
    }

    //Navigation for Back Press
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}