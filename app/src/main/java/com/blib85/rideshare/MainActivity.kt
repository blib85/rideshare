package com.blib85.rideshare

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWebView : WebView = findViewById(R.id.webview_id)
        myWebView.apply{
            loadUrl("https://m.uber.com")
            settings.javaScriptEnabled = true
            webViewClient = (WebViewClient())
        }
    }
}
