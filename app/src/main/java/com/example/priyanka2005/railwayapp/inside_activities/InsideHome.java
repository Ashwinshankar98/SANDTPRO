package com.example.priyanka2005.railwayapp.inside_activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.priyanka2005.railwayapp.R;
import com.example.priyanka2005.railwayapp.inside_home_fragments.PrincipalcsteFragment;
import com.example.priyanka2005.railwayapp.inside_home_fragments.divisonFragment;
import com.example.priyanka2005.railwayapp.inside_home_fragments.FacebookFragment;
import com.example.priyanka2005.railwayapp.inside_home_fragments.TwitterFragment;

public class InsideHome extends AppCompatActivity {

    private String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_inside_home );

        Intent intent = getIntent();
        data =  intent.getStringExtra( "reference" );

        switch(data) {

            case "principalcste":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new PrincipalcsteFragment()).commit();
                break;
            case "divison":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new divisonFragment()).commit();
                break;
            case "facebook":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new FacebookFragment()).commit();
                break;
            case "twitter":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new TwitterFragment()).commit();
                break;

        }
    }
}
