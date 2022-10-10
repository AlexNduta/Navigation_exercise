package com.example.navigation_exercise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.navigation_exercise.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
private lateinit var _binding:FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
      val view =_binding.root

        _binding.btnTerms.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_terrmsFragment)
      }

        _binding.btnSignup.setOnClickListener {
            view.findNavController().navigate(R.id.action_homeFragment_to_signupFragment)
        }
        return view
    }
}