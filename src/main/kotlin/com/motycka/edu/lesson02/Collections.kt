package com.motycka.edu.lesson02

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
