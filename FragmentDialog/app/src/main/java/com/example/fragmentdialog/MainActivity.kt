package com.example.fragmentdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentdialog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bShow.setOnClickListener {
            FragmentDialog().show(supportFragmentManager, "dialog")
        }
    }
}