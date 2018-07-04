package com.example.priyanka2005.railwayapp.activities;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.example.priyanka2005.railwayapp.R;

import com.example.priyanka2005.railwayapp.utils.Constants;
import com.github.barteksc.pdfviewer.PDFView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class AboutusActivity extends AppCompatActivity {


    private ProgressBar progressBar;

    private PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_aboutus );

        //here
        progressBar = (ProgressBar)findViewById( R.id.aboutuspgb );
        pdfView = (PDFView)findViewById( R.id.aboutus );
        new RetrieverClass().execute(new Constants().url_aboutus );
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
