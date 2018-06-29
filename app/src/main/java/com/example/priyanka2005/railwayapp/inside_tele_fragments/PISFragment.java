package com.example.priyanka2005.railwayapp.inside_tele_fragments;

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
import com.example.priyanka2005.railwayapp.listview_activities.InsideTeleList;

public class PISFragment extends Fragment implements View.OnClickListener {

    private CardView pis1,pis2,pis3,pis4,pis5,pis6,pis7,pis8,pis9,pis10,pis11,pis12;

    public PISFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_tele_pis,container,false );

        pis1 = (CardView)view.findViewById( R.id.pis1 );
        pis1.setOnClickListener( this );
        pis2 = (CardView)view.findViewById( R.id.pis2 );
        pis2.setOnClickListener( this );
        pis3 = (CardView)view.findViewById( R.id.pis3 );
        pis3.setOnClickListener( this );
        pis4 = (CardView)view.findViewById( R.id.pis4 );
        pis4.setOnClickListener( this );
        pis5 = (CardView)view.findViewById( R.id.pis5 );
        pis5.setOnClickListener( this );
        pis6 = (CardView)view.findViewById( R.id.pis6 );
        pis6.setOnClickListener( this );
        pis7 = (CardView)view.findViewById( R.id.pis7 );
        pis7.setOnClickListener( this );
        pis8 = (CardView)view.findViewById( R.id.pis8 );
        pis8.setOnClickListener( this );
        pis9 = (CardView)view.findViewById( R.id.pis9 );
        pis9.setOnClickListener( this );
        pis10 = (CardView)view.findViewById( R.id.pis10 );
        pis10.setOnClickListener( this );
        pis11 = (CardView)view.findViewById( R.id.pis11 );
        pis11.setOnClickListener( this );
        pis12 = (CardView)view.findViewById( R.id.pis12);
        pis12.setOnClickListener( this );
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.pis1:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","pis1" ) );
                break;
            case R.id.pis2:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","pis2" ) );
                break;
            case R.id.pis3:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","pis3" ) );
                break;
            case R.id.pis4:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","pis4" ) );
                break;
            case R.id.pis5:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","pis5" ) );
                break;
            case R.id.pis6:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","pis6" ) );
                break;
            case R.id.pis7:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","pis7" ) );
                break;
            case R.id.pis8:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","pis8" ) );
                break;
            case R.id.pis9:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","pis9" ) );
                break;
            case R.id.pis10:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","pis10" ) );
                break;
            case R.id.pis11:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","pis11" ) );
                break;
            case R.id.pis12:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","pis12" ) );
                break;
        }
    }
}
