package com.example.priyanka2005.railwayapp.listview_home_fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.priyanka2005.railwayapp.R;

public class Division3 extends Fragment {

    private WebView myWebView;
    public Division3() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.home_division_3,container,false );

        myWebView = (WebView)view.findViewById(R.id.trichyWeb);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDisplayZoomControls( true );
        webSettings.setBuiltInZoomControls( true );
        myWebView.getSettings().setDomStorageEnabled(true);
        myWebView.loadUrl("https://en.wikipedia.org/wiki/Tiruchirappalli_railway_division");
        myWebView.setWebViewClient( new WebViewClient() );
        myWebView.setWebChromeClient( new WebChromeClient() );
        return view;
    }
}
