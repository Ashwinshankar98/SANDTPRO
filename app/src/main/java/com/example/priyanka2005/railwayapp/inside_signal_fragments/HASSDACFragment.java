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

public class HASSDACFragment extends Fragment implements View.OnClickListener {

    private CardView hd1,hd2,hd3,hd4,hd5,hd6,hd7;

    public HASSDACFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_signal_hassdac,container,false );
        hd1 = (CardView)view.findViewById( R.id.hd1 );
        hd1.setOnClickListener( this );
        hd2 = (CardView)view.findViewById( R.id.hd2 );
        hd2.setOnClickListener( this );
        hd3 = (CardView)view.findViewById( R.id.hd3 );
        hd3.setOnClickListener( this );
        hd4 = (CardView)view.findViewById( R.id.hd4 );
        hd4.setOnClickListener( this );
        hd5 = (CardView)view.findViewById( R.id.hd5 );
        hd5.setOnClickListener( this );
        hd6 = (CardView)view.findViewById( R.id.hd6 );
        hd6.setOnClickListener( this );
        hd7 = (CardView)view.findViewById( R.id.hd7 );
        hd7.setOnClickListener( this );
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.hd1:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","hd1" ) );
                break;
            case R.id.hd2:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","hd2" ) );
                break;
            case R.id.hd3:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","hd3" ) );
                break;
            case R.id.hd4:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","hd4" ) );
                break;
            case R.id.hd5:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","hd5" ) );
                break;
            case R.id.hd6:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","hd6" ) );
                break;
            case R.id.hd7:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","hd7" ) );
                break;
        }
    }
}
