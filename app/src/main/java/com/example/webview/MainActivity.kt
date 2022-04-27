package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    private val webView: WebView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "MY PORTAL"
        val webView = findViewById<WebView>(R.id.webview)
        webView.webViewClient = WebViewClient()
//        webView.loadUrl("https:www.intellectsoft.net")
        webView.loadUrl("https://myportal.kyu.ac.ug/")
        val webSettings = webView.settings
        webSettings.javaScriptEnabled = true

    }

    override fun onBackPressed() {
        if (webView!!.canGoBack()){
            webView.goBack()
        }
        else{
            super.onBackPressed()
        }
    }

}