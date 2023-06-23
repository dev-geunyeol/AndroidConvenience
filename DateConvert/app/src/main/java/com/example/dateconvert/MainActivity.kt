package com.example.dateconvert

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.dateconvert.databinding.ActivityMainBinding
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Locale

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bConvert.setOnClickListener {
            val target = binding.etDate.text
            if(target.isBlank()) toast("데이터를 입력해 주세요")
            else convert(target.toString())
        }
    }

    private fun convert(target: String) {
        try {
            val sdf = SimpleDateFormat("yyyyMMdd", Locale.getDefault())
            val date = sdf.parse(target)
            val msg = StringBuffer()
            msg.append("Type : ${date::class.java}")
            msg.append("\nDate : $date")
            binding.tvMsg.text = msg
        } catch(e: ParseException) {
            toast("변환에 실패했습니다")
        }
    }

    private fun toast(msg: String) =
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}