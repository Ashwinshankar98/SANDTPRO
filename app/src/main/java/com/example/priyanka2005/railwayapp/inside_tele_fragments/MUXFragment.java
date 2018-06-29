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

public class MUXFragment extends Fragment implements View.OnClickListener {
    private CardView mux1,mux2,mux3,mux4;


    public MUXFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_tele_mux,container,false );

        mux1 = (CardView)view.findViewById( R.id.mux1 );
        mux1.setOnClickListener( this );
        mux2 = (CardView)view.findViewById( R.id.mux2 );
        mux2.setOnClickListener( this );
        mux3 = (CardView)view.findViewById( R.id.mux3 );
        mux3.setOnClickListener( this );
        mux4 = (CardView)view.findViewById( R.id.mux4 );
        mux4.setOnClickListener( this );
        return view;
    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){

            case R.id.mux1:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","mux1" ) );
                break;
            case R.id.mux2:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","mux2" ) );
                break;
            case R.id.mux3:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","mux3" ) );
                break;
            case R.id.mux4:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","mux4" ) );
                break;
        }

    }
}
