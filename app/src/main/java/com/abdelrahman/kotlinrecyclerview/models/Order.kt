package com.abdelrahman.kotlinrecyclerview.models


/**
@author  Abdel-Rahman El-Shikh on 02-Sep-19.
 */
class Order {
    var orderNumber: String = ""
    var address: String = ""
    var date: String = ""

    constructor() {}

    constructor(orderNumber: String, address: String, date: String) {
        this.orderNumber = orderNumber
        this.address = address
        this.date = date
    }

}