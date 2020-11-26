package com.sh.cccandroidtest.data.sources.locale.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.sh.cccandroidtest.data.models.FullEstimate

@Dao
interface FullEstimateDao {

    @Transaction
    @Query("SELECT * FROM estimate")
    fun getFullEstimate(): FullEstimate

}