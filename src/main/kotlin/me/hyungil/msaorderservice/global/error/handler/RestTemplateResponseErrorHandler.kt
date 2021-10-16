package me.hyungil.msaorderservice.global.error.handler

import org.springframework.http.client.ClientHttpResponse
import org.springframework.web.client.DefaultResponseErrorHandler

class RestTemplateResponseErrorHandler : DefaultResponseErrorHandler() {

    override fun handleError(response: ClientHttpResponse) {
        super.handleError(response)
    }

    override fun hasError(response: ClientHttpResponse): Boolean {
        return super.hasError(response)
    }

}