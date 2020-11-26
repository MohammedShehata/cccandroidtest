package com.sh.cccandroidtest.data.sources.locale

import android.content.Context
import com.google.gson.Gson
import com.sh.cccandroidtest.data.models.locale.Data

class DataFileManager {
    companion object {

        private val TAG = DataFileManager::class.java.simpleName
        fun newInstance(): DataFileManager {
            return DataFileManager()
        }
    }

    fun getData(context: Context): Data {
        val inputStream = context.assets.open("data.json")
        val size: Int = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()

        val json = String(buffer)
        return Gson().fromJson(json, Data::class.java)
    }
}