package com.example.tijoj.testing

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textstuff.setText("Start of log")

        val handler = Handler()

        for (i in 0..999) {
            handler.postDelayed({
                val text = "MOre logs"
                textstuff.text = text + "\n" + textstuff.text
            }, (500 * i).toLong())

        }


    }

}
