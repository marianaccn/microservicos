package com.cora.nayschool

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NaySchoolApplication

fun main(args: Array<String>) {
	runApplication<NaySchoolApplication>(*args)
}