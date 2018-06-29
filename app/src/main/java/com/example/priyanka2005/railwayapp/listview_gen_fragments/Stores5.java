package com.example.priyanka2005.railwayapp.listview_gen_fragments;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.example.priyanka2005.railwayapp.R;
import com.example.priyanka2005.railwayapp.utils.Constants;
import com.github.barteksc.pdfviewer.PDFView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Stores5 extends Fragment {

    private ProgressBar progressBar;
    private PDFView pdfView;
    public Stores5() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.gen_stores_5,container,false);
        progressBar = (ProgressBar)view.findViewById( R.id.pgstores5);
        pdfView= (PDFView) view.findViewById(R.id.gstores5);
        new RetrieverClass().execute(new Constants().url_gen_stores5);
        return view;
    }

    private class RetrieverClass extends AsyncTask<String,Void,InputStream> {


        @Override
        protected InputStream doInBackground(String... strings) {

            //here
            progressBar.setVisibility( View.VISIBLE );
            InputStream inputStream=null;
            try {
                URL url = new URL( strings[0] );
                HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();

                if(httpURLConnection.getResponseCode() == 200){
                    inputStream = new BufferedInputStream( httpURLConnection.getInputStream() );
                }
            }
            catch (IOException e){
                return null;
            }
            return inputStream;
        }

        @Override
        protected void onPostExecute(InputStream inputStream) {

            //here
            progressBar.setVisibility( View.INVISIBLE );
            pdfView.fromStream(inputStream).load();
        }
    }
}
