package com.motycka.edu.lesson03.model

import com.motycka.edu.lesson03.Shape3D
import kotlin.math.PI

class Sphere(private val radius: Double) : Shape3D {
    override fun volume(): Double = (4.0 / 3.0) * PI * radius * radius * radius
    override fun surfaceArea(): Double = 4 * PI * radius * radius
}
