package com.pondipb.pondibrian.ukulimaiq.data

import android.content.Context
import com.pondipb.pondibrian.ukulimaiq.R
import com.pondipb.pondibrian.ukulimaiq.domain.MarketPrice

class MarketPriceRepository(private val context: Context) {

    fun getPrices(): List<MarketPrice> = mapPrices(
        crops = context.resources.getStringArray(R.array.market_crop_names),
        prices = context.resources.getStringArray(R.array.market_crop_prices)
    )

    companion object {
        fun mapPrices(
            crops: Array<String>,
            prices: Array<String>
        ): List<MarketPrice> = crops.indices.map { index ->
            MarketPrice(
                cropName = crops[index],
                priceLabel = prices.getOrElse(index) { "—" }
            )
        }
    }
}
