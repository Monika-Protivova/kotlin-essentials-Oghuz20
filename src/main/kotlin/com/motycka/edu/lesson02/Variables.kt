package com.motycka.edu.lesson02

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
