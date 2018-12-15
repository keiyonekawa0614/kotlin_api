package com.example.demo.common

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter
import org.springframework.web.client.RestTemplate
import java.util.ArrayList
import java.util.Collections;


import org.springframework.context.annotation.Bean
import org.springframework.http.MediaType
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.stereotype.Component
import java.util.Collections.singletonList



@Component
class RestTemplateResolver {

    @Bean
    fun zipCodeSearchRestTemplate(): RestTemplate {
        val restTemplate = RestTemplate()
        val messageConverter = MappingJackson2HttpMessageConverter()
        val supportedMediaTypes = ArrayList(messageConverter.supportedMediaTypes)
        supportedMediaTypes.add(MediaType.TEXT_PLAIN) // text/plainのJacksonの処理対象にくわえる
        messageConverter.supportedMediaTypes = supportedMediaTypes
        Collections.singletonList(messageConverter) // カスタムしたHttpMessageConverterを適用
        restTemplate.messageConverters = listOf<HttpMessageConverter<*>>(messageConverter)
        return restTemplate
    }

}
