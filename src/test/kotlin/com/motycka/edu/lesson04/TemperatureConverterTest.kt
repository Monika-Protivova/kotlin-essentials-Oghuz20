package com.motycka.edu.lesson04

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class TemperatureConverterTest : StringSpec({

    "convert 32°F to Celsius should return 0°C" {
        TemperatureConverter.toCelsius(32.0) shouldBe 0.0
    }

    "convert 212°F to Celsius should return 100°C" {
        TemperatureConverter.toCelsius(212.0) shouldBe 100.0
    }

    "convert 98.6°F to Celsius should return approximately 37°C" {
        TemperatureConverter.toCelsius(98.6) shouldBe (37.0 +- 0.1)
    }

    "convert -40°F to Celsius should return -40°C" {
        TemperatureConverter.toCelsius(-40.0) shouldBe -40.0
    }

})
