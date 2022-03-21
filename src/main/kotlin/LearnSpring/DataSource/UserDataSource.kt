package LearnSpring.DataSource

import LearnSpring.Models.User
import org.springframework.stereotype.Repository

@Repository
class UserDataSource : IUserDataSource
{
    val userss = mutableListOf(
        User(0, "name0", emptyList()),
        User(1, "name1", emptyList()),
        User(2, "name2", emptyList()),
    )

    override fun getUsers(): List<User>
    {

    }

    override fun getUser(id: Int): User = userss.firstOrNull { it.id == id } ?: throw NoSuchElementException()
    override fun createUser(user: User): User
    {
        if (userss.any { it.name == user.name })
            throw IllegalArgumentException("User with name already exists")

        userss.add(user)
        return user
    }
}