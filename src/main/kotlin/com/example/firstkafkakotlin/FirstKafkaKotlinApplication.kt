package com.example.firstkafkakotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FirstKafkaKotlinApplication

fun main(args: Array<String>) {
    runApplication<FirstKafkaKotlinApplication>(*args)
}
