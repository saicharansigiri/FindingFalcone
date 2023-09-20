package com.sigiri.findingfalcone.data.model

data class Planets(
    val data: List<Planet>
)

data class Planet(
    val name: String,
    val distance: Int
)

data class Vehicles(
    val data: List<Vehicle>
)

data class Vehicle(
    val name: String,
    val totalNo: Int,
    val maxDistance: Int,
    val speed: Int
)

data class Token(
    val token: String
)