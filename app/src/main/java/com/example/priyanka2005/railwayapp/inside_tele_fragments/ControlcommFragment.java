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

public class ControlcommFragment extends Fragment implements View.OnClickListener {
    private CardView controlcomm1,controlcomm2,controlcomm3,controlcomm4,controlcomm5;

    public ControlcommFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_tele_controlcomm,container,false );

        controlcomm1 = (CardView)view.findViewById( R.id.controlcomm1 );
        controlcomm1.setOnClickListener( this );
        controlcomm2 = (CardView)view.findViewById( R.id.controlcomm2 );
        controlcomm2.setOnClickListener( this );
        controlcomm3 = (CardView)view.findViewById( R.id.controlcomm3 );
        controlcomm3.setOnClickListener( this );
        controlcomm4 = (CardView)view.findViewById( R.id.controlcomm4 );
        controlcomm4.setOnClickListener( this );

        return view;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.controlcomm1:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","controlcomm1" ) );
                break;
            case R.id.controlcomm2:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","controlcomm2" ) );
                break;
            case R.id.controlcomm3:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","controlcomm3" ) );
                break;
            case R.id.controlcomm4:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","controlcomm4" ) );
                break;
            case R.id.controlcomm5:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","controlcomm5" ) );
                break;

        }
    }
}
