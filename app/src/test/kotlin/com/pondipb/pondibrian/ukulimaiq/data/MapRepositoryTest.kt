package com.pondipb.pondibrian.ukulimaiq.data

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class MapRepositoryTest {

    @Test
    fun assetUrlPointsToBundledMap() {
        assertEquals("file:///android_asset/map/index.html", MapRepository.ASSET_MAP_URL)
    }

    @Test
    fun allowsBlankHostForFileAssets() {
        assertTrue(MapRepository.isAllowedHost(null))
        assertTrue(MapRepository.isAllowedHost(""))
        assertTrue(MapRepository.isAllowedHost("   "))
    }

    @Test
    fun allowsLeafletAndOsmHosts() {
        assertTrue(MapRepository.isAllowedHost("unpkg.com"))
        assertTrue(MapRepository.isAllowedHost("cdn.jsdelivr.net"))
        assertTrue(MapRepository.isAllowedHost("tile.openstreetmap.org"))
        assertTrue(MapRepository.isAllowedHost("a.tile.openstreetmap.org"))
        assertTrue(MapRepository.isAllowedHost("b.tile.openstreetmap.org"))
        assertTrue(MapRepository.isAllowedHost("c.tile.openstreetmap.org"))
    }

    @Test
    fun allowsOtherOsmTileSubdomains() {
        assertTrue(MapRepository.isAllowedHost("d.tile.openstreetmap.org"))
    }

    @Test
    fun blocksUnrelatedHosts() {
        assertFalse(MapRepository.isAllowedHost("evil.example.com"))
        assertFalse(MapRepository.isAllowedHost("youtube.com"))
        assertFalse(MapRepository.isAllowedHost("openstreetmap.org"))
    }
}
