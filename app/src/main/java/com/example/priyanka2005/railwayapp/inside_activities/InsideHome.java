package com.example.priyanka2005.railwayapp.inside_activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.priyanka2005.railwayapp.R;
import com.example.priyanka2005.railwayapp.inside_home_fragments.ConsFragment;
import com.example.priyanka2005.railwayapp.inside_home_fragments.PrincipalcsteFragment;
import com.example.priyanka2005.railwayapp.inside_home_fragments.WorkshopFragment;
import com.example.priyanka2005.railwayapp.inside_home_fragments.divisonFragment;
import com.example.priyanka2005.railwayapp.inside_home_fragments.stdfFragment;
import com.example.priyanka2005.railwayapp.inside_home_fragments.stnlFragment;
import com.example.priyanka2005.railwayapp.inside_tc_fragments.AboutusFragment;
import com.example.priyanka2005.railwayapp.inside_tc_fragments.CoursesFragment;
import com.example.priyanka2005.railwayapp.inside_tc_fragments.FacultyFragment;
import com.example.priyanka2005.railwayapp.inside_tc_fragments.HistoryFragment;
import com.example.priyanka2005.railwayapp.inside_tc_fragments.InfraFragment;
import com.example.priyanka2005.railwayapp.inside_tc_fragments.PrincipalFragment;

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
            case "stdf":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new stdfFragment()).commit();
                break;
            case "stnl":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new stnlFragment()).commit();
                break;
            case "workshop":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new WorkshopFragment()).commit();
                break;
            case "cons":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new ConsFragment()).commit();
                break;
        }
    }
}
