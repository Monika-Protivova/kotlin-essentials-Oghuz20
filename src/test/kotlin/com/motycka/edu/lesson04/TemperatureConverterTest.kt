package com.motycka.edu.lesson04

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.shouldBeExactly
import io.kotest.matchers.doubles.shouldBeGreaterThan
import io.kotest.matchers.doubles.shouldBeLessThan
import io.kotest.matchers.shouldBe

class TemperatureConverterTest : StringSpec({

    "convert 32°F to Celsius should be 0.0°C" {
        val result = TemperatureConverter.toCelsius(32.0)
        result shouldBeExactly 0.0
    }

    "convert 212°F to Celsius should be 100.0°C" {
        val result = TemperatureConverter.toCelsius(212.0)
        result shouldBeExactly 100.0
    }

    "convert 98.6°F to Celsius should be approximately 37.0°C" {
        val result = TemperatureConverter.toCelsius(98.6)
        result shouldBe (37.0 plusOrMinus 0.01)
    }

    "convert -40°F to Celsius should be -40.0°C" {
        val result = TemperatureConverter.toCelsius(-40.0)
        result shouldBeExactly -40.0
    }

    // Bonus test: very large value
    "convert 1000°F to Celsius" {
        val result = TemperatureConverter.toCelsius(1000.0)
        result shouldBeGreaterThan 500.0
    }

    // Bonus test: very small value
    "convert -459.67°F (absolute zero) to Celsius" {
        val result = TemperatureConverter.toCelsius(-459.67)
        result shouldBe ( -273.15 plusOrMinus 0.01 )
    }

    // Round-trip test: Celsius → Fahrenheit → Celsius
    "round-trip Celsius to Fahrenheit to Celsius should return original value" {
        val original = 45.5
        val result = TemperatureConverter.toCelsius(TemperatureConverter.toFahrenheit(original))
        result shouldBe (original plusOrMinus 0.001)
    }
})
