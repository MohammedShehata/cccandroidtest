package com.sh.cccandroidtest.data.models.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "estimate")
data class Estimate(
    @PrimaryKey val id: String,
    val company: String,
    val address: String,
    val number: Int,
    @ColumnInfo(name = "revision_number") val revisionNumber: Int,
    @ColumnInfo(name = "created_date") val createdAt: String,
    @ColumnInfo(name = "requested_by") val requestedBy: String,
    val contact: String
)
