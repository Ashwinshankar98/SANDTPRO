package com.example.priyanka2005.railwayapp.inside_activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.priyanka2005.railwayapp.R;
import com.example.priyanka2005.railwayapp.inside_home_fragments.PrincipalcsteFragment;
import com.example.priyanka2005.railwayapp.inside_home_fragments.divisionFragment;
import com.example.priyanka2005.railwayapp.inside_home_fragments.FacebookFragment;

public class InsideHome extends AppCompatActivity {

    private String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_inside_home );

        Intent intent = getIntent();
        data =  intent.getStringExtra( "reference" );

        switch(data) {

            case "principal":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new PrincipalcsteFragment()).commit();
                break;
            case "division":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new divisionFragment()).commit();
                break;
            case "facebook":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new FacebookFragment()).commit();
                break;

        }
    }
}
