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
import com.example.navigation_exercise.databinding.FragmentEmailBinding

class EmailFragment : Fragment() {

private lateinit var _bining:FragmentEmailBinding

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {

            _bining= FragmentEmailBinding.inflate(layoutInflater,container, false)
             val view = _bining.root
// user input from the name fragment
            val name =arguments!!.getString("input_text")

          _bining.btnSubmitEmail.setOnClickListener {

              if(!TextUtils.isEmpty( _bining.editTextEmail.text.toString())){
                val bundle= bundleOf("input_email" to _bining.editTextEmail.text.toString(),
                "input_name" to name)

                  it.findNavController().navigate(R.id.action_emailFragment_to_welcomeFragment, bundle)

              }else{
                  Toast.makeText(activity, "Please enter your email", Toast.LENGTH_LONG).show()
              }

            }
            return view
        }

    }
