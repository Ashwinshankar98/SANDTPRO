package com.example.priyanka2005.railwayapp.inside_ntes_actvitites;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.priyanka2005.railwayapp.R;

public class SytActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syt);

        String url="https://enquiry.indianrail.gov.in/mntes/q?opt=MainMenu&subOpt=tbs&excpType=";
        webView= this.findViewById(R.id.syt);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);

    }

}
