package com.example.kotlin_spring_boot_tutorial.domain.service

import com.example.kotlin_spring_boot_tutorial.domain.entity.User

interface UserService {
    fun getUserList(): List<User>
    fun getUserById(id: Int?): User
    fun getInsertUser(user: User): List<User>
    fun getUpdateUser(id: Int, user: User): User
    fun getDeleteUserById(id: Int?): User
}