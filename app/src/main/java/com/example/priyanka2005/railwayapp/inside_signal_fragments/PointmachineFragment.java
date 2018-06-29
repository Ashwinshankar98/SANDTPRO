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

public class PointmachineFragment extends Fragment implements View.OnClickListener {

    private CardView pm1,pm2,pm3,pm4,pm5,pm6,pm7;

    public PointmachineFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_signal_pointmachine,container,false );
        pm1 = (CardView)view.findViewById( R.id.pm1  );
        pm1.setOnClickListener( this );
        pm1 = (CardView)view.findViewById( R.id.pm2 );
        pm1.setOnClickListener( this );
        pm1 = (CardView)view.findViewById( R.id.pm3 );
        pm1.setOnClickListener( this );
        pm1 = (CardView)view.findViewById( R.id.pm4 );
        pm1.setOnClickListener( this );
        pm1 = (CardView)view.findViewById( R.id.pm5 );
        pm1.setOnClickListener( this );
        pm1 = (CardView)view.findViewById( R.id.pm6 );
        pm1.setOnClickListener( this );
        pm1 = (CardView)view.findViewById( R.id.pm7 );
        pm1.setOnClickListener( this );
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.pm1:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","pm1" ) );
                break;
            case R.id.pm2:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","pm2" ) );
                break;
            case R.id.pm3:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","pm3" ) );
                break;
            case R.id.pm4:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","pm4" ) );
                break;
            case R.id.pm5:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","pm5" ) );
                break;
            case R.id.pm6:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","pm6" ) );
                break;
            case R.id.pm7:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","pm7" ) );
                break;
        }
    }
}
