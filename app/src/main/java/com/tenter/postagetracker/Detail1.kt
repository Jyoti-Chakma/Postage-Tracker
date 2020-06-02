//Powered by Tenter
package com.tenter.postagetracker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.ravikoradiya.library.CenterTitle
import kotlinx.android.synthetic.main.activity_detail1.*

class Detail1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail1)

        //Action Bar Action
        setSupportActionBar(findViewById(R.id.detail1Toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setTitle(R.string.item1)
        CenterTitle.centerTitle(detail1Toolbar as Toolbar,true)
    }

    //Navigation for Back Press
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}