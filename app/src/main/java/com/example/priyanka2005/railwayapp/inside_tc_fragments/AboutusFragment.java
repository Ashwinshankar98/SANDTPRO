package com.example.priyanka2005.railwayapp.inside_tc_fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.priyanka2005.railwayapp.R;
import com.github.barteksc.pdfviewer.PDFView;

public class AboutusFragment extends Fragment {
    private PDFView pdfView; public AboutusFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_tc_aboutus,container,false );
        pdfView= (PDFView) view.findViewById(R.id.abts);
        pdfView.fromAsset("tc_abts.pdf").load();
        return view;
    }
}
