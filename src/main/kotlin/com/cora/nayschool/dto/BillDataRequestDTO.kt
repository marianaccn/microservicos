package com.cora.nayschool.dto

import com.cora.nayschool.model.Bill
import java.time.LocalDate

data class BillDataRequestDTO(
    val title: String,
    val description: String? = null,
    val price: Long,
    val referenceDate: LocalDate,
    val paymentDate: LocalDate? = null,
    val receipt: String? = null
){
    fun toBill() = Bill(
        title = title,
        description = description,
        price = price,
        referenceDate = referenceDate,
        paymentDate = paymentDate,
        receipt = receipt
    )
}