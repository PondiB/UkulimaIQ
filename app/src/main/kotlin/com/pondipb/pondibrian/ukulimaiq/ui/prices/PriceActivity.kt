package com.pondipb.pondibrian.ukulimaiq.ui.prices

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.pondipb.pondibrian.ukulimaiq.databinding.ActivityPriceBinding

class PriceActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPriceBinding
    private val viewModel: PricesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPriceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.toolbar.setNavigationOnClickListener { onBackPressedDispatcher.onBackPressed() }

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = MarketPriceAdapter(viewModel.prices)
    }
}
