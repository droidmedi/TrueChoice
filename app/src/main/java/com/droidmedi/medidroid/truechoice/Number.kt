package com.droidmedi.medidroid.truechoice

import android.media.MediaPlayer
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.widget.Toast
import kotlinx.android.synthetic.main.content_number.*

var scor =0

class Number : AppCompatActivity() {
    internal var serieN1 = intArrayOf(R.array.N1S1, R.array.N1S2, R.array.N1S3, R.array.N1S4, R.array.N1S5, R.array.N1S6, R.array.N1S7, R.array.N1S8, R.array.N1S9 , R.array.N1S10,R.array.N1S11)
    internal var i = 0
    internal var sn = 1
    var tn =""
    var cn=""

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
            scor =0

        }
        changearray(i)

        case1.setOnClickListener {
            sn=sn+1
            cn = tv1.text as String
            resultat(tn,cn)
            changearray(i)


        }
        case2.setOnClickListener {
            sn=sn+1
            cn = tv2.text as String
            resultat(tn, cn)
            changearray(i)

        }
        case3.setOnClickListener {
            sn=sn+1
            cn = tv3.text as String
            resultat(tn, cn)
            changearray(i)

        }
        case4.setOnClickListener {
            sn=sn+1
            cn = tv4.text as String
            resultat(tn, cn)
            changearray(i)

        }
        case5.setOnClickListener {
            sn=sn+1
            cn = tv5.text as String
            resultat(tn, cn)
            changearray(i)

        }
        case6.setOnClickListener {
            sn=sn+1
            cn = tv6.text as String
            resultat(tn, cn)
        }

    }

    private fun  resultat(tnn: String, cnn: String) {
        i=i+1
     //   Toast.makeText(applicationContext, "fin oslna" + i , Toast.LENGTH_LONG).show()

        testresult(niveau ,sn,tnn)
        if (i<10 && tnn == cnn){
            scor = scor +1
            vrais(tnn)

        }
        if (i<10 && tnn != cnn) {
            faux()
        }
        if (i==10 ){
          if (tnn == cnn) {
              scor = scor + 1
              makesound()
              Toast.makeText(applicationContext, "votre score et :" + scor + "/10", Toast.LENGTH_LONG).show()
              finish()
          }
            else{
              Toast.makeText(applicationContext, "votre score et :"+ scor +"/10", Toast.LENGTH_LONG).show()
              finish()
          }

        }

    }

    private fun  testresult(niveau: String, sn: Int, j: String) {


    }

    private fun faux() {
       Toast.makeText(applicationContext, "Faux", Toast.LENGTH_LONG).show()
    //    case3.setBackgroundColor(R.color.colorAccent)
    }

    private fun  vrais(j: String) {
        Toast.makeText(applicationContext, "Vrais", Toast.LENGTH_LONG).show()
        makesound()
      //  case2.setBackgroundColor(R.color.colorvrais)
      //  tv4.setTextColor(R.color.colorvrais)



    }

    private fun  changearray(i: Int) {
        ArrayNumber = resources.getStringArray(serieN1[i])
        if (ArrayNumber[0].endsWith("v")){
            tv1.setText(ArrayNumber[0].substring(0,ArrayNumber[0].length-2))
            tn=ArrayNumber[0].substring(0,ArrayNumber[0].length-1)
        }
        else {tv1.setText(ArrayNumber[0])}

        if (ArrayNumber[1].endsWith("v")){
            tv2.setText(ArrayNumber[1].substring(0,ArrayNumber[1].length-2))
            tn=ArrayNumber[1].substring(0,ArrayNumber[1].length-2)
        }
        else {tv2.setText(ArrayNumber[1])}

        if (ArrayNumber[2].endsWith("v")){
            tv3.setText(ArrayNumber[2].substring(0,ArrayNumber[2].length-2))
            tn=ArrayNumber[2].substring(0,ArrayNumber[2].length-2)
        }
        else {tv3.setText(ArrayNumber[1])}

        if (ArrayNumber[3].endsWith("v")){
            tv4.setText(ArrayNumber[3].substring(0,ArrayNumber[3].length-2))
            tn=ArrayNumber[3].substring(0,ArrayNumber[3].length-2)
        }
        else {tv4.setText(ArrayNumber[1])}

        if (ArrayNumber[4].endsWith("v")){
            tv5.setText(ArrayNumber[4].substring(0,ArrayNumber[4].length-2))
            tn=ArrayNumber[4].substring(0,ArrayNumber[4].length-2)
        }
        else {tv5.setText(ArrayNumber[4])}

        if (ArrayNumber[5].endsWith("v")){
            tv6.setText(ArrayNumber[5].substring(0,ArrayNumber[5].length-2))
            tn=ArrayNumber[5].substring(0,ArrayNumber[5].length-2)
        }
        else {tv6.setText(ArrayNumber[5])}

    }
   fun makesound() {
       val mPlayer2: MediaPlayer
       mPlayer2 = MediaPlayer.create(this, R.raw.soundvrais)
       mPlayer2.start()

    }
}
