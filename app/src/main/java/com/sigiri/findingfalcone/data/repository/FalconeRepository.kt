package com.sigiri.findingfalcone.data.repository

import com.sigiri.findingfalcone.data.api.FalconsApiInterface
import com.sigiri.findingfalcone.data.model.FindFalconeRequest
import com.sigiri.findingfalcone.data.model.FindingFalconeResponse
import com.sigiri.findingfalcone.data.model.Planet
import com.sigiri.findingfalcone.data.model.Token
import com.sigiri.findingfalcone.data.model.Vehicles

class FalconeRepository(private val falconeApiInterface: FalconsApiInterface) {

    suspend fun getPlanets(): List<Planet>? {
        return falconeApiInterface.getPlanets().body()
    }

    suspend fun getVehicles(): Vehicles? {
        return falconeApiInterface.getVehicles().body()
    }

    suspend fun getToken(): Token? {
        return falconeApiInterface.getToken().body()
    }

    suspend fun findFalcone(request: FindFalconeRequest): FindingFalconeResponse? {
        return falconeApiInterface.findFalcone(request).body()
    }

}