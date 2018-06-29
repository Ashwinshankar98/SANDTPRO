package com.example.priyanka2005.railwayapp.inside_signal_fragments;

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
import com.example.priyanka2005.railwayapp.listview_activities.InsideSignalList;

public class RelaysFragment extends Fragment implements View.OnClickListener {
    private CardView relay1,relay2,relay3,relay4,relay5,relay6,relay7,relay8,relay9,relay10,relay11,relay12,relay13,relay14,relay15,relay16,relay17;

    public RelaysFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_signal_relays,container,false );
        relay1=(CardView)view.findViewById( R.id.relay1 );
        relay1.setOnClickListener( this );
        relay2=(CardView)view.findViewById( R.id.relay2 );
        relay2.setOnClickListener( this );
        relay3=(CardView)view.findViewById( R.id.relay3 );
        relay3.setOnClickListener( this );
        relay4=(CardView)view.findViewById( R.id.relay4 );
        relay4.setOnClickListener( this );
        relay5=(CardView)view.findViewById( R.id.relay5 );
        relay5.setOnClickListener( this );
        relay6=(CardView)view.findViewById( R.id.relay6 );
        relay6.setOnClickListener( this );
        relay7=(CardView)view.findViewById( R.id.relay7 );
        relay7.setOnClickListener( this );
        relay8 =(CardView)view.findViewById( R.id.relay8 );
        relay8.setOnClickListener( this );
        relay9=(CardView)view.findViewById( R.id.relay9 );
        relay9.setOnClickListener( this );
        relay10=(CardView)view.findViewById( R.id.relay10 );
        relay10.setOnClickListener( this );
        relay11=(CardView)view.findViewById( R.id.relay11 );
        relay11.setOnClickListener( this );
        relay12=(CardView)view.findViewById( R.id.relay12 );
        relay12.setOnClickListener( this );
        relay13=(CardView)view.findViewById( R.id.relay13 );
        relay13.setOnClickListener( this );
        relay14=(CardView)view.findViewById( R.id.relay14 );
        relay14.setOnClickListener( this );
        relay15=(CardView)view.findViewById( R.id.relay15 );
        relay15.setOnClickListener( this );
        relay16=(CardView)view.findViewById( R.id.relay16 );
        relay16.setOnClickListener( this );
        relay17=(CardView)view.findViewById( R.id.relay17 );
        relay17.setOnClickListener( this );
        return view;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.relay1:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","relay1" ) );
                break;
            case R.id.relay2:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","relay2" ) );
                break;
            case R.id.relay3:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","relay3" ) );
                break;
            case R.id.relay4:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","relay4" ) );
                break;
            case R.id.relay5:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","relay5" ) );
                break;
            case R.id.relay6:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","relay6" ) );
                break;
            case R.id.relay7:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","relay7" ) );
                break;
            case R.id.relay8:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","relay8" ) );
                break;
            case R.id.relay9:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","relay9" ) );
                break;
            case R.id.relay10:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","relay10" ) );
                break;
            case R.id.relay11:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","relay11" ) );
                break;
            case R.id.relay12:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","relay12" ) );
                break;
            case R.id.relay13:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","relay13" ) );
                break;
            case R.id.relay14:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","relay14" ) );
                break;
            case R.id.relay15:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","relay15" ) );
                break;
            case R.id.relay16:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","relay16" ) );
                break;
            case R.id.relay17:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","relay17" ) );
                break;
        }
    }
}
