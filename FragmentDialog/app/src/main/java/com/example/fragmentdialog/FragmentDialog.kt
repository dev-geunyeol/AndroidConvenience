package com.example.fragmentdialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.fragmentdialog.databinding.DialogFragmentCheckBinding

class FragmentDialog: DialogFragment() {
    private lateinit var binding: DialogFragmentCheckBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DialogFragmentCheckBinding.inflate(layoutInflater)
        binding.bOk.setOnClickListener { dismiss() }
        return binding.root
    }
}