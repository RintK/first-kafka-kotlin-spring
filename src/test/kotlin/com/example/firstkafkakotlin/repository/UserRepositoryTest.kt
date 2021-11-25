package com.example.firstkafkakotlin.repository

import com.example.firstkafkakotlin.Entity.User
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class UserRepositoryTest {
    @Autowired
    lateinit var userRepository: UserRepository

    @Test
    internal fun findAllTest() {
        val res = userRepository.findAll()
        assert(res is ArrayList<User>)
    }



}