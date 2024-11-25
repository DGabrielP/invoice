package com.invoice1.invoice.dto

import jakarta.validation.constraints.NotNull


class ClientDto {
    @NotNull(message = "full name is required")
    var fullName: String? = null


    @NotNull(message = "address is required")
    var address: String? = null

}