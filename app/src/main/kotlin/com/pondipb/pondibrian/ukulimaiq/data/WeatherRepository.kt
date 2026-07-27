package com.pondipb.pondibrian.ukulimaiq.data

object WeatherRepository {
    /** Mwanza Region forecast via Yr.no (no API key required). */
    const val MWANZA_FORECAST_URL =
        "https://www.yr.no/en/forecast/daily-table/2-152224/Tanzania/Mwanza/Mwanza"

    val allowedHosts = setOf(
        "www.yr.no",
        "yr.no",
        "api.met.no"
    )

    fun isAllowedHost(host: String?): Boolean {
        if (host.isNullOrBlank()) return false
        return host in allowedHosts
    }
}
