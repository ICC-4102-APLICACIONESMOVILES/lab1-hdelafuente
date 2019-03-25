package com.example.hdelafuente.log_in

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class log_in : AppCompatActivity() {

    fun isEmailValid(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        var et_username = findViewById<EditText>(R.id.user_name)
        var et_password = findViewById<EditText>(R.id.password)
        var btn_reset = findViewById<Button>(R.id.btn_reset)
        var btn_submit = findViewById<Button>(R.id.btn_submit)

        btn_reset.setOnClickListener {
            et_username.setText("")
            et_password.setText("")
        }
        btn_submit.setOnClickListener {
            val user_name = et_username.text
            val password = et_password.text

            if (isEmailValid(user_name.toString())){
                val text = "Username: " + user_name + "\nPassword: " + password
                Toast.makeText(this@log_in, text, Toast.LENGTH_LONG).show()
                val intent = Intent(this@log_in, main::class.java)
                intent.putExtra("username", user_name)
                intent.putExtra("password", password)
                setResult(Activity.RESULT_OK, intent)
                finish()

            }
            else {
                et_username.setText("")
                et_password.setText("")
                Toast.makeText(this@log_in, "Enter a valid email", Toast.LENGTH_LONG).show()
            }
        }
    }
}