package com.example.firstkafkakotlin.Entity

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class User(
    @Id
    var id: Int,
    var name: String,
    var age: Int,
    var asset: Int,
    var country: String,
) {
    override fun toString(): String {
        return "User(id=$id, name='$name', age=$age, asset=$asset, country='$country')"
    }
}