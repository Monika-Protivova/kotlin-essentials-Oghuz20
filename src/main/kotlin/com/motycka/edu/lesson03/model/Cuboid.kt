package com.motycka.edu.lesson03.model

class Cuboid(
    val width: Double,
    val length: Double,
    val height: Double
) : Shape3D {
    override fun volume(): Double = width * length * height

    override fun surfaceArea(): Double =
        2 * (width * length + width * height + length * height)
}
