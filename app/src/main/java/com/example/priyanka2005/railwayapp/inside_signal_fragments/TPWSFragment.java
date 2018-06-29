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

public class TPWSFragment extends Fragment implements View.OnClickListener {
    private CardView tpws1,tpws2,tpws3;

    public TPWSFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_signal_tpws,container,false );

        tpws1 = (CardView)view.findViewById( R.id.tpws1 );
        tpws1.setOnClickListener( this );
        tpws2 = (CardView)view.findViewById( R.id.tpws2 );
        tpws2.setOnClickListener( this );
        tpws3 = (CardView)view.findViewById( R.id.tpws3 );
        tpws3.setOnClickListener( this );

        return view;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.tpws1:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","tpws1" ) );
                break;
            case R.id.tpws2:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","tpws2" ) );
                break;
            case R.id.tpws3:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","tpws3" ) );
                break;
        }
    }
}
