package com.sh.cccandroidtest.data.sources.locale.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.sh.cccandroidtest.data.models.entities.Person

@Dao
interface PersonDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(person: Person)
}