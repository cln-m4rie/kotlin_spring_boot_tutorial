package com.example.kotlin_spring_boot_tutorial.domain.entity

import javax.validation.constraints.Max
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull


data class User(
        var id: Int,
        @field:NotNull(message = "nameは必須です")
        @field:NotEmpty(message = "nameは必須です")
        @field:Max(255)
        var name: String)