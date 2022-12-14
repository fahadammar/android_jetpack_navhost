package com.example.navhostnavigation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navhostnavigation.R
import com.example.navhostnavigation.databinding.FragmentExitBinding
import kotlin.system.exitProcess

class ExitFragment : Fragment() {
    var binding : FragmentExitBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentExitBinding.inflate(inflater, container, false)

        buttonClicks(binding)


        // Inflate the layout for this fragment
        return binding?.root
    }

    private fun buttonClicks(binding: FragmentExitBinding?) {
        binding?.exitButton?.setOnClickListener {
            // It will close the entire application and will take to the user to the home screen
            exitProcess(0)
        }

        binding?.homeButton?.setOnClickListener {
            // if the user wants to go the home fragment
            findNavController().navigate(R.id.action_exitFragment_to_homeFragment)
        }
    }

}