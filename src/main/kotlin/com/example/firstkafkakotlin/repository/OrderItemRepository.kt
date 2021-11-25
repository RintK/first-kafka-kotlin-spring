package com.example.firstkafkakotlin.repository

import com.example.firstkafkakotlin.Entity.OrderItem
import org.springframework.data.jpa.repository.JpaRepository

interface OrderItemRepository : JpaRepository<OrderItem, Int> {
}