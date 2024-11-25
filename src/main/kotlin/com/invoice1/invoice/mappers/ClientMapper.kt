package com.invoice1.invoice.mappers

import com.invoice1.invoice.dto.ClientDto
import com.invoice1.invoice.entity.Client

object ClientMapper {
    fun toEntity(clientDto: ClientDto): Client {
        val client = Client().apply {
            fullName = clientDto.fullName
            address = clientDto.address
        }

        return client
    }

}