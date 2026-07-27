package com.pondipb.pondibrian.ukulimaiq.ui.agronomy

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.pondipb.pondibrian.ukulimaiq.databinding.ActivityAgronomyBinding
import com.pondipb.pondibrian.ukulimaiq.domain.AgronomyVideo

class AgronomyActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAgronomyBinding
    private val viewModel: AgronomyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgronomyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.toolbar.setNavigationOnClickListener { onBackPressedDispatcher.onBackPressed() }

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = VideoAdapter(viewModel.videos, ::openVideo)
    }

    private fun openVideo(video: AgronomyVideo) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(video.watchUrl))
        startActivity(intent)
    }
}
