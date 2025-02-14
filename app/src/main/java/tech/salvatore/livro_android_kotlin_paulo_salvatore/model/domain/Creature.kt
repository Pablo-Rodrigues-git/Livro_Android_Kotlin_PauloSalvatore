package tech.salvatore.livro_android_kotlin_paulo_salvatore.model.domain

data class Creature(
    val number: Long,
    val name: String,

    val imageUrl: String,

    val hungry: Int = 0,
    val strength: Int = 0,
    val humor: Int = 0,

    val lastFeed: Int = 0,
    val lastTrain: Int = 0,
    val lastPlay: Int = 0,

    val evolveFrom: Creature? = null,
    val evolveTo: Creature? = null,
    val users: List<User> = emptyList()
)
