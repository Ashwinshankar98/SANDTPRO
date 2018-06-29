package com.example.priyanka2005.railwayapp.listview_signal_fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.priyanka2005.railwayapp.R;

public class Aftc1 extends Fragment {
    private WebView webView;
    public Aftc1() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.signal_aftc_1,container,false );
        String url="https://enquiry.indianrail.gov.in/xyzabc/e_trainsBwStns.jsp";
        webView= view.findViewById(R.id.webview1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
        return view;
    }
}
