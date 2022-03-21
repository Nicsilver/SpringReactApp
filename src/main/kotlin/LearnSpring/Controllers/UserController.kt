package LearnSpring.Controllers

import LearnSpring.Models.User
import LearnSpring.Services.IUserService
import LearnSpring.Services.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/user")
class UserController(private val service: IUserService)
{
    @ExceptionHandler(IllegalArgumentException::class)
    fun handleBadRequest(e: IllegalArgumentException): ResponseEntity<String> =
        ResponseEntity(e.message, HttpStatus.BAD_REQUEST)


    @GetMapping
    fun getUser(id: Int): User = service.getUser(id)

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createUser(@RequestBody user: User): User = service.createUser(user)
}