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

public class BlockinsFragment extends Fragment implements View.OnClickListener {
    private CardView bins1,bins2,bins3,bins4,bins5,bins6,bins7,bins8,bins9,bins10;

    public BlockinsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_signal_blockins,container,false );
        bins1 = (CardView)view.findViewById( R.id.bins1 );
        bins1.setOnClickListener( this );
        bins2 = (CardView)view.findViewById( R.id.bins2 );
        bins2.setOnClickListener( this );
        bins3 = (CardView)view.findViewById( R.id.bins3 );
        bins3.setOnClickListener( this );
        bins4 = (CardView)view.findViewById( R.id.bins4 );
        bins4.setOnClickListener( this );
        bins5 = (CardView)view.findViewById( R.id.bins5 );
        bins5.setOnClickListener( this );
        bins6 = (CardView)view.findViewById( R.id.bins6 );
        bins6.setOnClickListener( this );
        bins7 = (CardView)view.findViewById( R.id.bins7 );
        bins7.setOnClickListener( this );
        bins8 = (CardView)view.findViewById( R.id.bins8 );
        bins8.setOnClickListener( this );
        bins9 = (CardView)view.findViewById( R.id.bins9 );
        bins9.setOnClickListener( this );
        bins10 = (CardView)view.findViewById( R.id.bins10 );
        bins10.setOnClickListener( this );
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bins1:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","bins1" ) );
                break;
            case R.id.bins2:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","bins2" ) );
                break;
            case R.id.bins3:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","bins3" ) );
                break;
            case R.id.bins4:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","bins4" ) );
                break;
            case R.id.bins5:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","bins5" ) );
                break;
            case R.id.bins6:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","bins6" ) );
                break;
            case R.id.bins7:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","bins7" ) );
                break;
            case R.id.bins8:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","bins8" ) );
                break;
            case R.id.bins9:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","bins9" ) );
                break;
            case R.id.bins10:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","bins10" ) );
                break;
        }
    }
}
