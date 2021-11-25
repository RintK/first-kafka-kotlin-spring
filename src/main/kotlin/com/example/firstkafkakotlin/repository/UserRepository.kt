package com.example.firstkafkakotlin.repository

import com.example.firstkafkakotlin.Entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Int>
