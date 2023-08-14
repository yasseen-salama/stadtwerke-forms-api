package com.stadtwerkefroms.stadtwerkeformsapi.model

import jakarta.persistence.*

@Entity
class Address(

    @Column(length = 255)
    var street: String,

    @Column(name = "house_number")
    var houseNumber: Int,

    @Column(name = "postal_code")
    var postalCode: Int,

    var city: String,

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null)


