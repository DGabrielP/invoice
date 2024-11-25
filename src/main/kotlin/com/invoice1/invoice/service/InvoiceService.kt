package com.invoice1.invoice.service


import com.invoice1.invoice.dto.InvoiceDto

import com.invoice1.invoice.entity.Invoice
import com.invoice1.invoice.mappers.InvoiceMapper
import com.invoice1.invoice.repository.InvoiceRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class InvoiceService {

    @Autowired
    lateinit var invoiceRepository: InvoiceRepository

    fun getInvoice() : List<Invoice> {
        return invoiceRepository.findAll()
    }

    fun save(invoiceDto: InvoiceDto): Invoice {
        val invoice = InvoiceMapper.toEntity(invoiceDto)
        return invoiceRepository.save(invoice)
    }

}