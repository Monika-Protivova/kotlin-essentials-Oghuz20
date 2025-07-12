package com.motycka.edu.lesson02

const val espressoPrice = 2.5
const val cappuccinoPrice = 3.0

fun main(args: Array<String>) {
    val espressoQuantity = args.count { it == ESPRESSO }
    val cappuccinoQuantity = args.count { it == CAPPUCCINO }

    val totalPrice = (espressoQuantity * espressoPrice) + (cappuccinoQuantity * cappuccinoPrice)
    println(totalPrice)
}

fun variables(espressoQuantity: Int, cappuccinoQuantity: Int) {
    val totalPrice = (espressoQuantity * espressoPrice) + (cappuccinoQuantity * cappuccinoPrice)
    println(totalPrice)
}
