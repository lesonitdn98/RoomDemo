package tech.sonle.roomdemo.data.repository.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import tech.sonle.roomdemo.data.model.Cat

/**
 * Create by SonLe on 12/04/2022
 */
@Dao
abstract class CatDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun add(barcode: Cat): Long

    @Query("SELECT * FROM Cat")
    abstract fun getAll(): List<Cat>
}