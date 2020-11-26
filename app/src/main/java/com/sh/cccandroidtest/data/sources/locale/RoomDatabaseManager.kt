package com.sh.cccandroidtest.data.sources.locale

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.sh.cccandroidtest.data.models.entities.Estimate
import com.sh.cccandroidtest.data.models.entities.Person
import com.sh.cccandroidtest.data.sources.locale.dao.EstimateDao
import com.sh.cccandroidtest.data.sources.locale.dao.FullEstimateDao
import com.sh.cccandroidtest.data.sources.locale.dao.PersonDao

@Database(
    entities = [Estimate::class, Person::class],
    version = 1
)
abstract class RoomDatabaseManager : RoomDatabase() {

    abstract fun estimateDap(): EstimateDao
    abstract fun personDao(): PersonDao
    abstract fun fullEstimateDao(): FullEstimateDao

    companion object {
        private lateinit var instance: RoomDatabaseManager

        fun getInstance(context: Context, databaseListener: DatabaseListener): RoomDatabaseManager {
            if (!Companion::instance.isInitialized) {

                synchronized(this) {
                    instance = Room.databaseBuilder(
                        context,
                        RoomDatabaseManager::class.java, "ccc_android_text.db"
                    ).addCallback(object : RoomDatabase.Callback() {

                        override fun onCreate(db: SupportSQLiteDatabase) {
                            super.onCreate(db)
                            databaseListener.onDatabaseCreated()
                        }
                    }).build()
                }
            }
            return instance
        }
    }

    interface DatabaseListener {
        fun onDatabaseCreated()
    }
}