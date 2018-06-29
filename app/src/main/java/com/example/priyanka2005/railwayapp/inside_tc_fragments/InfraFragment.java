package com.example.priyanka2005.railwayapp.inside_tc_fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.priyanka2005.railwayapp.R;
import com.example.priyanka2005.railwayapp.listview_tele_fragments.Config2;
import com.example.priyanka2005.railwayapp.utils.Constants;
import com.github.barteksc.pdfviewer.PDFView;

public class InfraFragment extends Fragment {
    private PDFView pdfView; public InfraFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_tc_infrastructure,container,false );
        pdfView= (PDFView) view.findViewById(R.id.infra);
        pdfView.fromAsset("tc_infra.pdf");
        return view;
    }
}
