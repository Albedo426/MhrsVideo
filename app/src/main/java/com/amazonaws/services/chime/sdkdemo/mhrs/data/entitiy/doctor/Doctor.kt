package com.amazonaws.services.chime.sdkdemo.mhrs.data.entitiy.doctor

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
)
data class Doctor(
    var Username: String?,
    var UserPassword: String,
    var UserEmail: String,
    var Name: String?,
    var LastName: String?,
    var TC: String?,
    var Phone: String?,
){
    @PrimaryKey(autoGenerate = true)
    var UUID:Int=0
}
