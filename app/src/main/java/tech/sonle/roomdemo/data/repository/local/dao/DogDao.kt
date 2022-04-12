package tech.sonle.roomdemo.data.repository.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import tech.sonle.roomdemo.data.model.Dog

/**
 * Create by SonLe on 12/04/2022
 */
@Dao
abstract class DogDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun add(barcode: Dog): Long

    @Query("SELECT * FROM Dog")
    abstract fun getAll(): List<Dog>
}