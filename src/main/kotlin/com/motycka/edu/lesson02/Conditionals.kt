package com.motycka.edu.lesson02

fun conditionals() {
    val orders = listOf(
        Triple(1, listOf(ESPRESSO, CAPPUCCINO, LATTE, AMERICANO), 9.0),
        Triple(2, listOf(ESPRESSO, DOUBLE_ESPRESSO, FLAT_WHITE), 6.2)
    )

    for ((orderId, items, price) in orders) {
        println("Processing Order ID: $orderId")
        println("Items: $items")

        if (items.size >= 3) {
            println("You ordered 3 or more coffees, you get 1 for free!")
        }

        println("Total price for Order ID $orderId: $price")
    }
}
