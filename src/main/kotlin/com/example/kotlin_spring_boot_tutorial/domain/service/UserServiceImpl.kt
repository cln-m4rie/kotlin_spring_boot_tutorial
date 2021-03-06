package com.example.kotlin_spring_boot_tutorial.domain.service

import com.example.kotlin_spring_boot_tutorial.domain.entity.User
import com.example.kotlin_spring_boot_tutorial.domain.repository.UserRepository
import org.apache.ibatis.annotations.Param
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService {

    @Autowired
    lateinit var userRepository: UserRepository

    override fun getUserList(): List<User> {
        return userRepository.selectUserList()
    }

    override fun getUserById(id: Int?): User {
        return userRepository.selectUserById(id)
    }

    override fun getInsertUser(user: User): List<User> {
        userRepository.insertUserById(user)
        return userRepository.selectUserList()
    }

    override fun getUpdateUser(id: Int, user: User): User {
        user.id = id
        userRepository.updateUserById(user)
        return userRepository.selectUserById(id)
    }

    override fun getDeleteUserById(@Param("id") id: Int?): User {
        userRepository.deleteUserById(id)
        return userRepository.selectUserById(id)
    }
}