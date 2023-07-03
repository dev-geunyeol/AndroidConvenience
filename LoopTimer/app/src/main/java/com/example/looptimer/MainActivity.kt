package com.example.looptimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.looptimer.databinding.ActivityMainBinding
import java.util.Random
import java.util.Timer
import java.util.TimerTask

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var random = Random()
    private lateinit var timer: Timer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bStart.setOnClickListener { timerStart() }
        binding.bStop.setOnClickListener { timer.cancel() }
    }

    private fun timerStart() {
        timer = Timer()
        timer.schedule(object: TimerTask() {
            override fun run() {
                runOnUiThread {
                    binding.tvBody.text = "${random.nextInt(10) + 1}"
                }
            }
        } , 0, 10)
    }
}