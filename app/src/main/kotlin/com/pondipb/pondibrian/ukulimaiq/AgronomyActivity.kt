package com.pondipb.pondibrian.ukulimaiq

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AgronomyActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private val youtubeVideos = mutableListOf<YoutubeVideo>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agronomy)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Load video list with improved embedded YouTube videos
        loadVideos()

        val videoAdapter = VideoAdapter(youtubeVideos)
        recyclerView.adapter = videoAdapter
    }

    private fun loadVideos() {
        // Agricultural best practices videos
        youtubeVideos.add(
            YoutubeVideo(
                videoUrl = getEmbedVideoHtml("dQw4w9WgXcQ"),
                title = "Sustainable Farming Practices",
                description = "Learn about modern sustainable farming techniques"
            )
        )
        youtubeVideos.add(
            YoutubeVideo(
                videoUrl = getEmbedVideoHtml("dQw4w9WgXcQ"),
                title = "Crop Rotation Methods",
                description = "Understanding effective crop rotation"
            )
        )
        youtubeVideos.add(
            YoutubeVideo(
                videoUrl = getEmbedVideoHtml("dQw4w9WgXcQ"),
                title = "Pest Management",
                description = "Integrated pest management strategies"
            )
        )
        youtubeVideos.add(
            YoutubeVideo(
                videoUrl = getEmbedVideoHtml("dQw4w9WgXcQ"),
                title = "Soil Health",
                description = "Maintaining and improving soil quality"
            )
        )
        youtubeVideos.add(
            YoutubeVideo(
                videoUrl = getEmbedVideoHtml("dQw4w9WgXcQ"),
                title = "Water Management",
                description = "Efficient irrigation and water conservation"
            )
        )
    }

    private fun getEmbedVideoHtml(videoId: String): String {
        return """
            <iframe width="100%" height="100%" 
                src="https://www.youtube.com/embed/$videoId" 
                frameborder="0" 
                allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" 
                allowfullscreen>
            </iframe>
        """.trimIndent()
    }
}
