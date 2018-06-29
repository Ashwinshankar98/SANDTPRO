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

public class PAFragment extends Fragment implements View.OnClickListener {

    private CardView pa1,pa2,pa3,pa4,pa5,pa6,pa7;

    public PAFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_tele_pa,container,false );

        pa1 = (CardView)view.findViewById( R.id.pa1);
        pa1.setOnClickListener( this );
        pa2 = (CardView)view.findViewById( R.id.pa2);
        pa2.setOnClickListener( this );
        pa3 = (CardView)view.findViewById( R.id.pa3);
        pa3.setOnClickListener( this );
        pa4 = (CardView)view.findViewById( R.id.pa4);
        pa4.setOnClickListener( this );
        pa5 = (CardView)view.findViewById( R.id.pa5);
        pa5.setOnClickListener( this );
        pa6 = (CardView)view.findViewById( R.id.pa6);
        pa6.setOnClickListener( this );
        pa7 = (CardView)view.findViewById( R.id.pa7);
        pa7.setOnClickListener( this );

        return view;
    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){
            case R.id.pa1:
                startActivity( new Intent( getContext(), InsideTeleList.class ) .putExtra( "reference","pa1" ));
                break;
            case R.id.pa2:
                startActivity( new Intent( getContext(), InsideTeleList.class ) .putExtra( "reference","pa2" ));
                break;
            case R.id.pa3:
                startActivity( new Intent( getContext(), InsideTeleList.class ) .putExtra( "reference","pa3" ));
                break;
            case R.id.pa4:
                startActivity( new Intent( getContext(), InsideTeleList.class ) .putExtra( "reference","pa4" ));
                break;
            case R.id.pa5:
                startActivity( new Intent( getContext(), InsideTeleList.class ) .putExtra( "reference","pa5" ));
                break;
            case R.id.pa6:
                startActivity( new Intent( getContext(), InsideTeleList.class ) .putExtra( "reference","pa6" ));
                break;
            case R.id.pa7:
                startActivity( new Intent( getContext(), InsideTeleList.class ) .putExtra( "reference","pa7" ));
                break;
        }
    }
}
