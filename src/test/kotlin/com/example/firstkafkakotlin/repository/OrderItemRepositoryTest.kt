package com.example.firstkafkakotlin.repository

import com.example.firstkafkakotlin.Entity.Item
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
    @Autowired
    lateinit var itemRepository: ItemRepository

    @Test
    fun saveOrderItemTest() {
        val user = userRepository.getById(2)
        val item = itemRepository.save(Item(null, "Shield", "Def"))
        val testOrderItem = OrderItem(null, user, item)
        val savedOrderItem = orderItemRepository.save(testOrderItem)
        println(savedOrderItem)
    }

    @Test
    fun findOrderItemAllTest() {
        val orderItems = orderItemRepository.findAll()
        println("======== get order item: ${orderItems.size} ===========")
        orderItems.forEach { println("============ $it ============") }
        assert(orderItems.size > 0)
    }
}