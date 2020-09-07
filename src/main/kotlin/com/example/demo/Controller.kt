package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {

    @Autowired
    lateinit var mapper: UserMapper

    @GetMapping("/dto")
    fun displayDto () : String{
        val user = User("vijay",23);
        val u = mapper.toDto(user).toString()
        return "here"
    }

}