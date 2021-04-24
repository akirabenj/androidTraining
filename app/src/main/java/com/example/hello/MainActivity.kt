package com.example.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var loginText: TextView? = null
    var plainText: TextView? = null
    var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loginText = findViewById(R.id.loginText)
        plainText = findViewById(R.id.editText)
        button = findViewById(R.id.button)

        button?.setOnClickListener {
            loginText?.text = plainText?.text
        }
    }
}