package com.example.navigation_exercise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigation_exercise.databinding.FragmentWelcomeBinding


class WelcomeFragment : Fragment() {
 private lateinit var _binding:FragmentWelcomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentWelcomeBinding.inflate(layoutInflater, container, false)
        val view = _binding.root

        // Inflate the layout for this fragment

val name = arguments!!.getString("input_name")
        val email = arguments!!.getString("input_email")
        _binding.nameTextView.text= name
        _binding.emailTextView.text= email



        return view
    }
}
