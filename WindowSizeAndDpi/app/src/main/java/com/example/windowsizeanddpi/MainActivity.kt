package com.example.windowsizeanddpi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.Display
import androidx.core.hardware.display.DisplayManagerCompat
import com.example.windowsizeanddpi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bGet.setOnClickListener { getSizeAndDpi() }
    }

    private fun getSizeAndDpi() {
        val defaultDisplay = DisplayManagerCompat.getInstance(this).getDisplay(Display.DEFAULT_DISPLAY)
        defaultDisplay?.let {
            val displayContext = createDisplayContext(it)
            val width = displayContext.resources.displayMetrics.widthPixels
            val height = displayContext.resources.displayMetrics.heightPixels
            val dpi = displayContext.resources.displayMetrics.densityDpi
            binding.tvMsg.text = SizeDpi(width, height, dpi).toString()
        }
    }

    data class SizeDpi(
        val width: Int,
        val height: Int,
        val dpi: Int,
    ) {
        override fun toString(): String {
            return "width : $width\nheight : $height\ndpi : $dpi"
        }
    }
}