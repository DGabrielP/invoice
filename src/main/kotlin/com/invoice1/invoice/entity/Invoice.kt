package com.invoice1.invoice.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import jakarta.persistence.*
import java.math.BigDecimal
import java.time.LocalDate
import java.io.Serializable

@Entity
@JsonIgnoreProperties("hibernateLAzyInitialize", "handler")
@Table(name = "invoice")
class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    val id: Long? = null

    @Column(nullable = false)
    var code: String?= null

    @Column(nullable = false)
    var createdAt: LocalDate = LocalDate.now()

    @Column(nullable = false)
    var total: BigDecimal? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", nullable = false)
    var clientId: Client? = null
}




