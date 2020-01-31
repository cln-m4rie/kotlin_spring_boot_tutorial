package com.example.kotlin_spring_boot_tutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringBootTutorialApplication

fun main(args: Array<String>) {
	runApplication<KotlinSpringBootTutorialApplication>(*args)
}
