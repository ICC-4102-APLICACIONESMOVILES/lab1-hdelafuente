package com.example.hdelafuente.log_in

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class main : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn_logout = findViewById<Button>(R.id.btn_logout)
        var btn_redirect = findViewById<Button>(R.id.btn_redirect_login)

        btn_logout.setVisibility(View.INVISIBLE)
        btn_redirect.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View) {
                val intent = Intent(this@main, log_in::class.java)
                startActivity(intent)
            }
        })

    }
}
