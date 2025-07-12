package com.motycka.edu.lesson02

// Define coffee type constants
const val ESPRESSO = "Espresso"
const val DOUBLE_ESPRESSO = "Double Espresso"
const val CAPPUCCINO = "Cappuccino"
const val LATTE = "Latte"
const val MACCHIATO = "Macchiato"
const val MOCHA = "Mocha"
const val FLAT_WHITE = "Flat White"
const val AMERICANO = "Americano"

// Define immutable coffee menu list
val coffeeMenu = listOf(
    ESPRESSO,
    DOUBLE_ESPRESSO,
    CAPPUCCINO,
    LATTE,
    MACCHIATO,
    MOCHA,
    FLAT_WHITE,
    AMERICANO
)

fun main() {
    // Mutable map to store orders
    val orders = mutableMapOf<Int, List<String>>()

    // Print welcome message and menu
    println("Welcome to the Coffee Shop! Here is our menu:")
    for (coffee in coffeeMenu) {
        println(coffee)
    }

    // Create some orders
    val order1 = listOf(ESPRESSO, CAPPUCCINO, CAPPUCCINO, AMERICANO)
    val order2 = listOf(ESPRESSO, DOUBLE_ESPRESSO, FLAT_WHITE)

    // Add orders to the map
    orders[1] = order1
    orders[2] = order2

    // Print all orders
    println("\nOrders placed:")
    for ((orderId, items) in orders) {
        println("Order ID: $orderId, Items: $items")
    }
}

fun collections(): List<String> = listOf("Americano", "Latte", "Cappuccino")


