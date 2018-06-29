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

public class MagnetoFragment extends Fragment implements View.OnClickListener {
    private CardView magneto1,magneto2,magneto3,magneto4;

    public MagnetoFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_tele_magneto,container,false );

        magneto1 = (CardView)view.findViewById( R.id.magneto1 );
        magneto1.setOnClickListener( this );
        magneto2 = (CardView)view.findViewById( R.id.magneto2 );
        magneto2.setOnClickListener( this );
        magneto3 = (CardView)view.findViewById( R.id.magneto3 );
        magneto3.setOnClickListener( this );
        magneto4 = (CardView)view.findViewById( R.id.magneto4 );
        magneto4.setOnClickListener( this );
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.magneto1:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","magneto1" ) );
                break;
            case R.id.magneto2:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","magneto2" ) );
                break;
            case R.id.magneto3:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","magneto3" ) );
                break;
            case R.id.magneto4:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","magneto4" ) );
                break;
        }
    }
}
