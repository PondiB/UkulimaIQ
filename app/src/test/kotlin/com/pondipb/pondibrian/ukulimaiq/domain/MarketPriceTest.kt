package com.pondipb.pondibrian.ukulimaiq.domain

import org.junit.Assert.assertEquals
import org.junit.Test

class MarketPriceTest {

    @Test
    fun holdsCropNameAndPriceLabel() {
        val price = MarketPrice(
            cropName = "Mahindi (Maize)",
            priceLabel = "60,000 TZS"
        )

        assertEquals("Mahindi (Maize)", price.cropName)
        assertEquals("60,000 TZS", price.priceLabel)
    }

    @Test
    fun copyUpdatesPriceLabel() {
        val original = MarketPrice("Beans", "200,000 TZS")
        val updated = original.copy(priceLabel = "210,000 TZS")

        assertEquals("Beans", updated.cropName)
        assertEquals("210,000 TZS", updated.priceLabel)
        assertEquals("200,000 TZS", original.priceLabel)
    }
}
