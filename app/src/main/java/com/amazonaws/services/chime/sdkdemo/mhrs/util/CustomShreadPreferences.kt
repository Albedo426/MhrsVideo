package com.mobilist.mhrs.util

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import androidx.preference.PreferenceManager
import com.amazonaws.services.chime.sdkdemo.mhrs.data.model.UserModel
import com.google.gson.Gson


class CustomSharedPreferences {

    var gson = Gson()
    companion object{
        private const val IS_ANY_USER_AUTHENTICATED="isLoogin"
        private const val AUTHENTICATED_USER="user"
        private var sharedPreferences:SharedPreferences?=null
        @Volatile private var instance: CustomSharedPreferences?=null
        private val lock=Any()
        operator fun invoke(context: Context) : CustomSharedPreferences=instance ?: synchronized(lock){
            instance?:makeSharedPreferences(context)
        }
        private fun makeSharedPreferences(context: Context):CustomSharedPreferences{
            sharedPreferences=PreferenceManager.getDefaultSharedPreferences(context)
            return CustomSharedPreferences()
        }
    }

    fun saveUserLogin(isLogin:Boolean){
        sharedPreferences?.edit(commit =  true){
            putBoolean(IS_ANY_USER_AUTHENTICATED,isLogin)
        }
    }
    fun saveUser(user: UserModel){
        sharedPreferences?.edit(commit =  true){
            val json = gson.toJson(user)
            putString(AUTHENTICATED_USER,json)
        }
    }
    fun getUser():UserModel {
        val gson = Gson()
        val json: String? = sharedPreferences?.getString(AUTHENTICATED_USER, "")
        return gson.fromJson(json, UserModel::class.java)
    }
    fun isLoginUser()= sharedPreferences?.getBoolean(IS_ANY_USER_AUTHENTICATED,false)
    fun logoutUser()=sharedPreferences?.edit(commit =  true){
        remove(IS_ANY_USER_AUTHENTICATED)
    }
}