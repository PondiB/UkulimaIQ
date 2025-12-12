package com.pondipb.pondibrian.ukulimaiq

import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class ClimateActivity : AppCompatActivity() {
    private lateinit var ourBrowser: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_climate)

        ourBrowser = findViewById(R.id.webView)
        ourBrowser.webViewClient = MyBrowser()
        ourBrowser.settings.apply {
            javaScriptEnabled = true
            domStorageEnabled = true
            loadWithOverviewMode = true
            useWideViewPort = true
        }
        
        // Updated to use modern weather service - OpenWeatherMap
        ourBrowser.loadUrl("https://openweathermap.org/")
    }

    private inner class MyBrowser : WebViewClient() {
        override fun shouldOverrideUrlLoading(
            view: WebView?,
            request: WebResourceRequest?
        ): Boolean {
            return super.shouldOverrideUrlLoading(view, request)
        }
    }

    override fun onBackPressed() {
        if (ourBrowser.canGoBack()) {
            ourBrowser.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
