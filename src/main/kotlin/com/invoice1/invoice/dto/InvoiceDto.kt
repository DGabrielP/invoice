package com.invoice1.invoice.dto

import com.invoice1.invoice.entity.Client
import jakarta.validation.constraints.NotNull
import java.math.BigDecimal
import java.time.LocalDate

class InvoiceDto {

    @NotNull(message = "code cannot be null")
    var code: String? = null

    @NotNull(message = "total cannot be null")
    var total: BigDecimal? = null

    var createdAt: LocalDate = LocalDate.now()

    @NotNull(message = "clientId cannot be null")
    var clientId: Client? = null
}
