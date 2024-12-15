package com.abadock.menulivedata.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MenuViewModel: ViewModel() {
    private var _menuClient = MutableLiveData<MenuModel>()
    val menuClient: LiveData<MenuModel> = _menuClient

    fun addCantPrimerPlat(cantPrimerPlat: Int) {
        _menuClient.value = MenuModel(cantPrimerPlat, 0, 0.0, 0.0)
    }

    fun addCantBegudes(cantSegonBegudes: Int) {
        _menuClient.value?.cantBegudes = (cantSegonBegudes)

        _menuClient.value?.PreuPrimerPlat = 10.0 // Get From DB
        _menuClient.value?.PreuBegudes = 10.0 // Get From DB
    }
}