package com.cora.nayschool.controller

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/teste")
class ControllerTeste() {
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun primeiraController() = TesteDTO(message = "olá")
}

data class TesteDTO(
    val message: String
)