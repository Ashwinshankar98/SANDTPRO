package com.example.priyanka2005.railwayapp.inside_tele_fragments;

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
import com.example.priyanka2005.railwayapp.listview_activities.InsideTeleList;

public class PowerFragment extends Fragment implements View.OnClickListener {

    private CardView power1,power2,power3;
    public PowerFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_tele_power,container,false );

        power1 = (CardView)view.findViewById( R.id.power1 );
        power1.setOnClickListener( this );
        power2 = (CardView)view.findViewById( R.id.power2 );
        power2.setOnClickListener( this );
        power3 = (CardView)view.findViewById( R.id.power3 );
        power3.setOnClickListener( this );
        return view;
    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){
            case R.id.power1:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","power1" ) );
                break;
            case R.id.power2:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","power2" ) );
                break;
            case R.id.power3:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","power3" ) );
                break;

        }

    }
}
