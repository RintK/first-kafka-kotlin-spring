package com.example.firstkafkakotlin.service

import com.example.firstkafkakotlin.dto.Person
import com.google.gson.Gson
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class ConsumerService {

    @KafkaListener(topics = ["object-test-topic"])
    fun consume(message: String) {
        val parser = Gson()
        val person = parser.fromJson(message, Person::class.java)
        println("Received: $person")

    }
}
