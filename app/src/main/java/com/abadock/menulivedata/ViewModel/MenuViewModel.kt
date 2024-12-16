package com.abadock.menulivedata.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MenuViewModel: ViewModel() {

    private var _plat = MutableLiveData<PlatModel>()
    val plat: LiveData<PlatModel> = _plat

    private var _beguda = MutableLiveData<BegudaModel>()
    val beguda: LiveData<BegudaModel> = _beguda

    private var _menuClient = MutableLiveData<MenuModel>()
    val menuClient: LiveData<MenuModel> = _menuClient

    fun addCantPrimerPlat(plat_nom: String, preu: Int, cant: Int) {
        _plat.value = PlatModel(plat_nom, preu)
        println(_plat.value.toString())
        _beguda.value = BegudaModel("", 0)

        _menuClient.value = MenuModel(cant, 0, plat.value!!, beguda.value!!)
    }


    fun addCantBegudes(beguda_nom: String, preu: Int, cant: Int) {
        _plat.value = _plat.value
        _beguda.value = BegudaModel(beguda_nom, preu)

        _menuClient.value = MenuModel(menuClient.value!!.cantPrimerPlat, cant, plat.value!!, beguda.value!!)

    }

    fun getMenu() {
        _menuClient.value = menuClient.value
    }
}