package com.pondipb.pondibrian.ukulimaiq.data

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class WeatherRepositoryTest {

    @Test
    fun forecastUrlTargetsMwanzaOnYrNo() {
        assertTrue(WeatherRepository.MWANZA_FORECAST_URL.startsWith("https://www.yr.no/"))
        assertTrue(WeatherRepository.MWANZA_FORECAST_URL.contains("Mwanza"))
        assertTrue(WeatherRepository.MWANZA_FORECAST_URL.contains("Tanzania"))
    }

    @Test
    fun allowsYrAndMetHosts() {
        assertTrue(WeatherRepository.isAllowedHost("www.yr.no"))
        assertTrue(WeatherRepository.isAllowedHost("yr.no"))
        assertTrue(WeatherRepository.isAllowedHost("api.met.no"))
    }

    @Test
    fun blocksBlankAndForeignHosts() {
        assertFalse(WeatherRepository.isAllowedHost(null))
        assertFalse(WeatherRepository.isAllowedHost(""))
        assertFalse(WeatherRepository.isAllowedHost("openweathermap.org"))
        assertFalse(WeatherRepository.isAllowedHost("google.com"))
    }
}
