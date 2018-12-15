package com.example.demo.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import com.example.demo.service.DemoService
import com.example.demo.dto.ZipCodeDto

@Controller
//@RequestMapping("/")
class DemoController(private val demoService : DemoService) {

    @GetMapping("/")
    fun hello(model: Model): String {
        val zipCodeDto: ZipCodeDto? = demoService.service("1780061")
        model.addAttribute("zipCodeList", zipCodeDto)
        return "hello"
    }
}
