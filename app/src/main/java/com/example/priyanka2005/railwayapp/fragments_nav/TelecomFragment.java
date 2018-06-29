package com.example.priyanka2005.railwayapp.fragments_nav;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.priyanka2005.railwayapp.R;
import com.example.priyanka2005.railwayapp.inside_activities.InsideTele;

public class TelecomFragment extends Fragment implements View.OnClickListener {

    private CardView controlcomm,opticalfibre,power,quadcable,mux,configure,pa,emc,datalogger,telephone,exchange,magneto,datacomm,instruments,pis,vhf,electronics,disaster,policies,test;
    public TelecomFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_telecom,container,false);

        controlcomm = (CardView)view.findViewById( R.id.controlcomm );
        opticalfibre = (CardView)view.findViewById( R.id.opticalfibre );
        power = (CardView)view.findViewById( R.id.power );
        quadcable = (CardView)view.findViewById( R.id.quadcable );
        mux = (CardView)view.findViewById( R.id.mux );
        configure = (CardView)view.findViewById( R.id.configure );
        pa = (CardView)view.findViewById( R.id.pa );
        emc = (CardView)view.findViewById( R.id.emc );
        datalogger = (CardView)view.findViewById( R.id.datalogger );
        telephone = (CardView)view.findViewById( R.id.telephone );
        exchange = (CardView)view.findViewById( R.id.exchange );
        magneto = (CardView)view.findViewById( R.id.magneto );
        datacomm = (CardView)view.findViewById( R.id.datacomm );
        instruments = (CardView)view.findViewById( R.id.instruments );
        pis = (CardView)view.findViewById( R.id.pis );
        vhf = (CardView)view.findViewById( R.id.vhf );

        disaster = (CardView)view.findViewById( R.id.disaster );

        test = (CardView)view.findViewById( R.id.test );


        controlcomm.setOnClickListener( this );
        opticalfibre.setOnClickListener( this );
        power.setOnClickListener( this );
        quadcable.setOnClickListener( this );
        mux.setOnClickListener( this );
        configure.setOnClickListener( this );
        pa.setOnClickListener( this );
        emc.setOnClickListener( this );
        datalogger.setOnClickListener( this );
        telephone.setOnClickListener( this );
        exchange.setOnClickListener( this );
        magneto.setOnClickListener( this );
        datacomm.setOnClickListener( this );
        instruments.setOnClickListener( this );
        pis.setOnClickListener( this );
        vhf.setOnClickListener( this );

        disaster.setOnClickListener( this );

        test.setOnClickListener( this );

        return view;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.controlcomm:
                startActivity( new Intent( getContext(), InsideTele.class ).putExtra( "reference","controlcomm" ));
                break;
            case R.id.opticalfibre:
                startActivity( new Intent( getContext(), InsideTele.class ).putExtra( "reference","opticalfibre" ));
                break;
            case R.id.power:
                startActivity( new Intent( getContext(), InsideTele.class ).putExtra( "reference","power" ));
                break;
            case R.id.quadcable:
                startActivity( new Intent( getContext(), InsideTele.class ).putExtra( "reference","quadcable" ));
                break;
            case R.id.mux:
                startActivity( new Intent( getContext(), InsideTele.class ).putExtra( "reference","mux" ));
                break;
            case R.id.configure:
                startActivity( new Intent( getContext(), InsideTele.class ).putExtra( "reference","configure" ));
                break;
            case R.id.pa:
                startActivity( new Intent( getContext(), InsideTele.class ).putExtra( "reference","pa" ));
                break;
            case R.id.emc:
                startActivity( new Intent( getContext(), InsideTele.class ).putExtra( "reference","emc" ));
                break;
            case R.id.datalogger:
                startActivity( new Intent( getContext(), InsideTele.class ).putExtra( "reference","datalogger" ));
                break;
            case R.id.telephone:
                startActivity( new Intent( getContext(), InsideTele.class ).putExtra( "reference","telephone" ));
                break;
            case R.id.exchange:
                startActivity( new Intent( getContext(), InsideTele.class ).putExtra( "reference","exchange" ));
                break;
            case R.id.magneto:
                startActivity( new Intent( getContext(), InsideTele.class ).putExtra( "reference","magneto" ));
                break;
            case R.id.datacomm:
                startActivity( new Intent( getContext(), InsideTele.class ).putExtra( "reference","datacomm" ));
                break;
            case R.id.instruments:
                startActivity( new Intent( getContext(), InsideTele.class ).putExtra( "reference","instruments" ));
                break;
            case R.id.pis:
                startActivity( new Intent( getContext(), InsideTele.class ).putExtra( "reference","pis" ));
                break;
            case R.id.vhf:
                startActivity( new Intent( getContext(), InsideTele.class ).putExtra( "reference","vhf" ));
                break;

            case R.id.disaster:
                startActivity( new Intent( getContext(), InsideTele.class ).putExtra( "reference","disaster" ));
                break;

            case R.id.test:
                startActivity( new Intent( getContext(), InsideTele.class ).putExtra( "reference","test" ));
                break;
        }

    }
}
