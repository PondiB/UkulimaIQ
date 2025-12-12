package com.pondipb.pondibrian.ukulimaiq

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MenuSelection : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnAgronomy: Button
    private lateinit var btnClimate: Button
    private lateinit var btnMarketPrice: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_selection)

        btnAgronomy = findViewById(R.id.btnAgronomy)
        btnAgronomy.setOnClickListener(this)
        
        btnClimate = findViewById(R.id.btnClimate)
        btnClimate.setOnClickListener(this)
        
        btnMarketPrice = findViewById(R.id.btnMarketPrice)
        btnMarketPrice.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.btnAgronomy -> openAgronomyActivity()
            R.id.btnClimate -> openClimateActivity()
            R.id.btnMarketPrice -> openPriceActivity()
        }
    }

    private fun openClimateActivity() {
        val intent = Intent(this, ClimateActivity::class.java)
        startActivity(intent)
    }

    private fun openAgronomyActivity() {
        val intent = Intent(this, AgronomyActivity::class.java)
        startActivity(intent)
    }

    private fun openPriceActivity() {
        val intent = Intent(this, PriceActivity::class.java)
        startActivity(intent)
    }
}
