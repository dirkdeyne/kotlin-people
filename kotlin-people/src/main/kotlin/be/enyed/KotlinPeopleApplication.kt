package be.enyed

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.SpringApplication

@SpringBootApplication
class KotlinPeopleApplication

fun main(args: Array<String>) {
	SpringApplication.run(KotlinPeopleApplication::class.java, *args)
}
