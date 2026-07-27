package com.pondipb.pondibrian.ukulimaiq.ui.agronomy

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.pondipb.pondibrian.ukulimaiq.data.AgronomyRepository
import com.pondipb.pondibrian.ukulimaiq.domain.AgronomyVideo

class AgronomyViewModel(application: Application) : AndroidViewModel(application) {
    private val repository = AgronomyRepository(application)

    val videos: List<AgronomyVideo> = repository.getVideos()
}
