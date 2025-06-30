package com.motycka.edu.lesson02

// Define constants for prices
const val ESPRESSO_PRICE = 2.5
const val DOUBLE_ESPRESSO_PRICE = 3.0
const val CAPPUCCINO_PRICE = 3.0
const val LATTE_PRICE = 3.5
const val AMERICANO_PRICE = 2.0
const val FLAT_WHITE_PRICE = 3.2

fun main() {
    // Define orders
    val orders = mapOf(
        1 to listOf(ESPRESSO, CAPPUCCINO, LATTE, AMERICANO),
        2 to listOf(ESPRESSO, DOUBLE_ESPRESSO, FLAT_WHITE)
    )

    // Process each order
    for ((orderId, items) in orders) {
        println("\nProcessing Order ID: $orderId")
        println("Items: $items")

        // Calculate item prices using `when`
        val prices = items.map { coffeeType ->
            when (coffeeType) {
                ESPRESSO -> ESPRESSO_PRICE
                DOUBLE_ESPRESSO -> DOUBLE_ESPRESSO_PRICE
                CAPPUCCINO -> CAPPUCCINO_PRICE
                LATTE -> LATTE_PRICE
                AMERICANO -> AMERICANO_PRICE
                FLAT_WHITE -> FLAT_WHITE_PRICE
                else -> error("$coffeeType is not on the menu!")
            }
        }

        // Apply discount if needed
        val totalPrice = if (prices.size >= 3) {
            println("You ordered 3 or more coffees, you get 1 for free!")
            prices.sum() - prices.minOrNull()!!
        } else {
            prices.sum()
        }

        println("Total price for Order ID $orderId: $totalPrice")
    }
}
