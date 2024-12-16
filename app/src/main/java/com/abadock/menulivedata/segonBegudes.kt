package com.abadock.menulivedata

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.abadock.menulivedata.ViewModel.MenuViewModel
import com.abadock.menulivedata.databinding.FragmentSegonBegudesBinding

class segonBegudes : Fragment() {

    private val viewModel: MenuViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentSegonBegudesBinding.inflate(inflater)

        binding.buttonBegudes.setOnClickListener {
            val cantBegudes = binding.editTextNumber.text.toString().toInt()

            viewModel.addCantBegudes("Fanta", 4, cantBegudes)
            findNavController().navigate(R.id.action_segonBegudes_to_finalPreu, null)
        }

        return binding.root

    }
}