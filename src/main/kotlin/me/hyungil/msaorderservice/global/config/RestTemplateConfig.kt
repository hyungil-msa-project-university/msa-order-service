package me.hyungil.msaorderservice.global.config

import me.hyungil.msaorderservice.global.error.handler.RestTemplateResponseErrorHandler
import org.apache.http.impl.client.HttpClientBuilder
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory
import org.springframework.web.client.RestTemplate
import java.time.Duration
import java.util.concurrent.TimeUnit

@Configuration
class RestTemplateConfig {

    @Bean
    fun restTemplate(): RestTemplate {

        val httpClient = HttpClientBuilder.create()
            .setMaxConnTotal(100)
            .setMaxConnPerRoute(50)
            .setConnectionTimeToLive(5, TimeUnit.SECONDS)
            .build()

        val factory = HttpComponentsClientHttpRequestFactory()

        factory.setReadTimeout(5000)
        factory.setConnectTimeout(3000)
        factory.httpClient = httpClient

        return RestTemplateBuilder()
            .requestFactory { factory }
            .errorHandler(RestTemplateResponseErrorHandler())
            .setConnectTimeout(Duration.ofSeconds(10))
            .setReadTimeout(Duration.ofSeconds(10))
            .build()
    }
}