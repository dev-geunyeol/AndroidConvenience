package com.example.viewanddatabinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var bViewBinding: Button
    private lateinit var bDataBinding: Button
    private lateinit var tvCount: TextView
    private lateinit var bUp: Button
    private lateinit var bDown: Button
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // view init
        bViewBinding = findViewById(R.id.b_viewBinding)
        bDataBinding = findViewById(R.id.b_dataBinding)
        tvCount = findViewById(R.id.tv_count)
        bUp = findViewById(R.id.b_up)
        bDown = findViewById(R.id.b_down)

        // count up & down event
        bUp.setOnClickListener { tvCount.text = "${++count}" }
        bDown.setOnClickListener { tvCount.text = "${--count}" }

        // activity move
        bViewBinding.setOnClickListener {
            startActivity(Intent(this, ViewBindingActivity::class.java))
        }
        bDataBinding.setOnClickListener {
            startActivity(Intent(this, DataBindingActivity::class.java))
        }
    }
}