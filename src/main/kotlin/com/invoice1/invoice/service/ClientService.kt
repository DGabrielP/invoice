package com.invoice1.invoice.service

import com.invoice1.invoice.dto.ClientDto
import com.invoice1.invoice.entity.Client
import com.invoice1.invoice.repository.ClientRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import com.invoice1.invoice.mappers.ClientMapper

@Service
class ClientService {

    @Autowired
    lateinit var clientRepository : ClientRepository

    fun getClient() : List <Client> {
        return clientRepository.findAll()
    }

    fun save(clientDto: ClientDto): Client {
        val client = ClientMapper.toEntity(clientDto)
        return clientRepository.save(client)
    }

}