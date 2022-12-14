package com.example.navhostnavigation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navhostnavigation.R
import com.example.navhostnavigation.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {
    var binding : FragmentThirdBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(layoutInflater, container, false)

        buttonClick(binding)

        // Inflate the layout for this fragment
        return binding?.root
    }

    private fun buttonClick(binding: FragmentThirdBinding?) {
        binding?.thirdButton?.setOnClickListener {
            // taking the user to the exit fragment
            findNavController().navigate(R.id.action_thirdFragment_to_exitFragment)
        }
    }
}