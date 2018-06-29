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
import com.example.priyanka2005.railwayapp.activities.HomeActivity;
import com.example.priyanka2005.railwayapp.inside_activities.InsideSignal;

public class SignalFragment extends Fragment implements View.OnClickListener {

    private CardView basic,signalling,aftc,charger,blockins,datalogger,ei,track,hassdac,pointmachine,updates,rri,relays,cls,ips,tpws,policies,test;
    public SignalFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_signal,container,false);

        basic = (CardView)view.findViewById( R.id.basic );
        signalling = (CardView)view.findViewById( R.id.signalling );
        aftc = (CardView)view.findViewById( R.id.aftc );
        charger = (CardView)view.findViewById( R.id.charger );
        blockins = (CardView)view.findViewById( R.id.blockins );
        datalogger = (CardView)view.findViewById( R.id.datalogger );
        ei = (CardView)view.findViewById( R.id.ei );
        track = (CardView)view.findViewById( R.id.track );
        hassdac = (CardView)view.findViewById( R.id.hassdac );
        pointmachine = (CardView)view.findViewById( R.id.pointmachine );
        updates = (CardView)view.findViewById( R.id.updates );
        rri = (CardView)view.findViewById( R.id.rri );
        relays = (CardView)view.findViewById( R.id.relays );
        cls = (CardView)view.findViewById( R.id.cls );
        ips = (CardView)view.findViewById( R.id.ips );
        tpws = (CardView)view.findViewById( R.id.tpws );
        policies = (CardView)view.findViewById( R.id.policies );
        test = (CardView)view.findViewById( R.id.test );

        basic.setOnClickListener( this );
        signalling.setOnClickListener( this );
        aftc.setOnClickListener( this );
        charger.setOnClickListener( this );
        blockins.setOnClickListener( this );
        datalogger.setOnClickListener( this );
        ei.setOnClickListener( this );
        track.setOnClickListener( this );
        hassdac.setOnClickListener( this );
        pointmachine.setOnClickListener( this );
        updates.setOnClickListener( this );
        rri.setOnClickListener( this );
        relays.setOnClickListener( this );
        cls.setOnClickListener( this );
        ips.setOnClickListener( this );
        tpws.setOnClickListener( this );
        policies.setOnClickListener( this );
        test.setOnClickListener( this );





        return view;
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.basic:
                startActivity( new Intent( getContext(), InsideSignal.class ).putExtra( "reference","basic" ) );
                break;
            case R.id.signalling:
                startActivity( new Intent( getContext(), InsideSignal.class ).putExtra( "reference","signalling" ) );
                break;
            case R.id.aftc:
                startActivity( new Intent( getContext(), InsideSignal.class ).putExtra( "reference","aftc" ) );
                break;
            case R.id.charger:
                startActivity( new Intent( getContext(), InsideSignal.class ).putExtra( "reference","charger" ) );
                break;
            case R.id.blockins:
                startActivity( new Intent( getContext(), InsideSignal.class ).putExtra( "reference","blockins" ) );
                break;
            case R.id.datalogger:
                startActivity( new Intent( getContext(), InsideSignal.class ).putExtra( "reference","datalogger" ) );
                break;
            case R.id.ei:
                startActivity( new Intent( getContext(), InsideSignal.class ).putExtra( "reference","ei" ) );
                break;
            case R.id.track:
                startActivity( new Intent( getContext(), InsideSignal.class ).putExtra( "reference","track" ) );
                break;
            case R.id.hassdac:
                startActivity( new Intent( getContext(), InsideSignal.class ).putExtra( "reference","hassdac" ) );
                break;
            case R.id.pointmachine:
                startActivity( new Intent( getContext(), InsideSignal.class ).putExtra( "reference","pointmachine" ) );
                break;
            case R.id.updates:
                startActivity( new Intent( getContext(), InsideSignal.class ).putExtra( "reference","updates" ) );
                break;
            case R.id.rri:
                startActivity( new Intent( getContext(), InsideSignal.class ).putExtra( "reference","rri" ) );
                break;
            case R.id.relays:
                startActivity( new Intent( getContext(), InsideSignal.class ).putExtra( "reference","relays" ) );
                break;
            case R.id.cls:
                startActivity( new Intent( getContext(), InsideSignal.class ).putExtra( "reference","cls" ) );
                break;
            case R.id.ips:
                startActivity( new Intent( getContext(), InsideSignal.class ).putExtra( "reference","ips" ) );
                break;
            case R.id.tpws:
                startActivity( new Intent( getContext(), InsideSignal.class ).putExtra( "reference","tpws" ) );
                break;
            case R.id.policies:
                startActivity( new Intent( getContext(), InsideSignal.class ).putExtra( "reference","policies" ) );
                break;
            case R.id.test:
                startActivity( new Intent( getContext(), InsideSignal.class ).putExtra( "reference","test" ) );
                break;

        }
    }
}
