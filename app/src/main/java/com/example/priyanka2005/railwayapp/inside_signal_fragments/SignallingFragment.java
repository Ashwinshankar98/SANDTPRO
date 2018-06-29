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

public class SignallingFragment extends Fragment implements View.OnClickListener {

    private CardView sig1,sig2,sig3,sig4,sig5,sig6,sig7,sig8;

    public SignallingFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_signal_signalling,container,false );

        sig1 = (CardView)view.findViewById( R.id.sig1 );
        sig1.setOnClickListener( this );
        sig2 = (CardView)view.findViewById( R.id.sig2 );
        sig2.setOnClickListener( this );
        sig3 = (CardView)view.findViewById( R.id.sig3 );
        sig3.setOnClickListener( this );
        sig4 = (CardView)view.findViewById( R.id.sig4 );
        sig4.setOnClickListener( this );
        sig5 = (CardView)view.findViewById( R.id.sig5 );
        sig5.setOnClickListener( this );
        sig6 = (CardView)view.findViewById( R.id.sig6 );
        sig6.setOnClickListener( this );
        sig7 = (CardView)view.findViewById( R.id.sig7 );
        sig7.setOnClickListener( this );
        sig8 = (CardView)view.findViewById( R.id.sig8 );
        sig8.setOnClickListener( this );
        return view;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.sig1:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","sig1" ) );
                break;
            case R.id.sig2:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","sig2" ) );
                break;
            case R.id.sig3:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","sig3" ) );
                break;
            case R.id.sig4:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","sig4" ) );
                break;
            case R.id.sig5:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","sig5" ) );
                break;
            case R.id.sig6:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","sig6" ) );
                break;
            case R.id.sig7:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","sig7" ) );
                break;
            case R.id.sig8:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","sig8" ) );
                break;
        }
    }
}
