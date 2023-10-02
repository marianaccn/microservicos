package com.cora.nayschool.useCases

import com.cora.nayschool.adapters.BillDataAccessAdapter
import com.cora.nayschool.dtos.BillDataRequestDTO
import com.cora.nayschool.dtos.BillResponseDTO
import org.springframework.stereotype.Service

@Service
class CreateBillUseCase(
    private val billDataAccessAdapter: BillDataAccessAdapter
) {
    fun create(billDataRequestDTO: BillDataRequestDTO): BillResponseDTO {
        return billDataAccessAdapter.save(billDataRequestDTO.toBill()).toBillResponseDTO()
    }
}