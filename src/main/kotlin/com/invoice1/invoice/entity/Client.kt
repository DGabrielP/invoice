package com.invoice1.invoice.entity

import jakarta.persistence.*
import java.io.Serializable

@Entity
@Table(name = "client")
    class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    val id: Long? = null

    @Column(name = "full_name", nullable = false)
    var fullName: String? = null

    var age: Int? = null

    @Column(nullable = false)
    var address: String? = null


}
