package com.cora.nayschool.dbos

import com.cora.nayschool.models.Bill
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.time.LocalDate
import java.util.UUID

@Entity(name = "bill")
data class BillDBO(
    @Id
    @Column(updatable = false)
    val id: UUID,

    val title: String,
    val description: String? = null,
    val price: Long,
    val referenceDate: LocalDate,
    val paymentDate: LocalDate? = null,
    val receipt: String? = null
){
    fun toModel() = Bill(
        id = id,
        title = title,
        description = description,
        price = price,
        referenceDate = referenceDate,
        paymentDate = paymentDate,
        receipt = receipt
    )
}

fun Bill.toDBO() = BillDBO(
    id = id!!,
    title = title,
    description = description,
    price = price,
    referenceDate = referenceDate,
    paymentDate = paymentDate,
    receipt = receipt
)