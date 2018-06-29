package com.example.priyanka2005.railwayapp.inside_activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.priyanka2005.railwayapp.R;
import com.example.priyanka2005.railwayapp.inside_tele_fragments.ConfigureFragment;
import com.example.priyanka2005.railwayapp.inside_tele_fragments.ControlcommFragment;
import com.example.priyanka2005.railwayapp.inside_tele_fragments.DataLogerFragment;
import com.example.priyanka2005.railwayapp.inside_tele_fragments.DatacommFragment;
import com.example.priyanka2005.railwayapp.inside_tele_fragments.DisasterFragment;
import com.example.priyanka2005.railwayapp.inside_tele_fragments.EMCFragment;
import com.example.priyanka2005.railwayapp.inside_tele_fragments.ExchangeFragment;
import com.example.priyanka2005.railwayapp.inside_tele_fragments.InstrumentsFragment;
import com.example.priyanka2005.railwayapp.inside_tele_fragments.MUXFragment;
import com.example.priyanka2005.railwayapp.inside_tele_fragments.MagnetoFragment;
import com.example.priyanka2005.railwayapp.inside_tele_fragments.OpticalfibreFragment;
import com.example.priyanka2005.railwayapp.inside_tele_fragments.PAFragment;
import com.example.priyanka2005.railwayapp.inside_tele_fragments.PISFragment;
import com.example.priyanka2005.railwayapp.inside_tele_fragments.PowerFragment;
import com.example.priyanka2005.railwayapp.inside_tele_fragments.QuadcableFragment;
import com.example.priyanka2005.railwayapp.inside_tele_fragments.TelephoneFragment;
import com.example.priyanka2005.railwayapp.inside_tele_fragments.TestFragment;
import com.example.priyanka2005.railwayapp.inside_tele_fragments.VHFFragment;

public class InsideTele extends AppCompatActivity {

    private String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_inside_tele );
        Intent intent = getIntent();

        data = intent.getStringExtra( "reference" );

        switch(data){
            case "controlcomm":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new ControlcommFragment() ).commit();
                break;
            case "opticalfibre":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new OpticalfibreFragment() ).commit();
                break;
            case "power":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new PowerFragment() ).commit();
                break;
            case "quadcable":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new QuadcableFragment() ).commit();
                break;
            case "mux":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new MUXFragment() ).commit();
                break;
            case "configure":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new ConfigureFragment() ).commit();
                break;
            case "pa":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new PAFragment() ).commit();
                break;
            case "emc":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new EMCFragment() ).commit();
                break;
            case "datalogger":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new DataLogerFragment() ).commit();
                break;
            case "telephone":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new TelephoneFragment() ).commit();
                break;
            case "exchange":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new ExchangeFragment() ).commit();
                break;
            case "magneto":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new MagnetoFragment() ).commit();
                break;
            case "datacomm":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new DatacommFragment() ).commit();
                break;
            case "instruments":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new InstrumentsFragment() ).commit();
                break;
            case "pis":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new PISFragment() ).commit();
                break;
            case "vhf":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new VHFFragment() ).commit();
                break;

            case "disaster":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new DisasterFragment() ).commit();
                break;

            case "test":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new TestFragment() ).commit();
                break;
        }
    }
}
