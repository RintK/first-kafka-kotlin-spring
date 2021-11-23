package com.example.firstkafkakotlin.service

import com.example.firstkafkakotlin.Entity.User
import com.example.firstkafkakotlin.dto.Person
import com.example.firstkafkakotlin.repository.UserRepository
import com.google.gson.Gson
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.kafka.listener.AbstractConsumerSeekAware
import org.springframework.messaging.MessageHeaders
import org.springframework.messaging.handler.annotation.Headers
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.stereotype.Service

@Service
class ConsumerService(
    val userRepository: UserRepository,
) : AbstractConsumerSeekAware() {


    @KafkaListener(topics = ["object-save-test-topic"])
    fun consume(
        @Payload message: String,
        @Headers headers: MessageHeaders,
    ) {
        val parser = Gson()
        val person = parser.fromJson(message, Person::class.java)
        println("Received: $person, Headers: $headers, Time: ${headers["kafka_receivedTimestamp"]}")
        val user = User(person.id, person.name, person.age, person.asset, person.country)
        userRepository.save(user)
    }
}
