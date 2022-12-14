package com.example.navhostnavigation.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navhostnavigation.R
import com.example.navhostnavigation.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    var binding : FragmentHomeBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)

        buttonClick(binding)

        // Inflate the layout for this fragment
        return binding?.root
    }

    private fun buttonClick(binding: FragmentHomeBinding?) {
        binding?.homeButton?.setOnClickListener {
            // Taking the User to the second fragment
            findNavController().navigate(R.id.action_homeFragment_to_secondFragment)
            Log.e("checkClick", "buttonClick: Home fragment to second fragment")
        }
    }
}