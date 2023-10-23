package com.cora.nayschool.adapter

import com.cora.nayschool.dbo.toDBO
import com.cora.nayschool.model.Bill
import com.cora.nayschool.repository.BillRepository
import java.util.UUID

class BillDataAccessAdapter(
    private val billRepository: BillRepository
) {
    fun save(bill: Bill) = billRepository
        .save(bill.toDBO())
        .toModel()

    fun findAllBills(): List<Bill> = billRepository.findAll().map {
        it.toModel()
    }

    fun findById(billId: UUID): Bill = billRepository.findById(billId).get().toModel()
    fun delete(billId: UUID) = billRepository
        .deleteById(billId)
}