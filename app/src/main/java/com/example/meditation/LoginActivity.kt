package com.example.meditation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val button : Button = findViewById(R.id.button2)
        button.setOnClickListener {
            val intent = Intent(this@LoginActivity, MenActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}