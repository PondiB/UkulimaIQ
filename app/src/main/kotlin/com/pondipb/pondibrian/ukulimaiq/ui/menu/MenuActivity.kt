package com.pondipb.pondibrian.ukulimaiq.ui.menu

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pondipb.pondibrian.ukulimaiq.databinding.ActivityMenuBinding
import com.pondipb.pondibrian.ukulimaiq.ui.agronomy.AgronomyActivity
import com.pondipb.pondibrian.ukulimaiq.ui.climate.ClimateActivity
import com.pondipb.pondibrian.ukulimaiq.ui.map.MapActivity
import com.pondipb.pondibrian.ukulimaiq.ui.prices.PriceActivity

class MenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAgronomy.setOnClickListener {
            startActivity(Intent(this, AgronomyActivity::class.java))
        }
        binding.btnClimate.setOnClickListener {
            startActivity(Intent(this, ClimateActivity::class.java))
        }
        binding.btnMarketPrice.setOnClickListener {
            startActivity(Intent(this, PriceActivity::class.java))
        }
        binding.btnMarketMap.setOnClickListener {
            startActivity(Intent(this, MapActivity::class.java))
        }
    }
}
