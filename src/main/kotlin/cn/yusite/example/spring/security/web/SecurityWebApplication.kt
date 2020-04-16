package cn.yusite.example.spring.security.web

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SecurityWebApplication

fun main(args: Array<String>) {

	println("args: ${args.forEach { println(it) }}")
	runApplication<SecurityWebApplication>(*args) {
		println("start application")
		this.addListeners()
	}
}
