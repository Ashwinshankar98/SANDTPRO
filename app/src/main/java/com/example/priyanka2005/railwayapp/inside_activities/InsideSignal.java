package com.example.priyanka2005.railwayapp.inside_activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.priyanka2005.railwayapp.R;
import com.example.priyanka2005.railwayapp.inside_signal_fragments.AFTCFragment;
import com.example.priyanka2005.railwayapp.inside_signal_fragments.BasicFragment;
import com.example.priyanka2005.railwayapp.inside_signal_fragments.BlockinsFragment;
import com.example.priyanka2005.railwayapp.inside_signal_fragments.CLSFragment;
import com.example.priyanka2005.railwayapp.inside_signal_fragments.ChargerFragment;
import com.example.priyanka2005.railwayapp.inside_signal_fragments.DataloggerFragment;
import com.example.priyanka2005.railwayapp.inside_signal_fragments.EIFragment;
import com.example.priyanka2005.railwayapp.inside_signal_fragments.HASSDACFragment;
import com.example.priyanka2005.railwayapp.inside_signal_fragments.IPSFragment;
import com.example.priyanka2005.railwayapp.inside_signal_fragments.PointmachineFragment;
import com.example.priyanka2005.railwayapp.inside_signal_fragments.PoliciesFragment;
import com.example.priyanka2005.railwayapp.inside_signal_fragments.RRIFragment;
import com.example.priyanka2005.railwayapp.inside_signal_fragments.RelaysFragment;
import com.example.priyanka2005.railwayapp.inside_signal_fragments.SignallingFragment;
import com.example.priyanka2005.railwayapp.inside_signal_fragments.TPWSFragment;
import com.example.priyanka2005.railwayapp.inside_signal_fragments.TestFragment;
import com.example.priyanka2005.railwayapp.inside_signal_fragments.TrackFragment;
import com.example.priyanka2005.railwayapp.inside_signal_fragments.UpdatesFragment;
import com.example.priyanka2005.railwayapp.inside_tele_fragments.DataLogerFragment;

public class InsideSignal extends AppCompatActivity {

    private String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_inside_signal );

        Intent intent = getIntent();
        data = intent.getStringExtra( "reference" );

        switch (data){
            case "basic":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new BasicFragment() ).commit();
                break;
            case "signalling":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new SignallingFragment() ).commit();
                break;
            case "aftc":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new AFTCFragment() ).commit();
                break;
            case "charger":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new ChargerFragment() ).commit();
                break;
            case "blockins":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new BlockinsFragment() ).commit();
                break;
            case "datalogger":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new DataloggerFragment() ).commit();
                break;
            case "ei":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new EIFragment() ).commit();
                break;
            case "track":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new TrackFragment() ).commit();
                break;
            case "hassdac":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new HASSDACFragment() ).commit();
                break;
            case "pointmachine":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new PointmachineFragment() ).commit();
                break;
            case "updates":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new UpdatesFragment() ).commit();
                break;
            case "rri":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new RRIFragment() ).commit();
                break;
            case "relays":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new RelaysFragment() ).commit();
                break;
            case "cls":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new CLSFragment() ).commit();
                break;
            case "ips":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new IPSFragment() ).commit();
                break;
            case "tpws":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new TPWSFragment() ).commit();
                break;
            case "policies":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new PoliciesFragment() ).commit();
                break;
            case "test":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new TestFragment() ).commit();
                break;


        }
    }
}
