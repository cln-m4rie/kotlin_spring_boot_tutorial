package com.example.kotlin_spring_boot_tutorial.domain.repository

import com.example.kotlin_spring_boot_tutorial.domain.entity.User
import org.apache.ibatis.annotations.*
import org.springframework.stereotype.Repository

@Mapper
@Repository
interface UserRepository {
    @Select("SELECT * FROM users;")
    fun selectUserList(): List<User>

    @Select("SELECT * FROM users WHERE id = #{id}")
    fun selectUserById(@Param("id") id: Int?): User

    @Insert("INSERT INTO users(name) values(#{name})")
    fun insertUserById(user: User): Int

    @Update("UPDATE users SET name=#{name} WHERE id=#{id}")
    fun updateUserById(user: User): Int

    @Delete("DELETE FROM users WHERE id=#{id}")
    fun deleteUserById(@Param("id") id: Int?): Int
}