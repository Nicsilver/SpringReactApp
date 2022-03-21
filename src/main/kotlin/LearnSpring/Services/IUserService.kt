package LearnSpring.Services

import LearnSpring.Models.User

interface IUserService
{
    fun getUsers(): List<User>
    fun getUser(id: Int): User
    fun createUser(user: User): User
}