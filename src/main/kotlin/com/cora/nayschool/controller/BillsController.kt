package com.cora.nayschool.controller

import com.cora.nayschool.dto.BillDataRequestDTO
import com.cora.nayschool.dto.UpdateBillDTO
import com.cora.nayschool.useCase.BillUseCase
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/bills")
class BillsController(
    private val billUseCase: BillUseCase
) {

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    fun registerBill(
        @RequestBody billDataRequestDTO: BillDataRequestDTO
    ) = billUseCase.create(billDataRequestDTO)

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getBills() = billUseCase.getBills()

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    fun updateBill(
        @RequestBody updateBillDTO: UpdateBillDTO
    ) = billUseCase.update(updateBillDTO)

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    fun deleteBill(
        @RequestParam billId: UUID
    ) = billUseCase.delete(billId)
}