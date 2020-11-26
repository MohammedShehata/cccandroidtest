package com.sh.cccandroidtest.data.repositories

import android.content.Context
import com.sh.cccandroidtest.data.sources.locale.DataFileManager
import com.sh.cccandroidtest.data.sources.locale.RoomDatabaseManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainRepository(private val context: Context, private val viewModelScope: CoroutineScope) :
    RoomDatabaseManager.DatabaseListener {

    private val estimateDao = RoomDatabaseManager.getInstance(context, this).estimateDap()
    private val personDao = RoomDatabaseManager.getInstance(context, this).personDao()

    fun init() {
        viewModelScope.launch {
            withContext(Dispatchers.Default) {

                val data = DataFileManager.newInstance().getData(context)

                estimateDao.insert(data.estimate)
                personDao.insert(data.person)
            }
        }
    }

    override fun onDatabaseCreated() {
    }
}