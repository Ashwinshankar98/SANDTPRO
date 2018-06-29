package com.example.priyanka2005.railwayapp.listview_activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.priyanka2005.railwayapp.R;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Budget1;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Conduct1;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.DAR1;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Earthing1;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Earthing2;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Earthing3;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.HOER1;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Leave1;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Leave2;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Leave3;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Leave4;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Leave5;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Leave6;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Leave7;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Leave8;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Leave9;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Ministries1;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Pension1;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Ps1;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Rajbhasa1;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Relations1;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Rules1;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Rules2;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Rules3;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Rules4;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Rules5;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Seniority1;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Setup1;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Setup10;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Setup11;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Setup12;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Setup13;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Setup14;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Setup2;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Setup3;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Setup4;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Setup5;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Setup6;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Setup7;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Setup8;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Setup9;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Stores1;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Stores2;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Stores3;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Stores4;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Stores5;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.WCA1;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Welfare1;
import com.example.priyanka2005.railwayapp.listview_gen_fragments.Wp1;

public class InsideGenList extends AppCompatActivity {

    private String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_inside_gen_list );
        Intent intent = getIntent();

        data = intent.getStringExtra( "reference" );

        switch (data){

            case "rules1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Rules1() ).commit();
                break;
            case "rules2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Rules2() ).commit();
                break;
            case "rules3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Rules3() ).commit();
                break;
            case "rules4":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Rules4() ).commit();
                break;
            case "rules5":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Rules5() ).commit();
                break;
            case "earthing1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Earthing1() ).commit();
                break;
            case "earthing2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Earthing2() ).commit();
                break;
            case "earthing3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Earthing3() ).commit();
                break;
            case "leave1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Leave1()).commit();
                break;
            case "leave2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Leave2()).commit();
                break;
            case "leave3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Leave3()).commit();
                break;
            case "leave4":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Leave4()).commit();
                break;
            case "leave5":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Leave5()).commit();
                break;
            case "leave6":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Leave6()).commit();
                break;
            case "leave7":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Leave7()).commit();
                break;
            case "leave8":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Leave8()).commit();
                break;
            case "leave9":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Leave9()).commit();
                break;
            case "budget1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Budget1() ).commit();
                break;
            case "wp1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Wp1() ).commit();
                break;
            case "rajbhasa1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Rajbhasa1() ).commit();
                break;
            case "ps1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Ps1() ).commit();
                break;
            case "pension1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Pension1() ).commit();
                break;
            case "relations1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Relations1() ).commit();
                break;
            case "welfare1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Welfare1() ).commit();
                break;
            case "wca1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new WCA1() ).commit();
                break;
            case "conduct1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Conduct1() ).commit();
                break;
            case "seniority1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Seniority1() ).commit();
                break;
            case "hoer1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new HOER1() ).commit();
                break;
            case "dar1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new DAR1() ).commit();
                break;
            case "ministries1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Ministries1() ).commit();
                break;
            case "stores1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Stores1() ).commit();
                break;
            case "stores2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Stores2() ).commit();
                break;
            case "stores3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Stores3() ).commit();
                break;
            case "stores4":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Stores4() ).commit();
                break;
            case "stores5":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Stores5() ).commit();
                break;
            case "setup1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Setup1() ).commit();
                break;
            case "setup2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Setup2() ).commit();
                break;
            case "setup3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Setup3() ).commit();
                break;
            case "setup4":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Setup4() ).commit();
                break;
            case "setup5":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Setup5() ).commit();
                break;
            case "setup6":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Setup6() ).commit();
                break;
            case "setup7":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Setup7() ).commit();
                break;
            case "setup8":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Setup8() ).commit();
                break;
            case "setup9":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Setup9() ).commit();
                break;
            case "setup10":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Setup10() ).commit();
                break;
            case "setup11":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Setup11() ).commit();
                break;
            case "setup12":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Setup12() ).commit();
                break;
            case "setup13":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Setup13() ).commit();
                break;
            case "setup14":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Setup14() ).commit();
                break;
        }
    }
}
