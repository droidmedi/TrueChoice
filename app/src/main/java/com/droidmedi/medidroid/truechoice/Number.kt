package com.droidmedi.medidroid.truechoice

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import kotlinx.android.synthetic.main.activity_number.*
import kotlinx.android.synthetic.main.content_number.*



class Number : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
        var ArrayNumber = resources.getStringArray(R.array.N1S1)

        if (niveau=="niveau1") {
            tv1.setText(ArrayNumber[0])
            tv2.setText(ArrayNumber[1])
            tv3.setText(ArrayNumber[2])
            tv4.setText(ArrayNumber[3])
            tv5.setText(ArrayNumber[4])
            tv6.setText(ArrayNumber[5])
        }

    }

}
