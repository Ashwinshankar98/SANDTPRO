package com.example.priyanka2005.railwayapp.inside_activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.priyanka2005.railwayapp.R;
import com.example.priyanka2005.railwayapp.inside_gen_fragments.BudgetFragment;
import com.example.priyanka2005.railwayapp.inside_gen_fragments.ConductFragment;
import com.example.priyanka2005.railwayapp.inside_gen_fragments.DARFragment;
import com.example.priyanka2005.railwayapp.inside_gen_fragments.EarthingFragment;
import com.example.priyanka2005.railwayapp.inside_gen_fragments.HOERFragment;
import com.example.priyanka2005.railwayapp.inside_gen_fragments.LeaveFragment;
import com.example.priyanka2005.railwayapp.inside_gen_fragments.MinistriesFragment;
import com.example.priyanka2005.railwayapp.inside_gen_fragments.PSFragment;
import com.example.priyanka2005.railwayapp.inside_gen_fragments.PensionFragment;
import com.example.priyanka2005.railwayapp.inside_gen_fragments.RajbhasaFragment;
import com.example.priyanka2005.railwayapp.inside_gen_fragments.RelationsFragment;
import com.example.priyanka2005.railwayapp.inside_gen_fragments.RulesFragment;
import com.example.priyanka2005.railwayapp.inside_gen_fragments.SeniorityFragment;
import com.example.priyanka2005.railwayapp.inside_gen_fragments.SetupFragment;
import com.example.priyanka2005.railwayapp.inside_gen_fragments.StoresFragment;
import com.example.priyanka2005.railwayapp.inside_gen_fragments.WCAFragment;
import com.example.priyanka2005.railwayapp.inside_gen_fragments.WPFragment;
import com.example.priyanka2005.railwayapp.inside_gen_fragments.WelfareFragment;

public class InsideGen extends AppCompatActivity {

    private String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_inside_gen );
        Intent intent= getIntent();
        data = intent.getStringExtra( "reference" );



        switch (data){
            case "rules":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new RulesFragment() ).commit();
                break;
            case "earthing":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new EarthingFragment() ).commit();
                break;
            case "leave":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new LeaveFragment() ).commit();
                break;
            case "budget":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new BudgetFragment() ).commit();
                break;
            case "wp":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new WPFragment() ).commit();
                break;
            case "rajbhasa":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new RajbhasaFragment() ).commit();
                break;
            case "ps":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new PSFragment() ).commit();
                break;
            case "pension":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new PensionFragment() ).commit();
                break;
            case "relations":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new RelationsFragment() ).commit();
                break;
            case "setup":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new SetupFragment() ).commit();
                break;
            case "welfare":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new WelfareFragment() ).commit();
                break;
            case "wca":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new WCAFragment() ).commit();
                break;
            case "conduct":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new ConductFragment() ).commit();
                break;
            case "seniority":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new SeniorityFragment() ).commit();
                break;
            case "hoer":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new HOERFragment() ).commit();
                break;
            case "dar":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new DARFragment() ).commit();
                break;

            case "stores":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new StoresFragment() ).commit();
                break;
            case "ministries":
                getSupportFragmentManager().beginTransaction().replace( R.id.inside_fragment_container, new MinistriesFragment() ).commit();
                break;

        }
    }
}
