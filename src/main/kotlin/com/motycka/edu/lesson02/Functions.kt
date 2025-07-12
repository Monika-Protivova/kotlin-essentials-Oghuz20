package com.motycka.edu.lesson02
import com.motycka.edu.lesson02.Constants.*

// Mutable map to store orders
val coffeeOrders = mutableMapOf<Int, List<String>>()
var nextOrderId = 1

// Function to get price of a coffee item
fun getPrice(item: String): Double = when (item) {
    ESPRESSO -> ESPRESSO_PRICE
    DOUBLE_ESPRESSO -> DOUBLE_ESPRESSO_PRICE
    CAPPUCCINO -> CAPPUCCINO_PRICE
    LATTE -> LATTE_PRICE
    AMERICANO -> AMERICANO_PRICE
    FLAT_WHITE -> FLAT_WHITE_PRICE
    else -> error("Item '$item' is not on the menu.")
}

// Function to place an order and return a new order ID
fun placeOrder(items: List<String>): Int {
    val orderId = nextOrderId++
    coffeeOrders[orderId] = items
    println("Order placed with ID: $orderId, Items: $items")
    return orderId
}

// Function to calculate total price of an order
fun payOrder(orderId: Int): Double {
    val items = coffeeOrders[orderId] ?: error("Order ID $orderId does not exist.")
    val prices = items.map { getPrice(it) }

    val total = if (items.size >= 3) {
        println("Discount applied: 1 item free!")
        prices.sum() - prices.minOrNull()!!
    } else {
        prices.sum()
    }

    println("Total price for Order ID $orderId: $total")
    return total
}

// Function to complete an order
fun completeOrder(orderId: Int) {
    if (!coffeeOrders.containsKey(orderId)) {
        error("Order ID $orderId does not exist.")
    }
    coffeeOrders.remove(orderId)
    println("Order ID $orderId has been completed.")
}

// Function to process an order: calculate price, check payment, return change
fun processOrder(items: List<String>, payment: Double): Double {
    val orderId = placeOrder(items)
    val total = payOrder(orderId)

    if (payment < total) {
        error("Insufficient payment. Required: $total, Provided: $payment")
    }

    val change = payment - total
    println("Payment of $payment accepted. Change: $change")
    completeOrder(orderId)
    return change
}

// Main function to test everything
fun main() {
    try {
        // First test: valid order with enough payment
        val change1 = processOrder(
            listOf(ESPRESSO, CAPPUCCINO, LATTE, AMERICANO),
            payment = 15.0
        )
        println("Change returned: $change1\n")

        // Second test: smaller order
        val change2 = processOrder(
            listOf(ESPRESSO, AMERICANO),
            payment = 5.0
        )
        println("Change returned: $change2\n")

        // Third test: insufficient payment (this will throw an error)
        processOrder(
            listOf(ESPRESSO, CAPPUCCINO, LATTE),
            payment = 2.0
        )
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}
