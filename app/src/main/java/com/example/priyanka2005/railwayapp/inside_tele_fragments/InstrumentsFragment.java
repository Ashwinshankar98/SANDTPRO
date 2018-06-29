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

public class InstrumentsFragment extends Fragment implements View.OnClickListener {
    private CardView ins1,ins2,ins3;

    public InstrumentsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_tele_instruments,container,false );

        ins1 = (CardView)view.findViewById( R.id.ins1 );
        ins1.setOnClickListener( this );
        ins2 = (CardView)view.findViewById( R.id.ins2 );
        ins2.setOnClickListener( this );
        ins3 = (CardView)view.findViewById( R.id.ins3 );
        ins3.setOnClickListener( this );
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ins1:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","ins1" ) );
                break;
            case R.id.ins2:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","ins2" ) );
                break;
            case R.id.ins3:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","ins3" ) );
                break;

        }
    }
}
