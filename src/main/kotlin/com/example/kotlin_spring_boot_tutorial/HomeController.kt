package com.example.kotlin_spring_boot_tutorial

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {
    @GetMapping("/")
    fun hello(): String{
        return "Hello World!"
    }
}