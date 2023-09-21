package com.sigiri.findingfalcone.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sigiri.findingfalcone.data.repository.FalconeRepository

class MyViewModelFactory(private val repository: FalconeRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SearchPlacesViewModel::class.java)) {
            return SearchPlacesViewModel(repository) as T
        }
        if (modelClass.isAssignableFrom(ResultViewModel::class.java)) {
            return ResultViewModel(repository) as T
        }
        return super.create(modelClass)
    }
}