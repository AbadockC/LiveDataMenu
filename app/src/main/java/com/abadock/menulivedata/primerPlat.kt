package com.abadock.menulivedata

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.abadock.menulivedata.ViewModel.MenuViewModel
import com.abadock.menulivedata.databinding.FragmentPrimerPlatBinding

class primerPlat: Fragment() {

    private val viewModel: MenuViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentPrimerPlatBinding.inflate(inflater)

        binding.buttonPrimerPlat.setOnClickListener {
            val cantPrimerPlat = binding.editTextNumber.text.toString().toInt()

            viewModel.addCantPrimerPlat("Patates", 3, cantPrimerPlat)
            findNavController().navigate(R.id.action_primerPlat_to_segonBegudes, null)
        }

        return binding.root

    }
}
