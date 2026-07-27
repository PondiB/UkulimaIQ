package com.pondipb.pondibrian.ukulimaiq.domain

data class AgronomyVideo(
    val videoId: String,
    val title: String,
    val description: String
) {
    val watchUrl: String get() = "https://www.youtube.com/watch?v=$videoId"
    val thumbnailUrl: String get() = "https://img.youtube.com/vi/$videoId/hqdefault.jpg"
}
