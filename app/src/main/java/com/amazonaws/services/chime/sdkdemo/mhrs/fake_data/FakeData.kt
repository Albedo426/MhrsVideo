package com.amazonaws.services.chime.sdkdemo.mhrs.fake_data

import com.amazonaws.services.chime.sdkdemo.mhrs.data.model.Category
import com.amazonaws.services.chime.sdkdemo.mhrs.data.model.FakeTime
import com.amazonaws.services.chime.sdkdemo.mhrs.data.model.FakeUserAtt


class FakeData {
    val list: MutableList<Category> = mutableListOf(Category("Kardiyoloji","https://i.ibb.co/YR2vNrp/kalp.png","#E6EBF8"),
        Category("Beyin","https://i.ibb.co/K0L8m79/brain.png","#FBEFEC"),Category("Pediyatri","https://i.ibb.co/Yp08zFr/kalp-p.png","#F4F5F8"),
        Category("Diş","https://i.ibb.co/GH2FFd9/tooth.png","#FFFBEC"))
    fun getData():List<Category>{
        return list
    }
    val listUser: MutableList<FakeUserAtt> = mutableListOf(FakeUserAtt("https://i.ibb.co/p4ZqbwG/Rectangle-24.png","Kardiyoloji","#E7E7E9"),
        FakeUserAtt("https://i.ibb.co/7b6XPCh/pexels-anthony-shkraba-6749777-1.png","Beyin","#FFB1B1"),FakeUserAtt("https://i.ibb.co/KyXD0d2/usman-yousaf-p-Trhfmj2j-DA-unsplash-3.png","Diş","#DCEBE0"))
    fun getlistUserData():List<FakeUserAtt>{
        return listUser
    }

    val listTime: MutableList<FakeTime> = mutableListOf(FakeTime("1","9.00am",false),
        FakeTime("2","10.00am",false),FakeTime("3","11.00am",false),FakeTime("4","12.00am",false),FakeTime("5","13.00am",false)
        ,FakeTime("6","14.00am",false),FakeTime("7","15.00am",false),FakeTime("8","16.00am",false),FakeTime("9","17.00am",false))
    fun getlistlistTime():List<FakeTime>{
        return listTime
    }
}