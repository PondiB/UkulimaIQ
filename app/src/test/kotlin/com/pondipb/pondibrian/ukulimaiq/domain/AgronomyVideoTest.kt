package com.pondipb.pondibrian.ukulimaiq.domain

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class AgronomyVideoTest {

    @Test
    fun buildsYoutubeWatchAndThumbnailUrls() {
        val video = AgronomyVideo(
            videoId = "DOs0roX8frA",
            title = "Soil testing",
            description = "Farm planning basics"
        )

        assertEquals("https://www.youtube.com/watch?v=DOs0roX8frA", video.watchUrl)
        assertEquals("https://img.youtube.com/vi/DOs0roX8frA/hqdefault.jpg", video.thumbnailUrl)
    }

    @Test
    fun urlsEmbedVideoIdExactly() {
        val video = AgronomyVideo("abc_XYZ-123", "Title", "Desc")
        assertTrue(video.watchUrl.endsWith("abc_XYZ-123"))
        assertTrue(video.thumbnailUrl.contains("/abc_XYZ-123/"))
    }
}
