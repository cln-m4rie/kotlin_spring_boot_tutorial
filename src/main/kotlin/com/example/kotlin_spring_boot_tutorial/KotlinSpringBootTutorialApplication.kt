package com.example.kotlin_spring_boot_tutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import springfox.documentation.swagger2.annotations.EnableSwagger2

@SpringBootApplication
@EnableSwagger2
class KotlinSpringBootTutorialApplication

fun main(args: Array<String>) {
	runApplication<KotlinSpringBootTutorialApplication>(*args)
}
