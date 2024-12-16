package com.abadock.menulivedata

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.abadock.menulivedata.ViewModel.MenuViewModel
import com.abadock.menulivedata.databinding.FragmentFinalPreuBinding

class finalPreu : Fragment() {
    private val viewModel: MenuViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentFinalPreuBinding.inflate(inflater)

        viewModel.getMenu()

        viewModel.menuClient.observe(viewLifecycleOwner) { menu ->
            binding.QuantitatPrimerPlat.text = "${menu.cantPrimerPlat}"
            binding.QuantitatBegudes.text = "${menu.cantBegudes}"

//            if (menu.cantPrimerPlat > 10){
//                binding.PreuPrimerPlat.text = "${menu.PreuPrimerPlat * menu.cantPrimerPlat - (menu.PreuPrimerPlat * menu.cantPrimerPlat)/100 * 20} €"
//            }
//            else{
//                binding.PreuPrimerPlat.text = "${menu.PreuPrimerPlat * menu.cantPrimerPlat} €"
//            }
//
//            if (menu.cantBegudes > 10){
//                binding.PreuBegudes.text = "${menu.PreuBegudes * menu.cantBegudes - (menu.PreuBegudes * menu.cantBegudes)/100 * 20} €"
//            }
//            else{
//                binding.PreuBegudes.text = "${menu.PreuBegudes * menu.cantBegudes} €"
//            }
//
//            binding.PreuTotal.text =
//                "${menu.PreuBegudes * menu.cantBegudes + menu.PreuPrimerPlat * menu.cantPrimerPlat} €"
        }

        binding.updateButton.setOnClickListener {

        }


        return binding.root

    }
}