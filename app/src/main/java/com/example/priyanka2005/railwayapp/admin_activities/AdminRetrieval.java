package com.example.priyanka2005.railwayapp.admin_activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.priyanka2005.railwayapp.R;

public class AdminRetrieval extends AppCompatActivity {

    private boolean isAlreadyLoggedIn = false;

    private WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_admin_retrieval );

        myWebView = (WebView)findViewById(R.id.AdminWebview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDisplayZoomControls( true );
        webSettings.setBuiltInZoomControls( true );
        myWebView.getSettings().setDomStorageEnabled(true);
        myWebView.loadUrl("https://southernrailwayapp.firebaseapp.com/");
        myWebView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                try {
                    if (url.contains("https://southernrailwayapp.firebaseapp.com/index.html") && isAlreadyLoggedIn) {
                        // User is already logged in so show exit dialog and exit if user press yes
                        //<Your Dialog Code>
                        //finish();
                        finish();
                        //call finish(); when user press yes
                    }
                    else if (url.contains("https://southernrailwayapp.firebaseapp.com/Homepage/index.html")){
                        /* if this is true then user is logged in because user will be redirected to
                        DashBoard link only if he entered valid credentials.

                        Now change our flag to true so next time when user is redirected to login screen
                        then the first condition will get true and the exit dialog will be shown.
                         */

                        isAlreadyLoggedIn=true;
                    }

                    view.loadUrl(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return super.shouldOverrideUrlLoading(view, url);
            }
        });
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
