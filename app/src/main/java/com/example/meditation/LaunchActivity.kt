package com.example.meditation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LaunchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this@LaunchActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}