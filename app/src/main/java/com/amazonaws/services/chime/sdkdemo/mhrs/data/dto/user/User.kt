package com.amazonaws.services.chime.sdkdemo.mhrs.data.dto.user

import java.io.Serializable

data class User(
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
    val updated_at: String,
    val username: String
):Serializable{
    var imagePath:String=""
    var rol:String=""
    var color:String=""
}