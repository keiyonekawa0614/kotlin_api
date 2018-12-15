package com.example.demo.dto

data class ZipCodeDto(
        val status: Int?,
        val message: String?,
        val results: List<ZipCodeDataDto>?)
