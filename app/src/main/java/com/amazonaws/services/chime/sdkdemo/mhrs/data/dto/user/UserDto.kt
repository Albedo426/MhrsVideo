package com.amazonaws.services.chime.sdkdemo.mhrs.data.dto.user

import com.amazonaws.services.chime.sdkdemo.mhrs.data.model.UserModel

data class UserDto(
    val jwt: String,
    val user: User
)
fun UserDto.toUserModel(): UserModel {
    return UserModel(
        jwt =jwt,
        BirthDate = user.BirthDate,
        FullName = user.FullName,
        Gender = user.Gender,
        UserBalance = user.UserBalance,
        email = user.email,
        id =user.id,
        username = user.username)
}