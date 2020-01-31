package com.example.kotlin_spring_boot_tutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@SpringBootApplication
@EnableSwagger2
class KotlinSpringBootTutorialApplication {
	@Bean
	fun demoApi(): Docket {
		return Docket(DocumentationType.SWAGGER_2)
				.useDefaultResponseMessages(false) // defaultのResponse Code/Messageを表示しない
				.select()
				.apis(RequestHandlerSelectors.any())
				.build()
				.apiInfo(apiInfo())
	}

	fun apiInfo(): ApiInfo {
		return ApiInfoBuilder()
				.title("API Document Demo")
				.description("This is an API document powered by swagger.")
				.version("0.0.1")
				.build()
	}
}

fun main(args: Array<String>) {
	runApplication<KotlinSpringBootTutorialApplication>(*args)
}
