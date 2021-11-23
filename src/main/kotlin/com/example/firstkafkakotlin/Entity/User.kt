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
)