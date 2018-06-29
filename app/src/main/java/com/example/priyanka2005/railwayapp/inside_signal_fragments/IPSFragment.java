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

public class IPSFragment extends Fragment implements View.OnClickListener {

    private CardView ips1,ips2,ips3,ips4,ips5,ips6;


    public IPSFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_signal_ips,container,false );

        ips1 = (CardView)view.findViewById( R.id.ips1 );
        ips1.setOnClickListener( this );
        ips2 = (CardView)view.findViewById( R.id.ips2 );
        ips2.setOnClickListener( this );
        ips3 = (CardView)view.findViewById( R.id.ips3 );
        ips3.setOnClickListener( this );
        ips4 = (CardView)view.findViewById( R.id.ips4 );
        ips4.setOnClickListener( this );
        ips5 = (CardView)view.findViewById( R.id.ips5 );
        ips5.setOnClickListener( this );
        ips6 = (CardView)view.findViewById( R.id.ips6 );
        ips6.setOnClickListener( this );

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ips1:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","ips1" ) );
                break;
            case R.id.ips2:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","ips2" ) );
                break;
            case R.id.ips3:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","ips3" ) );
                break;
            case R.id.ips4:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","ips4" ) );
                break;
            case R.id.ips5:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","ips5" ) );
                break;
            case R.id.ips6:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","ips6" ) );
                break;

        }
    }
}
