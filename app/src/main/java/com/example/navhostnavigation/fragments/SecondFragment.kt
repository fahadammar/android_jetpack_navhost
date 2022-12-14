package com.example.navhostnavigation.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navhostnavigation.R
import com.example.navhostnavigation.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    var binding : FragmentSecondBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater, container, false)

        buttonClick(binding)

        // Inflate the layout for this fragment
        return binding?.root
    }

    private fun buttonClick(binding: FragmentSecondBinding?) {
        binding?.secondButton?.setOnClickListener {
            // to take the user to third fragment
            findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
            Log.e("checkClick", "buttonClick: second fragment to third fragment")
        }
    }

}