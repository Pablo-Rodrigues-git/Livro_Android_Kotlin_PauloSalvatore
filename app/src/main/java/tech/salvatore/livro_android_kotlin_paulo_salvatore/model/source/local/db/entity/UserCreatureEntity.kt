package tech.salvatore.livro_android_kotlin_paulo_salvatore.model.source.local.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_creature")
data class UserCreatureEntity(
    @PrimaryKey
    val id: Int,

    val userId: Int,
    val creatureNumber: Int,

    val hungry: Int,
    val strength: Int,
    val humor: Int,

    var lastFeed: Int = 0,
    var lastTrain: Int = 0,
    var lastPlay: Int = 0,
)
