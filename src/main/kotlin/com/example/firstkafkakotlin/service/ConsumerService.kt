package com.example.firstkafkakotlin.service

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class ConsumerService {

    @KafkaListener(topics = ["object-test-topic"])
    fun consume(message: String) {
        println("Received: $message")
    }
}
