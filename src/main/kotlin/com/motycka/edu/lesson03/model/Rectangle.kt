package com.motycka.edu.lesson03.model

import com.motycka.edu.lesson03.Quadrilateral
import com.motycka.edu.lesson03.Shape2D
import com.motycka.edu.lesson03.Shape3D

open class Rectangle(
    private val _width: Double,
    private val _length: Double
) : Shape2D, Quadrilateral {

    // Public overrides for interface properties
    override val width: Double get() = _width
    override val length: Double get() = _length

    override fun area(): Double = _width * _length
    override fun perimeter(): Double = 2 * (_width + _length)

    override fun to3D(depth: Double): Shape3D = Cuboid(_width, _length, depth)
}
