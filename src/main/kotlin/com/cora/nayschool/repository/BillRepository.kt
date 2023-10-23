package com.cora.nayschool.repository

import com.cora.nayschool.dbo.BillDBO
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface BillRepository : JpaRepository<BillDBO, UUID> {}