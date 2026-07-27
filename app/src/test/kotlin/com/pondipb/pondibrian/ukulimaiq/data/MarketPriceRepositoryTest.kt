package com.pondipb.pondibrian.ukulimaiq.data

import android.content.Context
import android.content.res.Resources
import com.pondipb.pondibrian.ukulimaiq.R
import com.pondipb.pondibrian.ukulimaiq.domain.MarketPrice
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever

class MarketPriceRepositoryTest {

    @Test
    fun mapPricesPairsCropsWithPrices() {
        val prices = MarketPriceRepository.mapPrices(
            crops = arrayOf("Maize", "Rice"),
            prices = arrayOf("60,000 TZS", "180,000 TZS")
        )

        assertEquals(2, prices.size)
        assertEquals(MarketPrice("Maize", "60,000 TZS"), prices[0])
        assertEquals(MarketPrice("Rice", "180,000 TZS"), prices[1])
    }

    @Test
    fun mapPricesUsesDashWhenPriceMissing() {
        val prices = MarketPriceRepository.mapPrices(
            crops = arrayOf("Beans", "Chickpea"),
            prices = arrayOf("200,000 TZS")
        )

        assertEquals(2, prices.size)
        assertEquals("200,000 TZS", prices[0].priceLabel)
        assertEquals("—", prices[1].priceLabel)
    }

    @Test
    fun getPricesReadsResourceArrays() {
        val resources = mock<Resources>()
        val context = mock<Context>()
        whenever(context.resources).thenReturn(resources)
        whenever(resources.getStringArray(R.array.market_crop_names))
            .thenReturn(arrayOf("Mahindi (Maize)"))
        whenever(resources.getStringArray(R.array.market_crop_prices))
            .thenReturn(arrayOf("60,000 TZS"))

        val prices = MarketPriceRepository(context).getPrices()

        assertEquals(1, prices.size)
        assertEquals("Mahindi (Maize)", prices[0].cropName)
        assertEquals("60,000 TZS", prices[0].priceLabel)
    }
}
