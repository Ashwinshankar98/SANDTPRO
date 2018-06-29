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

public class QuadcableFragment extends Fragment implements View.OnClickListener {

    private CardView qc1,qc2,qc3,qc4,qc5,qc6,qc7,qc8,qc9,qc10,qc11,qc12,qc13,qc14,qc15;

    public QuadcableFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_tele_quadcable,container,false );

        qc1 = (CardView)view.findViewById( R.id.qc1 );
        qc1.setOnClickListener( this );
        qc2 = (CardView)view.findViewById( R.id.qc2 );
        qc2.setOnClickListener( this );
        qc3 = (CardView)view.findViewById( R.id.qc3 );
        qc3.setOnClickListener( this );
        qc4 = (CardView)view.findViewById( R.id.qc4 );
        qc4.setOnClickListener( this );
        qc5 = (CardView)view.findViewById( R.id.qc5 );
        qc5.setOnClickListener( this );
        qc6 = (CardView)view.findViewById( R.id.qc6 );
        qc6.setOnClickListener( this );
        qc7 = (CardView)view.findViewById( R.id.qc7 );
        qc7.setOnClickListener( this );
        qc8 = (CardView)view.findViewById( R.id.qc8 );
        qc8.setOnClickListener( this );
        qc9 = (CardView)view.findViewById( R.id.qc9 );
        qc9.setOnClickListener( this );
        qc10 = (CardView)view.findViewById( R.id.qc10 );
        qc10.setOnClickListener( this );
        qc11 = (CardView)view.findViewById( R.id.qc11);
        qc11.setOnClickListener( this );



        return view;
    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){
            case R.id.qc1:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","qc1" ) );
                break;
            case R.id.qc2:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","qc2" ) );
                break;
            case R.id.qc3:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","qc3" ) );
                break;
            case R.id.qc4:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","qc4" ) );
                break;
            case R.id.qc5:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","qc5" ) );
                break;
            case R.id.qc6:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","qc6" ) );
                break;
            case R.id.qc7:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","qc7" ) );
                break;
            case R.id.qc8:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","qc8" ) );
                break;
            case R.id.qc9:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","qc9" ) );
                break;
            case R.id.qc10:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","qc10" ) );
                break;
            case R.id.qc11:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","qc11" ) );
                break;


        }

    }
}
