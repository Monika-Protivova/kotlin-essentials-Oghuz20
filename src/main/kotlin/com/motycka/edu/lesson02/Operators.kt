package com.motycka.edu.lesson02

fun evaluate(a: Double, b: Double) {
    // Arithmetic operations
    val sum = a + b
    val difference = a - b
    val product = a * b

    // Comparison operations
    val isEqual = a == b
    val isNotEqual = a != b
    val isAGreater = a > b
    val isALessOrEqual = a <= b

    // Logical operations
    val bothAboveZero = a > 0 && b > 0
    val eitherAboveOrEqualZero = a >= 0 || b >= 0

    // Output
    println("Sum: $sum")
    println("Difference: $difference")
    println("Product: $product")
    println("Is Equal: $isEqual")
    println("Is Not Equal: $isNotEqual")
    println("A is Greater: $isAGreater")
    println("A is Less or Equal: $isALessOrEqual")
    println("Both are above zero: $bothAboveZero")
    println("Either is above or equal to zero: $eitherAboveOrEqualZero")
}

fun main() {
    // Example usage
    evaluate(2.4, 3.6)
}
