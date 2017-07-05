package com.droidmedi.medidroid.truechoice

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import kotlinx.android.synthetic.main.activity_niveau.*
import kotlinx.android.synthetic.main.content_acceuil.*
import kotlinx.android.synthetic.main.content_niveau.*

var niveau =""

class Niveau : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_niveau)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        if (page=="objet") {
            btnN1.setOnClickListener {
               niveau="niveau1"
                startActivity(Intent(this, Objet::class.java))
            }
            btnN2.setOnClickListener {
               niveau="niveau2"
                startActivity(Intent(this, Objet::class.java))
            }
            btnN3.setOnClickListener {
               niveau="niveau3"
                startActivity(Intent(this, Objet::class.java))
            }
            btnN4.setOnClickListener {
               niveau="niveau4"
                startActivity(Intent(this, Objet::class.java))
            }
            btnN5.setOnClickListener {
               niveau="niveau5"
                startActivity(Intent(this, Objet::class.java))
            }
            btnN6.setOnClickListener {
               niveau="niveau6"
                startActivity(Intent(this, Objet::class.java))
            }
            btnN7.setOnClickListener {
               niveau="niveau7"
                startActivity(Intent(this, Objet::class.java))
            }
            btnN8.setOnClickListener {
               niveau="niveau8"
                startActivity(Intent(this, Objet::class.java))
            }
            btnN9.setOnClickListener {
                niveau="niveau9"
                startActivity(Intent(this, Objet::class.java))
            }
        }
        if (page=="number") {
            btnN1.setOnClickListener {
               niveau="niveau1"
                startActivity(Intent(this, Number::class.java))
            }
            btnN2.setOnClickListener {
                niveau="niveau2"
                startActivity(Intent(this, Number::class.java))
            }
            btnN3.setOnClickListener {
               niveau="niveau3"
                startActivity(Intent(this, Number::class.java))
            }
            btnN4.setOnClickListener {
                niveau="niveau4"
                startActivity(Intent(this, Number::class.java))
            }
            btnN5.setOnClickListener {
               niveau="niveau5"
                startActivity(Intent(this, Number::class.java))
            }
            btnN6.setOnClickListener {
                niveau="niveau6"
                startActivity(Intent(this, Number::class.java))
            }
            btnN7.setOnClickListener {
                niveau="niveau7"
                startActivity(Intent(this, Number::class.java))
            }
            btnN8.setOnClickListener {
                niveau="niveau8"
                startActivity(Intent(this, Number::class.java))
            }
            btnN9.setOnClickListener {
                niveau="niveau9"
                startActivity(Intent(this, Number::class.java))
            }
        }


    }

}
