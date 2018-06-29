package com.example.priyanka2005.railwayapp.inside_ntes_actvitites;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.priyanka2005.railwayapp.R;

public class TbwsActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tbws);
        String url="http://www.indianrail.gov.in/enquiry/TBIS/TrainBetweenImportantStations.html?locale=en";
        webView= this.findViewById(R.id.tbws);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);


    }
}
