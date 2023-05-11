package com.example.bomarealtors

class Property {
    var seller_name: String? = null
    var seller_email: String? = null
    var seller_phone: String? = null
    var property_res: String? = null
    var no_rooms: String? = null
    var property_price: String? = null
    var property_address: String? = null

    constructor(
        seller_name: String,
        seller_email: String,
        seller_phone: String,
        property_res: String,
        no_rooms: String,
        property_price: String,
        property_address: String
    ) {
        this.seller_name = seller_name
        this.seller_email = seller_email
        this.seller_phone = seller_phone
        this.property_res = property_res
        this.no_rooms = no_rooms
        this.property_price = property_price
        this.property_address = property_address
    }
}
