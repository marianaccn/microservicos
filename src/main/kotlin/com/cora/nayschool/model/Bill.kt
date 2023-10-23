package com.cora.nayschool.model

import com.cora.nayschool.dto.BillResponseDTO
import java.time.LocalDate
import java.util.UUID

data class Bill(
    val id: UUID? = UUID.randomUUID(),
    val title: String,
    val description: String? = null,
    val price: Long,
    val referenceDate: LocalDate,
    val paymentDate: LocalDate? = null,
    val receipt: String? = null
){
    fun toBillResponseDTO() = BillResponseDTO(
        billId = id!!
    )
}
