package com.cora.nayschool.repositorys

import com.cora.nayschool.dbos.BillDBO
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface BillRepository : JpaRepository<BillDBO, UUID> {}