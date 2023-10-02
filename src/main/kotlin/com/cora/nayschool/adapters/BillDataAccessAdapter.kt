package com.cora.nayschool.adapters

import com.cora.nayschool.dbos.toDBO
import com.cora.nayschool.models.Bill
import com.cora.nayschool.repositorys.BillRepository

class BillDataAccessAdapter(
    private val billRepository: BillRepository
) {
    fun save(bill: Bill) = billRepository
        .save(bill.toDBO())
        .toModel()
}