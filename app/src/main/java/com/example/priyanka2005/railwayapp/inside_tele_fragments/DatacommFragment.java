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

public class DatacommFragment extends Fragment implements View.OnClickListener {
    private CardView dc1,dc2,dc3,dc4,dc5,dc6,dc7,dc8,dc9,dc10,dc11,dc12;
    public DatacommFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_tele_datacomm,container,false );

        dc1 = (CardView)view.findViewById( R.id.dc1 );
        dc1.setOnClickListener( this );
        dc2 = (CardView)view.findViewById( R.id.dc2 );
        dc2.setOnClickListener( this );
        dc3 = (CardView)view.findViewById( R.id.dc3 );
        dc3.setOnClickListener( this );
        dc4 = (CardView)view.findViewById( R.id.dc4 );
        dc4.setOnClickListener( this );
        dc5 = (CardView)view.findViewById( R.id.dc5 );
        dc5.setOnClickListener( this );
        dc6 = (CardView)view.findViewById( R.id.dc6 );
        dc6.setOnClickListener( this );
        dc7 = (CardView)view.findViewById( R.id.dc7 );
        dc7.setOnClickListener( this );
        dc8 = (CardView)view.findViewById( R.id.dc8 );
        dc8.setOnClickListener( this );
        dc9 = (CardView)view.findViewById( R.id.dc9 );
        dc9.setOnClickListener( this );
        dc10 = (CardView)view.findViewById( R.id.dc10 );
        dc10.setOnClickListener( this );
        dc11 = (CardView)view.findViewById( R.id.dc11);
        dc11.setOnClickListener( this );
        dc12 = (CardView)view.findViewById( R.id.dc12);
        dc12.setOnClickListener( this );
        return view;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.dc1:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","dc1" ) );
                break;
            case R.id.dc2:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","dc2" ) );
                break;
            case R.id.dc3:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","dc3" ) );
                break;
            case R.id.dc4:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","dc4" ) );
                break;
            case R.id.dc5:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","dc5" ) );
                break;
            case R.id.dc6:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","dc6" ) );
                break;
            case R.id.dc7:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","dc7" ) );
                break;
            case R.id.dc8:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","dc8" ) );
                break;
            case R.id.dc9:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","dc9" ) );
                break;
            case R.id.dc10:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","dc10" ) );
                break;
            case R.id.dc11:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","dc11" ) );
                break;
            case R.id.dc12:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","dc12" ) );
                break;
        }
    }
}
