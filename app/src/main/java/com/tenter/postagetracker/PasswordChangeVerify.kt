//Powered by Tenter
package com.tenter.postagetracker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.ravikoradiya.library.CenterTitle
import kotlinx.android.synthetic.main.activity_password_change_verify.*

class PasswordChangeVerify : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_change_verify)

        //Action Bar Action
        setSupportActionBar(findViewById(R.id.passChangeVerifyToolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setTitle(R.string.verifyMobile)
        CenterTitle.centerTitle(passChangeVerifyToolbar as Toolbar,true)

        //Navigation
        val button = findViewById<Button>(R.id.passChangeVerify)
        button.setOnClickListener {
            val intent = Intent(this, ManageAccount::class.java)
            startActivity(intent)
        }
    }

    //Navigation for Back Press
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}