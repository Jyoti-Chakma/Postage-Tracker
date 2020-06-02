//Powered by Tenter
package com.tenter.postagetracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.ravikoradiya.library.CenterTitle
import kotlinx.android.synthetic.main.activity_detail1.*
import kotlinx.android.synthetic.main.activity_detail3.*

class Detail3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail3)

        //Action Bar Action
        setSupportActionBar(findViewById(R.id.detail3Toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setTitle(R.string.item3)
        CenterTitle.centerTitle(detail3Toolbar as Toolbar,true)
    }

    //Navigation for Back Press
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}