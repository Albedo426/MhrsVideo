package com.amazonaws.services.chime.sdkdemo.mhrs.data.dto.calender.get

data class CalenderDtoItem(
    val Title: String,
    val created_at: String,
    val id: Int,
    val published_at: String,
    val updated_at: String,
    val users_permissions_user: UsersPermissionsUser
)