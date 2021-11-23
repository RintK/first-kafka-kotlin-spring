package com.example.firstkafkakotlin.repository

import com.example.firstkafkakotlin.Entity.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Int> {
}