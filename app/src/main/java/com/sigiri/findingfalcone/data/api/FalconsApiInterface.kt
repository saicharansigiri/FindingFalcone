package com.sigiri.findingfalcone.data.api

import com.sigiri.findingfalcone.data.model.FindFalconeRequest
import com.sigiri.findingfalcone.data.model.FindingFalconeResponse
import com.sigiri.findingfalcone.data.model.Planets
import com.sigiri.findingfalcone.data.model.Token
import com.sigiri.findingfalcone.data.model.Vehicles
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST


interface FalconsApiInterface {

    companion object {
        private const val ACCEPT_JSON = "Accept: application/json"
        private const val CONTENT_TYPE_JSON = "Content-Type: application/json"
    }

    @GET("/planets")
    suspend fun getPlanets(): Response<Planets>

    @GET("/vehicles")
    suspend fun getVehicles(): Response<Vehicles>

    @Headers(ACCEPT_JSON)
    @POST("/token")
    suspend fun getToken(): Response<Token>

    @Headers(ACCEPT_JSON, CONTENT_TYPE_JSON)
    @POST("/find")
    suspend fun findFalcone(request: FindFalconeRequest): Response<FindingFalconeResponse>
}