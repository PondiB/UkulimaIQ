package com.pondipb.pondibrian.ukulimaiq.ui.agronomy

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.pondipb.pondibrian.ukulimaiq.R
import com.pondipb.pondibrian.ukulimaiq.databinding.ItemVideoBinding
import com.pondipb.pondibrian.ukulimaiq.domain.AgronomyVideo

class VideoAdapter(
    private val videos: List<AgronomyVideo>,
    private val onWatchClick: (AgronomyVideo) -> Unit
) : RecyclerView.Adapter<VideoAdapter.VideoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val binding = ItemVideoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VideoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        holder.bind(videos[position])
    }

    override fun getItemCount(): Int = videos.size

    inner class VideoViewHolder(
        private val binding: ItemVideoBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(video: AgronomyVideo) {
            binding.textTitle.text = video.title
            binding.textDescription.text = video.description
            binding.imageThumbnail.load(video.thumbnailUrl) {
                crossfade(true)
                placeholder(R.drawable.bg_video_placeholder)
                error(R.drawable.bg_video_placeholder)
            }
            binding.root.setOnClickListener { onWatchClick(video) }
            binding.buttonWatch.setOnClickListener { onWatchClick(video) }
        }
    }
}
