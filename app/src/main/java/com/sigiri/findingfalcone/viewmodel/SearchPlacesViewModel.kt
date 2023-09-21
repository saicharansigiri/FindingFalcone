package com.sigiri.findingfalcone.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sigiri.findingfalcone.data.model.Planet
import com.sigiri.findingfalcone.data.model.Token
import com.sigiri.findingfalcone.data.model.Vehicle
import com.sigiri.findingfalcone.data.repository.FalconeRepository
import kotlinx.coroutines.launch

class SearchPlacesViewModel(private val repository: FalconeRepository) : ViewModel() {

    private val _planetsLiveData: MutableLiveData<List<Planet>> = MutableLiveData<List<Planet>>()
    val planets = _planetsLiveData

    private val _vehicles: MutableLiveData<List<Vehicle>> = MutableLiveData<List<Vehicle>>()
    val vehicle = _vehicles

    init {
        viewModelScope.launch {
            getPlanets()
            getVehicles()
        }
    }

    private suspend fun getPlanets() {
        val response = repository.getPlanets()
        response?.let {
            _planetsLiveData.postValue(it)
        }
    }

    private suspend fun getVehicles() {
        val response = repository.getVehicles()
        response?.let {
            _vehicles.postValue(it)
        }
    }
}