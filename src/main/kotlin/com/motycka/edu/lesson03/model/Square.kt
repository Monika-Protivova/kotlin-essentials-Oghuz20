package com.motycka.edu.lesson03.model

class Square(private val side: Double) : Rectangle(side, side) {
    fun to3D(): Cuboid = Cuboid(side, side, side)
}
