package com.pondipb.pondibrian.ukulimaiq.data

import android.content.Context
import com.pondipb.pondibrian.ukulimaiq.R
import com.pondipb.pondibrian.ukulimaiq.domain.AgronomyVideo

class AgronomyRepository(private val context: Context) {

    fun getVideos(): List<AgronomyVideo> = mapVideos(
        ids = context.resources.getStringArray(R.array.agronomy_video_ids),
        titles = context.resources.getStringArray(R.array.agronomy_video_titles),
        descriptions = context.resources.getStringArray(R.array.agronomy_video_descriptions)
    )

    companion object {
        fun mapVideos(
            ids: Array<String>,
            titles: Array<String>,
            descriptions: Array<String>
        ): List<AgronomyVideo> = ids.indices.map { index ->
            AgronomyVideo(
                videoId = ids[index],
                title = titles.getOrElse(index) { "" },
                description = descriptions.getOrElse(index) { "" }
            )
        }
    }
}
