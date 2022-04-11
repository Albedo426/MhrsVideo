package com.amazonaws.services.chime.sdkdemo.mhrs.data.dto.calender.get

data class UsersPermissionsUser(
    val BirthDate: String,
    val FullName: String,
    val Gender: Int,
    val UserBalance: Double,
    val blocked: Boolean,
    val confirmed: Boolean,
    val created_at: String,
    val email: String,
    val id: Int,
    val provider: String,
    val role: Int,
    val updated_at: String,
    val username: String
)