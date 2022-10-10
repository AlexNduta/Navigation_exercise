package com.example.navigation_exercise

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import com.example.navigation_exercise.databinding.FragmentSignupBinding


class SignupFragment : Fragment() {
   private lateinit var _binding:FragmentSignupBinding

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)

       override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            _binding = FragmentSignupBinding.inflate(layoutInflater, container, false)
            val view = _binding.root

            _binding.btnSubmit.setOnClickListener {

                if(TextUtils.isEmpty(_binding.editTextTextPersonName.text.toString())){
            var bundle= bundleOf("input_text" to _binding.editTextTextPersonName.text.toString())


                    it.findNavController().navigate(R.id.action_signupFragment_to_emailFragment, bundle)
                }else{
                    Toast.makeText(activity,"Username cannot be empty", Toast.LENGTH_LONG).show()
                }


            }
            return view
        }
    }
