package com.motycka.edu.lesson02

const val espresso: String = "Espresso"
const val cappuccino: String = "Cappuccino"
const val espressoPrice: Double = 2.5
const val cappuccinoPrice: Double = 3.0

fun main(args: Array<String>) {
    val espressoQuantity = args.count { it == espresso }
    val cappuccinoQuantity = args.count { it == cappuccino }
    val totalPrice = (espressoQuantity * espressoPrice) + (cappuccinoQuantity * cappuccinoPrice)
    println(totalPrice)
}
val variables = listOf(espresso, cappuccino, espressoPrice, cappuccinoPrice)
