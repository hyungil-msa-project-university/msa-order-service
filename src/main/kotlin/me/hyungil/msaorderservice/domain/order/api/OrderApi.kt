package me.hyungil.msaorderservice.domain.order.api

import me.hyungil.msaorderservice.domain.order.service.ProductRemoteService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.PathVariable

@RestController
@RequestMapping("/orders")
class OrderApi(
    private val productRemoteService: ProductRemoteService
) {

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun getOrder(@PathVariable id: Long) = productRemoteService.getProduct(id)

}