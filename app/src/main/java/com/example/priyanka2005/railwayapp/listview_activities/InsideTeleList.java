package com.example.priyanka2005.railwayapp.listview_activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.priyanka2005.railwayapp.R;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Rules1;
import com.example.priyanka2005.railwayapp.listview_tele_fragments.*;

public class InsideTeleList extends AppCompatActivity {

    private String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_inside_tele_list );
        Intent intent = getIntent();

        data = intent.getStringExtra( "reference" );

        switch (data) {

            case "controlcomm1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Controlcomm1() ).commit();
                break;
            case "controlcomm2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Controlcomm2() ).commit();
                break;
            case "controlcomm3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Controlcomm3() ).commit();
                break;
            case "controlcomm4":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Controlcomm4() ).commit();
                break;
            case "controlcomm5":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Controlcomm5() ).commit();
                break;
            case "of1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Of1() ).commit();
                break;
            case "of2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Of2() ).commit();
                break;
            case "of3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Of3() ).commit();
                break;
            case "of4":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Of4() ).commit();
                break;
            case "of5":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Of5() ).commit();
                break;
            case "of6":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Of6() ).commit();
                break;
            case "of7":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Of7() ).commit();
                break;
            case "of8":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Of8() ).commit();
                break;
            case "power1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Power1() ).commit();
                break;
            case "power2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Power2() ).commit();
                break;
            case "power3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Power3() ).commit();
                break;
            case "qc1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Qc1() ).commit();
                break;
            case "qc2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Qc2() ).commit();
                break;
            case "qc3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Qc3() ).commit();
                break;
            case "qc4":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Qc4() ).commit();
                break;
            case "qc5":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Qc5() ).commit();
                break;
            case "qc6":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Qc6() ).commit();
                break;
            case "qc7":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Qc7() ).commit();
                break;
            case "qc8":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Qc8() ).commit();
                break;
            case "qc9":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Qc9() ).commit();
                break;
            case "qc10":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Qc10() ).commit();
                break;
            case "qc11":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Qc11() ).commit();
                break;

            case "mux1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new MUX1() ).commit();
                break;
            case "mux2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new MUX2() ).commit();
                break;
            case "mux3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new MUX3() ).commit();
                break;
            case "mux4":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new MUX4() ).commit();
                break;
            case "config1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Config1()).commit();
                break;
            case "config2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Config2()).commit();
                break;
            case "config3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Config3()).commit();
                break;

            case "pa1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Pa1()).commit();
                break;
            case "pa2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Pa2()).commit();
                break;
            case "pa3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Pa3()).commit();
                break;
            case "pa4":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Pa4()).commit();
                break;
            case "pa5":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Pa5()).commit();
                break;
            case "pa6":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Pa6()).commit();
                break;
            case "pa7":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Pa7()).commit();
                break;
            case "emc1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Emc1()).commit();
                break;
            case "emc2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Emc2()).commit();
                break;
            case "emc3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Emc3()).commit();
                break;
            case "emc4":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Emc4()).commit();
                break;
            case "dl1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Dl1()).commit();
                break;
            case "dl2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Dl2()).commit();
                break;
            case "dl3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Dl3()).commit();
                break;
            case "telephone1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Telephone1()).commit();
                break;
            case "telephone2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Telephone2()).commit();
                break;
            case "ex1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Ex1()).commit();
                break;
            case "ex2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Ex2()).commit();
                break;
            case "ex3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Ex3()).commit();
                break;
            case "ex4":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Ex4()).commit();
                break;
            case "magneto1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Magneto1()).commit();
                break;
            case "magneto2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Magneto2()).commit();
                break;
            case "magneto3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Magneto3()).commit();
                break;
            case "magneto4":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Magneto4()).commit();
                break;
            case "dc1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Dc1()).commit();
                break;
            case "dc2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Dc2()).commit();
                break;
            case "dc3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Dc3()).commit();
                break;
            case "dc4":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Dc4()).commit();
                break;
            case "dc5":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Dc5()).commit();
                break;
            case "dc6":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Dc6()).commit();
                break;
            case "dc7":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Dc7()).commit();
                break;
            case "dc8":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Dc8()).commit();
                break;
            case "dc9":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Dc9()).commit();
                break;
            case "dc10":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Dc10()).commit();
                break;
            case "dc11":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Dc11()).commit();
                break;
            case "dc12":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Dc12()).commit();
                break;
            case "ins1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Ins1()).commit();
                break;
            case "ins2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Ins2()).commit();
                break;
            case "ins3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Ins3()).commit();
                break;
            case "pis1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Pis1()).commit();
                break;
            case "pis2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Pis2()).commit();
                break;
            case "pis3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Pis3()).commit();
                break;
            case "pis4":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Pis4()).commit();
                break;
            case "pis5":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Pis5()).commit();
                break;
            case "pis6":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Pis6()).commit();
                break;
            case "pis7":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Pis7()).commit();
                break;
            case "pis8":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Pis8()).commit();
                break;
            case "pis9":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Pis9()).commit();
                break;
            case "pis10":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Pis10()).commit();
                break;
            case "pis11":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Pis11()).commit();
                break;
            case "pis12":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Pis12()).commit();
                break;
            case "vhf1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Vhf1()).commit();
                break;

            case "disaster1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Disaster1()).commit();
                break;

            case "test1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container, new Test1()).commit();
                break;
        }
    }
}
