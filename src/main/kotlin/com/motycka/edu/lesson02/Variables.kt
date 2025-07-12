package com.motycka.edu.lesson02

fun main(args: Array<String>) {
    val espressoQuantity = args.count { it == ESPRESSO }
    val cappuccinoQuantity = args.count { it == CAPPUCCINO }

    val totalPrice = (espressoQuantity * ESPRESSO_PRICE) + (cappuccinoQuantity * CAPPUCCINO_PRICE)
    println(totalPrice)
}

fun variables(espressoQuantity: Int, cappuccinoQuantity: Int) {
    val totalPrice = (espressoQuantity * ESPRESSO_PRICE) + (cappuccinoQuantity * CAPPUCCINO_PRICE)
    println(totalPrice)
}
