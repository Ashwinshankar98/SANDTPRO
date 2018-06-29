package com.example.priyanka2005.railwayapp.listview_activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.priyanka2005.railwayapp.R;
import com.example.priyanka2005.railwayapp.listview_signal_fragments.*;

public class InsideSignalList extends AppCompatActivity {

    private String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_inside_signal_list );

        Intent intent = getIntent();

        data = intent.getStringExtra( "reference" );

        switch(data){

            case "basic1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Basic1() ).commit();
                break;
            case "basic2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Basic2() ).commit();
                break;
            case "basic3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Basic3() ).commit();
                break;
            case "basic4":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Basic4() ).commit();
                break;
            case "basic5":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Basic5() ).commit();
                break;
            case "basic6":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Basic6() ).commit();
                break;
            case "basic7":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Basic7() ).commit();
                break;
            case "basic8":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Basic8() ).commit();
                break;
            case "basic9":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Basic9() ).commit();
                break;
            case "basic10":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Basic10() ).commit();
                break;
            case "basic11":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Basic11() ).commit();
                break;
            case "basic12":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Basic12() ).commit();
                break;
            case "basic13":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Basic13() ).commit();
                break;
            case "basic14":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Basic14() ).commit();
                break;
            case "sig1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Sig1() ).commit();
                break;
            case "sig2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Sig2() ).commit();
                break;
            case "sig3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Sig3() ).commit();
                break;
            case "sig4":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Sig4() ).commit();
                break;
            case "sig5":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Sig5() ).commit();
                break;
            case "sig6":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Sig6() ).commit();
                break;
            case "sig7":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Sig7() ).commit();
                break;
            case "sig8":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Sig8() ).commit();
                break;
            case "aftc1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Aftc1() ).commit();
                break;
            case "aftc2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Aftc2() ).commit();
                break;
            case "aftc3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Aftc3() ).commit();
                break;
            case "aftc4":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Aftc4() ).commit();
                break;
            case "aftc5":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Aftc5() ).commit();
                break;
            case "charger1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Charger1() ).commit();
                break;
            case "charger2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Charger2() ).commit();
                break;
            case "bins1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Bins1() ).commit();
                break;
            case "bins2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Bins2() ).commit();
                break;
            case "bins3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Bins3() ).commit();
                break;
            case "bins4":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Bins4() ).commit();
                break;
            case "bins5":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Bins5() ).commit();
                break;
            case "bins6":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Bins6() ).commit();
                break;
            case "bins7":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Bins7() ).commit();
                break;
            case "bins8":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Bins8() ).commit();
                break;
            case "bins9":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Bins9() ).commit();
                break;
            case "bins10":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Bins10() ).commit();
                break;
            case "ei1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Ei1() ).commit();
                break;
            case "ei2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Ei2() ).commit();
                break;
            case "ei3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Ei3() ).commit();
                break;
            case "ei4":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Ei4() ).commit();
                break;
            case "ei5":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Ei5() ).commit();
                break;
            case "ei6":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Ei6() ).commit();
                break;
            case "track1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Track1() ).commit();
                break;
            case "track2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Track2() ).commit();
                break;
            case "track3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Track3() ).commit();
                break;
            case "track4":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Track4() ).commit();
                break;
            case "track5":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Track5() ).commit();
                break;
            case "track6":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Track6() ).commit();
                break;
            case "track7":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Track7() ).commit();
                break;
            case "track8":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Track8() ).commit();
                break;
            case "track9":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Track9() ).commit();
                break;
            case "track10":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Track10() ).commit();
                break;
            case "track11":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Track11() ).commit();
                break;
            case "track12":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Track12() ).commit();
                break;
            case "hd1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Hd1() ).commit();
                break;
            case "hd2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Hd2() ).commit();
                break;
            case "hd3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Hd3() ).commit();
                break;
            case "hd4":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Hd4() ).commit();
                break;
            case "hd5":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Hd5() ).commit();
                break;
            case "hd6":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Hd6() ).commit();
                break;
            case "hd7":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Hd7() ).commit();
                break;
            case "pm1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Pm1() ).commit();
                break;
            case "pm2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Pm2() ).commit();
                break;
            case "pm3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Pm3() ).commit();
                break;
            case "pm4":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Pm4() ).commit();
                break;
            case "pm5":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Pm5() ).commit();
                break;
            case "pm6":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Pm6() ).commit();
                break;
            case "pm7":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Pm7() ).commit();
                break;
            case "up1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Up1() ).commit();
                break;
            case "up2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Up2() ).commit();
                break;
            case "up3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Up3() ).commit();
                break;
            case "up4":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Up4() ).commit();
                break;
            case "up5":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Up5() ).commit();
                break;
            case "up6":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Up6() ).commit();
                break;
            case "up7":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Up7() ).commit();
                break;
            case "rri1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Rri1() ).commit();
                break;
            case "rri2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Rri2() ).commit();
                break;
            case "rri3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Rri3() ).commit();
                break;
            case "rri4":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Rri4() ).commit();
                break;
            case "rri5":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Rri5() ).commit();
                break;
            case "relay1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Relay1() ).commit();
                break;
            case "relay2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Relay2() ).commit();
                break;
            case "relay3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Relay3() ).commit();
                break;
            case "relay4":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Relay4() ).commit();
                break;
            case "relay5":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Relay5() ).commit();
                break;
            case "relay6":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Relay6() ).commit();
                break;
            case "relay7":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Relay7() ).commit();
                break;
            case "relay8":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Relay8() ).commit();
                break;
            case "relay9":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Relay9() ).commit();
                break;
            case "relay10":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Relay10() ).commit();
                break;
            case "relay11":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Relay11() ).commit();
                break;
            case "relay12":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Relay12() ).commit();
                break;
            case "relay13":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Relay13() ).commit();
                break;
            case "relay14":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Relay14() ).commit();
                break;
            case "relay15":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Relay15() ).commit();
                break;
            case "relay16":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Relay16() ).commit();
                break;
            case "relay17":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Relay17() ).commit();
                break;
            case "cls1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new cls1() ).commit();
                break;
            case "cls2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new cls2() ).commit();
                break;
            case "cls3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new cls3() ).commit();
                break;
            case "cls4":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new cls4() ).commit();
                break;
            case "cls5":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new cls5() ).commit();
                break;
            case "cls6":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new cls6() ).commit();
                break;
            case "cls7":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new cls7() ).commit();
                break;
            case "cls8":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new cls8() ).commit();
                break;
            case "ips1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Ips1() ).commit();
                break;
            case "ips2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Ips2() ).commit();
                break;
            case "ips3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Ips3() ).commit();
                break;
            case "ips4":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Ips4() ).commit();
                break;
            case "ips5":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Ips5() ).commit();
                break;
            case "ips6":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Ips6() ).commit();
                break;
            case "tpws1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Tpws1() ).commit();
                break;
            case "tpws2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Tpws2() ).commit();
                break;
            case "tpws3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Tpws3() ).commit();
                break;
            case "pol1":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Pol1() ).commit();
                break;
            case "pol2":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Pol2() ).commit();
                break;
            case "pol3":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Pol3() ).commit();
                break;
            case "pol4":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Pol4() ).commit();
                break;
            case "pol5":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Pol5() ).commit();
                break;
            case "pol6":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Pol6() ).commit();
                break;
            case "pol7":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Pol7() ).commit();
                break;
            case "pol8":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Pol8() ).commit();
                break;
            case "pol9":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Pol9() ).commit();
                break;
            case "pol10":
                getSupportFragmentManager().beginTransaction().add( R.id.list_container,new Pol10() ).commit();
                break;

        }

    }
}
