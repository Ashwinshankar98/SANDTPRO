package com.example.priyanka2005.railwayapp.inside_ntes_actvitites;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.priyanka2005.railwayapp.R;

public class SaActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sa);
        String url="http://www.indianrail.gov.in/enquiry/SEAT/SeatAvailability.jsp";
        webView= this.findViewById(R.id.sa);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);


    }
}
