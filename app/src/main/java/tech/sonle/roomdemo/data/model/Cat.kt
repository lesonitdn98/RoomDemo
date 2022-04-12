package tech.sonle.roomdemo.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Create by SonLe on 12/04/2022
 */
@Entity
data class Cat(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String?,
    val type: String?,
    val age: String?
)