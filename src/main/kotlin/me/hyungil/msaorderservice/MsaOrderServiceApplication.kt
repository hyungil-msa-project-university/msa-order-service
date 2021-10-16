package me.hyungil.msaorderservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
class MsaOrderServiceApplication

fun main(args: Array<String>) {
    runApplication<MsaOrderServiceApplication>(*args)
}
