package com.example.priyanka2005.railwayapp.admin_activities;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.example.priyanka2005.railwayapp.R;
import com.example.priyanka2005.railwayapp.activities.LoginActivity;
import com.google.firebase.auth.FirebaseAuth;

public class AdminActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView secdb,upload;

    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_admin );

        secdb = (CardView)findViewById( R.id.secdbCardView );
        secdb.setOnClickListener( this );
        upload = (CardView)findViewById( R.id.uploadCardView );
        upload.setOnClickListener( this );

        toolbar = (Toolbar)findViewById(R.id.toolbar2);
        toolbar.setTitle( "Admin" );
        toolbar.setTitleTextColor( Color.WHITE );
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater= getMenuInflater();
        menuInflater.inflate( R.menu.menu,menu );
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.logout:
                FirebaseAuth.getInstance().signOut();

                startActivity( new Intent( getApplicationContext(),LoginActivity.class ));
                finish();
                break;
        }
        return true;

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.secdbCardView:
                startActivity( new Intent( getApplicationContext(),AdminRetrieval.class ) );
                break;
            case R.id.uploadCardView:
                startActivity( new Intent( getApplicationContext(),UploadActivity.class ) );
                break;
        }
    }
}
