package com.sh.cccandroidtest.data.models.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "person")
data class Person(
    @PrimaryKey val id: String,
    @SerializedName("first_name") @ColumnInfo(name = "first_name") val firstName: String,
    @SerializedName("last_name") @ColumnInfo(name = "last_name") val lastName: String,
    val email: String,
    @SerializedName("phone_number") @ColumnInfo(name = "phone_number") val phoneNumber: String
)
