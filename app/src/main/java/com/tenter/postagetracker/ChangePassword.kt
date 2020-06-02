//Powered by Tenter
package com.tenter.postagetracker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.ravikoradiya.library.CenterTitle
import kotlinx.android.synthetic.main.activity_change_password.*

class ChangePassword : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_password)

        //Action Bar Action
        setSupportActionBar(findViewById(R.id.setPassToolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setTitle(R.string.changePass)
        CenterTitle.centerTitle(setPassToolbar  as Toolbar,true)

        //Navigation
        val button = findViewById<Button>(R.id.passSaveId)
        button.setOnClickListener {
            val intent = Intent(this, PasswordChangeVerify::class.java)
            startActivity(intent)
        }
    }

    //Navigation for Back Press
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}