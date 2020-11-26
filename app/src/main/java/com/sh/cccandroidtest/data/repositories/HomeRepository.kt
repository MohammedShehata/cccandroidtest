package com.sh.cccandroidtest.data.repositories

import android.content.Context
import com.sh.cccandroidtest.data.sources.locale.RoomDatabaseManager

class HomeRepository(private val context: Context) : RoomDatabaseManager.DatabaseListener {

    val fullEstimate =
        RoomDatabaseManager.getInstance(context, this).fullEstimateDao().getFullEstimate()


    override fun onDatabaseCreated() {

    }
}