package com.invoice1.invoice.mappers

import com.invoice1.invoice.dto.InvoiceDto
import com.invoice1.invoice.entity.Invoice
import com.invoice1.invoice.entity.Client
import java.math.BigDecimal
import java.time.LocalDate

object InvoiceMapper {

    fun toEntity(invoiceDto: InvoiceDto): Invoice {
        val invoice = Invoice().apply {
            code = invoiceDto.code
            total = invoiceDto.total
            createdAt = invoiceDto.createdAt ?: LocalDate.now()
            clientId = invoiceDto.clientId

        }
        return invoice
    }
}
