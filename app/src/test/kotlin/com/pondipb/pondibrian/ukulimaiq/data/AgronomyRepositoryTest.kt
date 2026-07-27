package com.pondipb.pondibrian.ukulimaiq.data

import android.content.Context
import android.content.res.Resources
import com.pondipb.pondibrian.ukulimaiq.R
import com.pondipb.pondibrian.ukulimaiq.domain.AgronomyVideo
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever

class AgronomyRepositoryTest {

    @Test
    fun mapVideosAlignsIdsTitlesAndDescriptions() {
        val videos = AgronomyRepository.mapVideos(
            ids = arrayOf("id1", "id2"),
            titles = arrayOf("Soil", "Water"),
            descriptions = arrayOf("Soil tips", "Irrigation tips")
        )

        assertEquals(2, videos.size)
        assertEquals(
            AgronomyVideo("id1", "Soil", "Soil tips"),
            videos[0]
        )
        assertEquals(
            AgronomyVideo("id2", "Water", "Irrigation tips"),
            videos[1]
        )
    }

    @Test
    fun mapVideosUsesEmptyStringsWhenMetadataMissing() {
        val videos = AgronomyRepository.mapVideos(
            ids = arrayOf("only-id"),
            titles = emptyArray(),
            descriptions = emptyArray()
        )

        assertEquals(1, videos.size)
        assertEquals("only-id", videos[0].videoId)
        assertEquals("", videos[0].title)
        assertEquals("", videos[0].description)
    }

    @Test
    fun getVideosReadsResourceArrays() {
        val resources = mock<Resources>()
        val context = mock<Context>()
        whenever(context.resources).thenReturn(resources)
        whenever(resources.getStringArray(R.array.agronomy_video_ids))
            .thenReturn(arrayOf("abc123"))
        whenever(resources.getStringArray(R.array.agronomy_video_titles))
            .thenReturn(arrayOf("Compost"))
        whenever(resources.getStringArray(R.array.agronomy_video_descriptions))
            .thenReturn(arrayOf("How to make compost"))

        val videos = AgronomyRepository(context).getVideos()

        assertEquals(1, videos.size)
        assertEquals("abc123", videos[0].videoId)
        assertEquals("Compost", videos[0].title)
        assertTrue(videos[0].watchUrl.contains("abc123"))
    }
}
