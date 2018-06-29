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

public class BasicFragment extends Fragment implements View.OnClickListener {

    private CardView basic1,basic2,basic3,basic4,basic5,basic6,basic7,basic8,basic9,basic10,basic11,basic12,basic13,basic14;

    public BasicFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_signal_basic,container,false );
        basic1 = (CardView)view.findViewById( R.id.basic1 );
        basic1.setOnClickListener( this );
        basic2 = (CardView)view.findViewById( R.id.basic2 );
        basic2.setOnClickListener( this );
        basic3 = (CardView)view.findViewById( R.id.basic3 );
        basic3.setOnClickListener( this );
        basic4 = (CardView)view.findViewById( R.id.basic4 );
        basic4.setOnClickListener( this );
        basic5 = (CardView)view.findViewById( R.id.basic5 );
        basic5.setOnClickListener( this );
        basic6 = (CardView)view.findViewById( R.id.basic6 );
        basic6.setOnClickListener( this );
        basic7 = (CardView)view.findViewById( R.id.basic7 );
        basic7.setOnClickListener( this );
        basic8 = (CardView)view.findViewById( R.id.basic8 );
        basic8.setOnClickListener( this );
        basic9 = (CardView)view.findViewById( R.id.basic9 );
        basic9.setOnClickListener( this );
        basic10 = (CardView)view.findViewById( R.id.basic10 );
        basic10.setOnClickListener( this );
        basic11 = (CardView)view.findViewById( R.id.basic11);
        basic11.setOnClickListener( this );
        basic12= (CardView)view.findViewById( R.id.basic12);
        basic12.setOnClickListener( this );
        basic13 = (CardView)view.findViewById( R.id.basic13);
        basic13.setOnClickListener( this );
        basic14 = (CardView)view.findViewById( R.id.basic14);
        basic14.setOnClickListener( this );

        return view;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){

            case R.id.basic1:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","basic1" ) );
                break;
            case R.id.basic2:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","basic2" ) );
                break;
            case R.id.basic3:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","basic3" ) );
                break;
            case R.id.basic4:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","basic4" ) );
                break;
            case R.id.basic5:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","basic5" ) );
                break;
            case R.id.basic6:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","basic6" ) );
                break;
            case R.id.basic7:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","basic7" ) );
                break;
            case R.id.basic8:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","basic8" ) );
                break;
            case R.id.basic9:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","basic9" ) );
                break;
            case R.id.basic10:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","basic10" ) );
                break;
            case R.id.basic11:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","basic11" ) );
                break;
            case R.id.basic12:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","basic12" ) );
                break;
            case R.id.basic13:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","basic13" ) );
                break;
            case R.id.basic14:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","basic14" ) );
                break;
        }
    }
}
