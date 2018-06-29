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

public class AFTCFragment extends Fragment implements View.OnClickListener {
    private CardView aftc1,aftc2,aftc3,aftc4,aftc5;

    public AFTCFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_signal_aftc,container,false );

        aftc1=(CardView)view.findViewById( R.id.aftc1 );
        aftc1.setOnClickListener( this );
        aftc2=(CardView)view.findViewById( R.id.aftc2 );
        aftc2.setOnClickListener( this );
        aftc3=(CardView)view.findViewById( R.id.aftc3 );
        aftc3.setOnClickListener( this );
        aftc4=(CardView)view.findViewById( R.id.aftc4 );
        aftc4.setOnClickListener( this );
        aftc5=(CardView)view.findViewById( R.id.aftc5 );
        aftc5.setOnClickListener( this );

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.aftc1:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","aftc1" ) );
                break;
            case R.id.aftc2:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","aftc2" ) );
                break;
            case R.id.aftc3:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","aftc3" ) );
                break;
            case R.id.aftc4:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","aftc4" ) );
                break;
            case R.id.aftc5:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","aftc5" ) );
                break;
        }
    }
}
