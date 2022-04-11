package com.mobilist.mhrs.services

import com.amazonaws.services.chime.sdkdemo.mhrs.data.dto.calender.get.CalenderDto
import com.amazonaws.services.chime.sdkdemo.mhrs.data.dto.calender.get.CalenderDtoItem
import com.amazonaws.services.chime.sdkdemo.mhrs.data.dto.user.UserDto
import com.amazonaws.services.chime.sdkdemo.mhrs.data.dto.user.test.Users
import com.amazonaws.services.chime.sdkdemo.mhrs.data.model.LoginModel
import com.amazonaws.services.chime.sdkdemo.mhrs.data.model.calender_model.CalenderRequestModel
import com.mobilist.mhrs.services.api.UserApi
import com.mobilist.mhrs.util.Ext.Companion.BASE_URL
import com.mobilist.mhrs.util.Ext.Companion.BASE_URL_AMAZON
import io.reactivex.Single
import okhttp3.ResponseBody
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class StrapiApiServices {
     val api: UserApi = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(UserApi::class.java)

    private val apiAmazon: UserApi = Retrofit.Builder()
        .baseUrl(BASE_URL_AMAZON)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(UserApi::class.java)
    fun userLogin(loginUser: LoginModel): Single<UserDto> {
        return api.userLogin(loginUser)
    }
    fun getDoctor(): Single<Users> {
        return api.getDoctor()
    }
    fun callVideoAudio(title:String,name:String):Single<ResponseBody>{
        return  apiAmazon.callVideoAudio(title,name,"us-east-1")
    }
    fun getCalender():Single<CalenderDto>{
        return  api.getCalender()
    }fun addCalender(calenderRequestModel: CalenderRequestModel):Single<CalenderDtoItem>{
        return  api.addCalender(calenderRequestModel)
    }
}