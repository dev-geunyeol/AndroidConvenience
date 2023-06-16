package com.example.viewanddatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewanddatabinding.databinding.ActivityViewBindingBinding

class ViewBindingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityViewBindingBinding
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewBindingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bUp.setOnClickListener { binding.tvCount.text = "${++count}" }
        binding.bDown.setOnClickListener { binding.tvCount.text = "${--count}" }
    }
}