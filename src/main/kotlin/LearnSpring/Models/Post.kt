package LearnSpring.Models

data class Post(
    val id: Int,
    val text: String,
    val comments: List<Comment>,
    val Poster: User,
)