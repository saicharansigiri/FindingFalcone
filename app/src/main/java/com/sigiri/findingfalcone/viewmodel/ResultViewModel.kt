package com.sigiri.findingfalcone.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sigiri.findingfalcone.data.model.FindFalconeRequest
import com.sigiri.findingfalcone.data.model.Token
import com.sigiri.findingfalcone.data.repository.FalconeRepository

class ResultViewModel(private val repository: FalconeRepository) : ViewModel() {
    private val _token: MutableLiveData<Token> = MutableLiveData<Token>()
    val token = _token

    suspend fun getToken() {
        val response = repository.getToken()
        response?.let {
            _token.postValue(it)
        }
    }

    suspend fun findFalcone(request: FindFalconeRequest){
        val response = repository.findFalcone(request)

    }


}