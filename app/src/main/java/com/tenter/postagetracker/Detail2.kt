//Powered by Tenter
package com.tenter.postagetracker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.ravikoradiya.library.CenterTitle
import kotlinx.android.synthetic.main.activity_detail2.*

class Detail2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail2)

        //Action Bar Action
        setSupportActionBar(findViewById(R.id.detail2Toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setTitle(R.string.item2)
        CenterTitle.centerTitle(detail2Toolbar as Toolbar,true)
    }

    //Navigation for Back Press
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}