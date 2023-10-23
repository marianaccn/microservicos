package com.cora.nayschool.dto

import com.cora.nayschool.model.Bill
import java.time.LocalDate
import java.util.UUID

data class BillDTO(
    val id: UUID? = UUID.randomUUID(),
    val title: String,
    val description: String? = null,
    val price: Long,
    val referenceDate: LocalDate,
    val paymentDate: LocalDate? = null,
    val receipt: String? = null
)
    fun Bill.toBillDTO() = BillDTO(id, title, description, price, referenceDate, paymentDate, receipt)
