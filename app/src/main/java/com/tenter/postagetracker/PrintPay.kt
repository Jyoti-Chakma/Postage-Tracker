//Powered by Tenter
package com.tenter.postagetracker

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PrintPay : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_print_pay)

        //Action Bar Action
        setSupportActionBar(findViewById(R.id.printToolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowTitleEnabled(false)

        //Toast
        val button1 = findViewById<Button>(R.id.printButton)
        button1.setOnClickListener {
            Toast.makeText(this,"Your Postage has been Printed Successfully",Toast.LENGTH_SHORT).show()
        }

        val button2 = findViewById<Button>(R.id.payButton)
        button2.setOnClickListener {
            Toast.makeText(this,"Pay via Credit Card!",Toast.LENGTH_SHORT).show()
        }
    }

    //Navigation for Back Press
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}