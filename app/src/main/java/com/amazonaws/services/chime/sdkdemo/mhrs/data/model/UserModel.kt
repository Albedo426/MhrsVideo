package com.amazonaws.services.chime.sdkdemo.mhrs.data.model

data class UserModel(
    val jwt:String,
    val BirthDate: String,
    val FullName: String,
    val Gender: Int,
    val UserBalance: Double,
    val email: String,
    val id: Int,
    val username: String,
)