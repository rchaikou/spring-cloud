package com.example.callerservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CallerServiceApplication

fun main(args: Array<String>) {
    runApplication<CallerServiceApplication>(*args)
}
