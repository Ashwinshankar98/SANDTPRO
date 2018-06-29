package com.example.priyanka2005.railwayapp.inside_activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.priyanka2005.railwayapp.R;
import com.example.priyanka2005.railwayapp.inside_tc_fragments.AboutusFragment;
import com.example.priyanka2005.railwayapp.inside_tc_fragments.CoursesFragment;
import com.example.priyanka2005.railwayapp.inside_tc_fragments.FacultyFragment;
import com.example.priyanka2005.railwayapp.inside_tc_fragments.HistoryFragment;
import com.example.priyanka2005.railwayapp.inside_tc_fragments.InfraFragment;
import com.example.priyanka2005.railwayapp.inside_tc_fragments.PortalFragment;
import com.example.priyanka2005.railwayapp.inside_tc_fragments.PrincipalFragment;

public class InsideTc extends AppCompatActivity {

    private String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_inside_tc);

        Intent intent = getIntent();
        data =  intent.getStringExtra( "reference" );

        switch(data) {

            case "principal":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new PrincipalFragment() ).commit();
                break;
            case "infra":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new InfraFragment() ).commit();
                break;
            case "faculty":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new FacultyFragment() ).commit();
                break;
            case "courses":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new CoursesFragment() ).commit();
                break;
            case "history":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new HistoryFragment() ).commit();
                break;
            case "aboutus":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new AboutusFragment() ).commit();
                break;
            case "portal":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new PortalFragment() ).commit();
                break;
        }
    }
}
