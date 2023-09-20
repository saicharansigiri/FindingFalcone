package com.sigiri.findingfalcone.data.model

data class FindFalconeRequest(
    val token: String,
    val planetNames: List<String>,
    val vehicleNames: List<String>
)