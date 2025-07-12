package com.motycka.edu.lesson02

// Constants
const val espresso: String = "Espresso"
const val cappuccino: String = "Cappuccino"
const val espressoPrice: Double = 2.5
const val cappuccinoPrice: Double = 3.0

// ✅ NEW FUNCTION for testing
fun calculateTotalPrice(orders: List<String>): Double {
    val espressoQuantity = orders.count { it == espresso }
    val cappuccinoQuantity = orders.count { it == cappuccino }

    return (espressoQuantity * espressoPrice) + (cappuccinoQuantity * cappuccinoPrice)
}

fun main(args: Array<String>) {
    val totalPrice = calculateTotalPrice(args.toList())
    println(totalPrice)
}
