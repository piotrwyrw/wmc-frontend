package dev.vanadium.wmc.backend.entities

import java.util.*

class Product(
    var name: String,
    var price: Double,
    var inStock: Boolean,
    val description: String
) {

    var id: UUID

    init {
        id = UUID.randomUUID()
    }

}