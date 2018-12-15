package com.example.demo.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
class DemoConfigration {
    @Bean
    fun restTemplate(): RestTemplate = RestTemplate()
}
