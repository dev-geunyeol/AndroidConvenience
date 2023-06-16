package com.example.viewanddatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewanddatabinding.databinding.ActivityDataBindingBinding

class DataBindingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDataBindingBinding
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDataBindingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bUp.setOnClickListener { binding.count = ++count }
        binding.bDown.setOnClickListener { binding.count = --count }
    }
}