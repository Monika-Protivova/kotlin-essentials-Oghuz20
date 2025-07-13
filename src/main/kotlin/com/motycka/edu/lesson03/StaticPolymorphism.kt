package com.motycka.edu.lesson03

import kotlin.math.PI

object AreaCalculator {
    fun calculateRectangleArea(a: Double, b: Double): Double = a * b
    fun calculateRectangleArea(a: Int, b: Int): Double = a.toDouble() * b.toDouble()
    fun calculateCircleArea(r: Double): Double = PI * r * r
    fun calculateCircleArea(r: Int): Double = PI * r.toDouble() * r.toDouble()
    fun calculateTriangleArea(a: Double, b: Double): Double = 0.5 * a * b
    fun calculateTriangleArea(a: Int, b: Int): Double = 0.5 * a.toDouble() * b.toDouble()
}

fun main() {
    println("Rectangle Area (Int): " + AreaCalculator.calculateRectangleArea(5, 10))
    println("Rectangle Area (Double): " + AreaCalculator.calculateRectangleArea(5.0, 10.0))

    println("Circle Area (Int): " + AreaCalculator.calculateCircleArea(3))
    println("Circle Area (Double): " + AreaCalculator.calculateCircleArea(3.5))

    println("Triangle Area (Int): " + AreaCalculator.calculateTriangleArea(4, 6))
    println("Triangle Area (Double): " + AreaCalculator.calculateTriangleArea(4.5, 6.5))
}
