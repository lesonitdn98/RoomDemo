package tech.sonle.roomdemo.data.repository.local

import androidx.room.Database
import androidx.room.RoomDatabase
import tech.sonle.roomdemo.data.model.Cat
import tech.sonle.roomdemo.data.model.Dog
import tech.sonle.roomdemo.data.repository.local.DatabaseManager.Companion.DATABASE_VERSION
import tech.sonle.roomdemo.data.repository.local.dao.CatDao
import tech.sonle.roomdemo.data.repository.local.dao.DogDao

/**
 * Create by SonLe on 12/04/2022
 */
@Database(
    entities = [Dog::class, Cat::class],
    version = DATABASE_VERSION,
    exportSchema = false
)
abstract class DatabaseManager : RoomDatabase() {
    companion object {
        const val DATABASE_NAME = "Database"
        const val DATABASE_VERSION = 1
    }

    abstract fun dogDao(): DogDao
    abstract fun catDao(): CatDao
}