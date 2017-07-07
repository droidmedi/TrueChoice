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
    internal var serieN1 = intArrayOf(R.array.N1S1, R.array.N1S2, R.array.N1S3, R.array.N1S4, R.array.N1S5, R.array.N1S6, R.array.N1S7, R.array.N1S8, R.array.N1S9 , R.array.N1S10)
    internal var i = 0
    internal var k = 0

    internal lateinit var ArrayNumber: Array<String>


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

        if (niveau=="niveau1") {
            ArrayNumber = resources.getStringArray(serieN1[i])
        }
        changearray(i)

        case1.setOnClickListener {
            k=k+1
            i=i+1
            resultat(1)


        }
        case2.setOnClickListener {
            k=k+1
            i=i+1
            resultat(2)

        }
        case3.setOnClickListener {
            k=k+1
            i=i+1
            resultat(3)
            changearray(i)
        }
        case4.setOnClickListener {
            k=k+1
            i=i+1
            resultat(4)

        }
        case5.setOnClickListener {
            k=k+1
            i=i+1
            resultat(5)

        }
        case6.setOnClickListener {
            k=k+1
            i=i+1
            resultat(6)

        }

    }

    private fun  resultat(j: Int) {
        if (k==9){
            finish()

        }


        if (k<11){
            changearray(i)
        }


    }

    private fun  changearray(i: Int) {
        ArrayNumber = resources.getStringArray(serieN1[i])
        tv1.setText(ArrayNumber[0])
        tv2.setText(ArrayNumber[1])
        tv3.setText(ArrayNumber[2])
        tv4.setText(ArrayNumber[3])
        tv5.setText(ArrayNumber[4])
        tv6.setText(ArrayNumber[5])
    }

}
