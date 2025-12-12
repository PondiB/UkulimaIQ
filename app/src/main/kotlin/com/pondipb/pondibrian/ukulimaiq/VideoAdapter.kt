package com.pondipb.pondibrian.ukulimaiq

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import androidx.recyclerview.widget.RecyclerView

class VideoAdapter(
    private val youtubeVideoList: List<YoutubeVideo>
) : RecyclerView.Adapter<VideoAdapter.VideoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_video, parent, false)
        return VideoViewHolder(view)
    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        val video = youtubeVideoList[position]
        holder.videoWeb.loadData(video.videoUrl, "text/html", "utf-8")
    }

    override fun getItemCount(): Int = youtubeVideoList.size

    class VideoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val videoWeb: WebView = itemView.findViewById(R.id.webVideoView)

        init {
            videoWeb.settings.javaScriptEnabled = true
            videoWeb.webChromeClient = WebChromeClient()
        }
    }
}
