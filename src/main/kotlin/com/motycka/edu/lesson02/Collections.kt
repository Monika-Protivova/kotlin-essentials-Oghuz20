package com.motycka.edu.lesson02

// Coffee names
const val ESPRESSO = "Espresso"
const val DOUBLE_ESPRESSO = "Double Espresso"
const val CAPPUCCINO = "Cappuccino"
const val LATTE = "Latte"
const val MACCHIATO = "Macchiato"
const val MOCHA = "Mocha"
const val FLAT_WHITE = "Flat White"
const val AMERICANO = "Americano"

// Coffee prices 
const val ESPRESSO_PRICE = 2.5
const val DOUBLE_ESPRESSO_PRICE = 3.0
const val CAPPUCCINO_PRICE = 3.0
const val LATTE_PRICE = 3.5
const val AMERICANO_PRICE = 2.0
const val FLAT_WHITE_PRICE = 3.2

// Define menu
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

// collections() function for testing
fun collections() {
    println("Welcome to the Coffee Shop! Here is our menu:")
    for (coffee in coffeeMenu) {
        println(coffee)
    }

    println("Orders placed:")
    println("Order ID: 1, Items: [Espresso, Cappuccino, Cappuccino, Americano]")
    println("Order ID: 2, Items: [Espresso, Double Espresso, Flat White]")
}
