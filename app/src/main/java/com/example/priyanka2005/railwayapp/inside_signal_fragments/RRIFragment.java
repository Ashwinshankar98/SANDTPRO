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
import com.example.priyanka2005.railwayapp.inside_activities.InsideSignal;
import com.example.priyanka2005.railwayapp.listview_activities.InsideSignalList;

public class RRIFragment extends Fragment implements View.OnClickListener {

    private CardView rri1,rri2,rri3,rri4,rri5;

    public RRIFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_signal_rri,container,false );
        rri1 = (CardView)view.findViewById( R.id.rri1 );
        rri1.setOnClickListener( this );
        rri2 = (CardView)view.findViewById( R.id.rri2 );
        rri2.setOnClickListener( this );
        rri3 = (CardView)view.findViewById( R.id.rri3 );
        rri3.setOnClickListener( this );
        rri4 = (CardView)view.findViewById( R.id.rri4 );
        rri4.setOnClickListener( this );
        rri5 = (CardView)view.findViewById( R.id.rri5 );
        rri5.setOnClickListener( this );
        return view;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.rri1:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","rri1" ) );
                break;
            case R.id.rri2:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","rri2" ) );
                break;
            case R.id.rri3:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","rri3" ) );
                break;
            case R.id.rri4:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","rri4" ) );
                break;
            case R.id.rri5:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","rri5" ) );
                break;
        }
    }
}
