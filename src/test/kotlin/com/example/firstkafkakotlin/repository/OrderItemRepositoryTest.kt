package com.example.firstkafkakotlin.repository

import com.example.firstkafkakotlin.Entity.OrderItem
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import javax.transaction.Transactional

@SpringBootTest
@Transactional
class OrderItemRepositoryTest {
    @Autowired
    lateinit var orderItemRepository: OrderItemRepository
    @Autowired
    lateinit var userRepository: UserRepository

    @Test
    fun saveOrderItemTest() {
        val user = userRepository.getById(2)
        val testOrderItem = OrderItem(null, user, "Shield")
        orderItemRepository.save(testOrderItem)
    }

    @Test
    fun findOrderItemAllTest() {
        val orderItems = orderItemRepository.findAll()
        println("======== get order item: ${orderItems.size} ===========")
        orderItems.forEach { println("============ $it ============") }
        assert(orderItems.size > 0)
    }
}