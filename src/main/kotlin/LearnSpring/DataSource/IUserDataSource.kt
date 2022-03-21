package LearnSpring.DataSource

import LearnSpring.Models.User
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface IUserDataSource : CrudRepository<User, Int>
{
    @Query("select * from users")
    fun getUsers(): List<User>

    fun getUser(id: Int): User
    fun createUser(user: User): User
}