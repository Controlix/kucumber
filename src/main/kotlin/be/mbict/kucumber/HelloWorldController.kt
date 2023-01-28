package be.mbict.kucumber

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @GetMapping("/world/hello")
    fun sayHello() = "Hello, World!"
}