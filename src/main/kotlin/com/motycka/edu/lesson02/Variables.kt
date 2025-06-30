package com.motycka.edu.lesson02

// Define constant values (compile-time known)
const val espresso: String = "Espresso"
const val cappuccino: String = "Cappuccino"
const val espressoPrice: Double = 2.5
const val cappuccinoPrice: Double = 3.0

fun main(args: Array<String>) {
    // Count the number of orders for each coffee type
    val espressoQuantity = args.count { it == espresso }
    val cappuccinoQuantity = args.count { it == cappuccino }

    // Calculate total price
    val totalPrice = (espressoQuantity * espressoPrice) + (cappuccinoQuantity * cappuccinoPrice)

    // Print the result
    println(totalPrice)
}

