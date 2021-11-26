package com.example.firstkafkakotlin.repository

import com.example.firstkafkakotlin.Entity.Item
import org.springframework.data.jpa.repository.JpaRepository

interface ItemRepository : JpaRepository<Item, Int> {
}