package com.pondipb.pondibrian.ukulimaiq.data

object MapRepository {
    const val ASSET_MAP_URL = "file:///android_asset/map/index.html"

    val allowedHosts = setOf(
        "unpkg.com",
        "cdn.jsdelivr.net",
        "tile.openstreetmap.org",
        "a.tile.openstreetmap.org",
        "b.tile.openstreetmap.org",
        "c.tile.openstreetmap.org"
    )

    fun isAllowedHost(host: String?): Boolean {
        if (host.isNullOrBlank()) return true // file:// asset loads
        return host in allowedHosts || host.endsWith(".tile.openstreetmap.org")
    }
}
