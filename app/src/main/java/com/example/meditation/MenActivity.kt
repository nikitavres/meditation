package com.example.meditation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.meditation.databinding.ActivityMenBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_men)
        navView.setupWithNavController(navController)
    }
}