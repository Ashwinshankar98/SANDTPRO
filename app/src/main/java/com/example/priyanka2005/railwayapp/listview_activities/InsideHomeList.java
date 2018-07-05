package com.example.priyanka2005.railwayapp.listview_activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.priyanka2005.railwayapp.R;
import com.example.priyanka2005.railwayapp.listview_home_fragments.Division1;
import com.example.priyanka2005.railwayapp.listview_home_fragments.Division2;
import com.example.priyanka2005.railwayapp.listview_home_fragments.Division3;
import com.example.priyanka2005.railwayapp.listview_home_fragments.Division4;
import com.example.priyanka2005.railwayapp.listview_home_fragments.Division5;
import com.example.priyanka2005.railwayapp.listview_home_fragments.Division6;
import com.example.priyanka2005.railwayapp.listview_signal_fragments.Basic1;
import com.example.priyanka2005.railwayapp.listview_signal_fragments.Basic2;
import com.example.priyanka2005.railwayapp.listview_signal_fragments.Basic3;
import com.example.priyanka2005.railwayapp.listview_signal_fragments.Basic4;
import com.example.priyanka2005.railwayapp.listview_signal_fragments.Basic5;
import com.example.priyanka2005.railwayapp.listview_signal_fragments.Basic6;


public class InsideHomeList extends AppCompatActivity {
    private String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_inside_home_list );
        Intent intent = getIntent();

        data = intent.getStringExtra( "reference" );

        switch(data) {

            case "division1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Division1() ).commit();
                break;
            case "division2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Division2() ).commit();
                break;
            case "division3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Division3() ).commit();
                break;
            case "division4":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Division4() ).commit();
                break;
            case "division5":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Division5() ).commit();
                break;
            case "division6":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Division6() ).commit();
                break;
        }
    }
}
