package com.cora.nayschool.controllers

import com.cora.nayschool.dtos.BillDataRequestDTO
import com.cora.nayschool.useCases.CreateBillUseCase
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/bills")
class BillsController(
    private val createBillUseCase: CreateBillUseCase
) {

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    fun registerBill(
        @RequestBody billDataRequestDTO: BillDataRequestDTO
    ) = createBillUseCase.create(billDataRequestDTO)

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun segunda() = TesteDTO(message = "olá")

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    fun terceira() = TesteDTO(message = "olá")

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    fun quarta() = TesteDTO(message = "olá")
}

data class TesteDTO(
    val message: String
)