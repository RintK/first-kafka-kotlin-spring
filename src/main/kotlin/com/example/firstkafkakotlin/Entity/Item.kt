package com.example.firstkafkakotlin.Entity

import javax.persistence.*

@Entity
class Item(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int?,
    var itemName:String,
    var itemType: String
){
    override fun toString(): String {
        return "Item(id=$id, itemName='$itemName', itemType='$itemType')"
    }
}

