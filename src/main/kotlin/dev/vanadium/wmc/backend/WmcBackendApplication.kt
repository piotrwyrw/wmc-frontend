package dev.vanadium.wmc.backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WmcBackendApplication

fun main(args: Array<String>) {
    runApplication<WmcBackendApplication>(*args)
}
