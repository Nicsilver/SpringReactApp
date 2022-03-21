package LearnSpring.Services

import LearnSpring.DataSource.UserDataSource
import LearnSpring.Models.User
import org.springframework.stereotype.Service

@Service
class UserService(private val dataSource: UserDataSource) : IUserService
{
    override fun getUsers(): List<User> = dataSource.userss()
    override fun getUser(id: Int): User = dataSource.getUser(id)
    override fun createUser(user: User): User = dataSource.save(user)
}