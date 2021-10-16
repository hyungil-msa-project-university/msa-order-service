package me.hyungil.msaorderservice.domain.order.service

import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class ProductRemoteService(
    private val restTemplate: RestTemplate
) {

    companion object {
        const val URL = "http://localhost:8081/products/"
    }

    fun getProduct(productId: Long) = restTemplate.getForObject(URL + productId, Any::class.java)

}