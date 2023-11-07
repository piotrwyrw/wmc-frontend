package dev.vanadium.wmc.backend.controller

import dev.vanadium.wmc.backend.entities.Product
import dev.vanadium.wmc.backend.service.ProductManager
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ApiController(
    val prods: ProductManager
) {

    @GetMapping("quadrat")
    fun square_area(@RequestParam sideLength: Int): ResponseEntity<Int> {
        return ResponseEntity.ok(sideLength * sideLength)
    }

    @GetMapping("products")
    fun list_products(): ResponseEntity<List<Product>> {
        return ResponseEntity.ok(prods.allProducts())
    }

}