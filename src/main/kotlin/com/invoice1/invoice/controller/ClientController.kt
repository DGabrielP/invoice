package com.invoice1.invoice.controller

import com.invoice1.invoice.dto.ClientDto
import com.invoice1.invoice.entity.Client

import com.invoice1.invoice.service.ClientService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/client")
class ClientController {


    @Autowired
    lateinit var clientService: ClientService

    @GetMapping
    fun getClient() = clientService.getClient()

    @PostMapping
    fun save(@RequestBody @Valid clientDto: ClientDto): Client {
        return clientService.save(clientDto)


    }
}