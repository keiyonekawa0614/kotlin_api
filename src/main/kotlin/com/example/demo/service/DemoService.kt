package com.example.demo.service

import com.example.demo.dto.ZipCodeDto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate


@Service
class DemoService{

    @Autowired
    @Qualifier("zipCodeSearchRestTemplate")
    lateinit var restTemplate: RestTemplate

    companion object {
        const val URL = "http://zipcloud.ibsnet.co.jp/api/search?zipcode={zipcode}"
    }

    fun service(zipcode: String): ZipCodeDto? {
        println("疎通確認1")
        println(zipcode)
        return restTemplate.getForObject(URL, ZipCodeDto::class.java, zipcode)
    }

}
