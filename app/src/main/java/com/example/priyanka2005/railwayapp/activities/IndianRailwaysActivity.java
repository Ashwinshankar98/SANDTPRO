package com.example.priyanka2005.railwayapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.priyanka2005.railwayapp.R;

public class IndianRailwaysActivity extends AppCompatActivity {

    private WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_indian_railways );

        myWebView = (WebView)findViewById(R.id.iconWebview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDisplayZoomControls( true );
        webSettings.setBuiltInZoomControls( true );
        myWebView.getSettings().setDomStorageEnabled(true);
        myWebView.loadUrl("http://sr.indianrailways.gov.in/");
        myWebView.setWebViewClient( new WebViewClient() );
        myWebView.setWebChromeClient( new WebChromeClient() );
    }

    @Override
    public void onBackPressed() {
        if(myWebView.canGoBack()){
            myWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
