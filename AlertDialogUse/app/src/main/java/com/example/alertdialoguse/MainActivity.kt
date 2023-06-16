package com.example.alertdialoguse

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.alertdialoguse.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bType1.setOnClickListener { defaultDialog() }
        binding.bType2.setOnClickListener { checkDialog() }
        binding.bType3.setOnClickListener { radioDialog() }
    }

    private fun defaultDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("제목")
            .setMessage("메시지")
            .setPositiveButton("확인") { dialog, _ ->
                showToast("확인하였습니다!!")
                dialog.dismiss()
            }
            .setNegativeButton("취소") { dialog, _ -> dialog.dismiss() }
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    private fun checkDialog() {
        val dataItems = arrayOf("축구", "농구", "야구")
        val checkItems = booleanArrayOf(false, false, false) // 초기 체크 상태
        val builder = AlertDialog.Builder(this)
        builder.setTitle("취미를 선택해주세요")
            .setMultiChoiceItems(dataItems, checkItems) { _, which, isChecked ->
                checkItems[which] = isChecked // 항목 선택 & check update
            }
            .setPositiveButton("확인") { dialog, _ ->
                val selectItems = mutableListOf<String>()
                for((idx, item) in checkItems.withIndex()) {
                    if(item) selectItems.add(dataItems[idx])
                }
                showToast("선택된 취미 : $selectItems")
                dialog.dismiss()
            }
            .setNegativeButton("취소") { dialog, _ -> dialog.dismiss() }
        val dialog = builder.create()
        dialog.show()
    }

    private fun radioDialog() {
        val items = arrayOf("바다가 최고다", "산이 최고다", "둘 다 좋지")
        var selectIndex = 0 // 기본 선택 index 값
        val builder = AlertDialog.Builder(this)
        builder.setTitle("당신의 선택은?")
            .setSingleChoiceItems(items, selectIndex) { _, which ->
                selectIndex = which // 항목 선택 & index update
            }
            .setPositiveButton("확인") { dialog, _ ->
                showToast(items[selectIndex])
                dialog.dismiss()
            }
            .setNegativeButton("취소") { dialog, _ -> dialog.dismiss() }
        val dialog = builder.create()
        dialog.show()
    }

    private fun showToast(msg: String) { Toast.makeText(this, msg, Toast.LENGTH_SHORT).show() }
}