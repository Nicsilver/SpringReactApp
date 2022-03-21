package LearnSpring.Models

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("USERS")
data class User(
    @Id val id: Int,
    val name: String,
    val friendships: List<Friendship>
)