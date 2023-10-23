package com.cora.nayschool.useCase

import com.cora.nayschool.adapter.BillDataAccessAdapter
import com.cora.nayschool.dto.BillDTO
import com.cora.nayschool.dto.BillDataRequestDTO
import com.cora.nayschool.dto.BillResponseDTO
import com.cora.nayschool.dto.UpdateBillDTO
import com.cora.nayschool.dto.toBillDTO
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class BillUseCase(
    private val billDataAccessAdapter: BillDataAccessAdapter
) {
    fun create(billDataRequestDTO: BillDataRequestDTO): BillResponseDTO {
        return billDataAccessAdapter.save(billDataRequestDTO.toBill()).toBillResponseDTO()
    }

    fun getBills(): List<BillDTO> {
        return billDataAccessAdapter.findAllBills().map { it.toBillDTO() }
    }

    fun update(updateBillDTO: UpdateBillDTO) =
        billDataAccessAdapter.findById(updateBillDTO.id).let {
            billDataAccessAdapter.save(
                bill = updateBillDTO.toBill()
            )
        }


    fun delete(billId: UUID) = billDataAccessAdapter.delete(billId)
}