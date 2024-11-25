package com.invoice1.invoice.controller

import com.invoice1.invoice.dto.InvoiceDto
import com.invoice1.invoice.entity.Invoice
import com.invoice1.invoice.service.InvoiceService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/invoice")
class InvoiceController {

    @Autowired
    lateinit var invoiceService: InvoiceService

    @GetMapping
    fun getInvoice() = invoiceService.getInvoice()

    @PostMapping
    fun saveInvoice(@RequestBody @Valid invoiceDto: InvoiceDto): Invoice{
        return invoiceService.save(invoiceDto)
    }
}