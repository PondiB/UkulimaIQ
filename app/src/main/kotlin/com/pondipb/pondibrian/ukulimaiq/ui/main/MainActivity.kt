package com.pondipb.pondibrian.ukulimaiq.ui.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pondipb.pondibrian.ukulimaiq.databinding.ActivityMainBinding
import com.pondipb.pondibrian.ukulimaiq.ui.menu.MenuActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonGetStarted.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
        }
    }
}
