package com.example.firstkafkakotlin.Entity

import javax.persistence.*

@Entity
class OrderItem(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int?,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    var user: User,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    var item: Item,
) {
    override fun toString(): String {
        return "OrderItem(id=$id, user=$user, item='$item')"
    }
}