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

public class TrackFragment extends Fragment implements View.OnClickListener {

    private CardView track1,track2,track3,track4,track5,track6,track7,track8,track9,track10,track11,track12;

    public TrackFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_signal_track,container,false );
        track1 = (CardView)view.findViewById( R.id.track1 );
        track1.setOnClickListener( this );
        track2 = (CardView)view.findViewById( R.id.track2 );
        track2.setOnClickListener( this );
        track3 = (CardView)view.findViewById( R.id.track3 );
        track3.setOnClickListener( this );
        track4 = (CardView)view.findViewById( R.id.track4 );
        track4.setOnClickListener( this );
        track5 = (CardView)view.findViewById( R.id.track5 );
        track5.setOnClickListener( this );
        track6 = (CardView)view.findViewById( R.id.track6 );
        track6.setOnClickListener( this );
        track7 = (CardView)view.findViewById( R.id.track7 );
        track7.setOnClickListener( this );
        track8 = (CardView)view.findViewById( R.id.track8 );
        track8.setOnClickListener( this );
        track9 = (CardView)view.findViewById( R.id.track9 );
        track9.setOnClickListener( this );
        track10 = (CardView)view.findViewById( R.id.track10 );
        track10.setOnClickListener( this );
        track11 = (CardView)view.findViewById( R.id.track11 );
        track11.setOnClickListener( this );
        track12 = (CardView)view.findViewById( R.id.track12);
        track12.setOnClickListener( this );

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.track1:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","track1" ) );
                break;
            case R.id.track2:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","track2" ) );
                break;
            case R.id.track3:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","track3" ) );
                break;
            case R.id.track4:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","track4" ) );
                break;
            case R.id.track5:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","track5" ) );
                break;
            case R.id.track6:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","track6" ) );
                break;
            case R.id.track7:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","track7" ) );
                break;
            case R.id.track8:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","track8" ) );
                break;
            case R.id.track9:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","track9" ) );
                break;
            case R.id.track10:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","track10" ) );
                break;
            case R.id.track11:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","track11" ) );
                break;
            case R.id.track12:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","track12" ) );
                break;

        }
    }
}
