//Powered by Tenter
package com.tenter.postagetracker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.ravikoradiya.library.CenterTitle
import kotlinx.android.synthetic.main.activity_edit_account.*

class EditAccount : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_account)

        //Action Bar Action
        setSupportActionBar(findViewById(R.id.editToolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setTitle(R.string.edit)
        CenterTitle.centerTitle(editToolbar as Toolbar,true)

        //Navigation
        val button = findViewById<Button>(R.id.editSaveId)
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