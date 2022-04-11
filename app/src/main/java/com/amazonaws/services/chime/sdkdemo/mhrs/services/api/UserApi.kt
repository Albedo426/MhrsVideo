package com.mobilist.mhrs.services.api

import com.amazonaws.services.chime.sdkdemo.mhrs.data.dto.calender.get.CalenderDto
import com.amazonaws.services.chime.sdkdemo.mhrs.data.dto.calender.get.CalenderDtoItem
import com.amazonaws.services.chime.sdkdemo.mhrs.data.dto.user.UserDto
import com.amazonaws.services.chime.sdkdemo.mhrs.data.dto.user.test.Users
import com.amazonaws.services.chime.sdkdemo.mhrs.data.model.LoginModel
import com.amazonaws.services.chime.sdkdemo.mhrs.data.model.calender_model.CalenderRequestModel
import io.reactivex.Single
import okhttp3.ResponseBody
import retrofit2.http.*

interface UserApi {
    @POST("auth/local")
    fun userLogin(@Body() loginUser: LoginModel): Single<UserDto>//liste içinde countryler fgeliyor
    @GET("users")
    fun getDoctor(): Single<Users>//liste içinde countryler fgeliyor


    @GET("calenders")
    fun getCalender(): Single<CalenderDto>//liste içinde countryler fgeliyor
    @POST("calenders")
    fun addCalender(@Body() calenderRequestModel: CalenderRequestModel): Single<CalenderDtoItem>//liste içinde countryler fgeliyor


    @POST("Prod/join")
    fun callVideoAudio(
        @Query("title") title: String,
        @Query("name") name: String,
        @Query("region") region: String): Single<ResponseBody>//liste içinde countryler fgeliyor
    //gettime o anki zaman
}