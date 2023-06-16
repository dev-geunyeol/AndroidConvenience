package com.example.fragmentuse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentuse.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bLogin.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .add(binding.flContain.id, LoginFragment())
                .commit()
        }
        binding.bHome.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .add(binding.flContain.id, HomeFragment())
                .commit()
        }
    }
}