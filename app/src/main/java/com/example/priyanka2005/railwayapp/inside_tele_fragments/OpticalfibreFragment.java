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

public class OpticalfibreFragment extends Fragment implements View.OnClickListener {

    private CardView of1,of2,of3,of4,of5,of6,of7,of8;

    public OpticalfibreFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_tele_opticalfibre,container,false );

        of1 = (CardView)view.findViewById( R.id.of1);
        of1.setOnClickListener( this );
        of2 = (CardView)view.findViewById( R.id.of2);
        of2.setOnClickListener( this );
        of3 = (CardView)view.findViewById( R.id.of3);
        of3.setOnClickListener( this );
        of4 = (CardView)view.findViewById( R.id.of4);
        of4.setOnClickListener( this );
        of5 = (CardView)view.findViewById( R.id.of5);
        of5.setOnClickListener( this );
        of6 = (CardView)view.findViewById( R.id.of6);
        of6.setOnClickListener( this );
        of7 = (CardView)view.findViewById( R.id.of7);
        of7.setOnClickListener( this );
        of8 = (CardView)view.findViewById( R.id.of8);
        of8.setOnClickListener( this );
        return view;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.of1:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","of1" ) );
                break;
            case R.id.of2:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","of2" ) );
                break;
            case R.id.of3:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","of3" ) );
                break;
            case R.id.of4:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","of4" ) );
                break;
            case R.id.of5:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","of5" ) );
                break;
            case R.id.of6:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","of6" ) );
                break;
            case R.id.of7:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","of7" ) );
                break;
            case R.id.of8:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","of8" ) );
                break;

        }

    }
}
