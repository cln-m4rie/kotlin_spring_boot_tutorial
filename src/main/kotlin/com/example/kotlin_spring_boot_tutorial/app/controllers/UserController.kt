package com.example.kotlin_spring_boot_tutorial.app.controllers

import com.example.kotlin_spring_boot_tutorial.domain.entity.User
import com.example.kotlin_spring_boot_tutorial.domain.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
class UserController {
    @Autowired
    lateinit var userService: UserService

    // 全件取得
    @GetMapping("/users")
    fun getUserList(): List<User> {
        return userService.getUserList()
    }

    // 1件作成
    @PostMapping("/users")
    fun createUser(@RequestBody user: User): List<User> {
        return userService.getInsertUser(user)
    }

    // 1件取得
    @GetMapping("/users/{id}")
    fun getUserById(@PathVariable("id") id: Int?): User {
        return userService.getUserById(id)
    }

    // 1件編集
    @PutMapping("/users/{id}")
    fun updateUserById(@PathVariable("id") id: Int, @RequestBody @Validated user: User): User {
        return userService.getUpdateUser(id, user)
    }

    // 1件削除
    @DeleteMapping("/users/{id}")
    fun deleteUserById(@PathVariable("id") id: Int?): User {
        return userService.getDeleteUserById(id)
    }
}