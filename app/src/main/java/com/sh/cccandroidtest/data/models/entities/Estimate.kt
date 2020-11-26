package com.sh.cccandroidtest.data.models.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "estimate")
data class Estimate(
    @PrimaryKey val id: String,
    val company: String,
    val address: String,
    val number: Int,
    @SerializedName("revision_number") @ColumnInfo(name = "revision_number") val revisionNumber: Int,
    @SerializedName("created_date") @ColumnInfo(name = "created_date") val createdAt: String,
    @SerializedName("requested_by") @ColumnInfo(name = "requested_by") val requestedBy: String,
    val contact: String
)
