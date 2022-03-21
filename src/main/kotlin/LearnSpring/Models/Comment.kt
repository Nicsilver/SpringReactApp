package LearnSpring.Models

data class Comment(
    val id: Int,
    val text: String,
    val commenter: User,
)
