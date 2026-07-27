package com.pondipb.pondibrian.ukulimaiq.ui.prices

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.pondipb.pondibrian.ukulimaiq.data.MarketPriceRepository
import com.pondipb.pondibrian.ukulimaiq.domain.MarketPrice

class PricesViewModel(application: Application) : AndroidViewModel(application) {
    private val repository = MarketPriceRepository(application)

    val prices: List<MarketPrice> = repository.getPrices()
}
