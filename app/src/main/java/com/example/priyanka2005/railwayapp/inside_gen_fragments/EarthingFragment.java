package com.example.priyanka2005.railwayapp.inside_gen_fragments;

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
import com.example.priyanka2005.railwayapp.listview_activities.InsideGenList;
import com.example.priyanka2005.railwayapp.listview_activities.InsideHomeList;

public class EarthingFragment extends Fragment implements View.OnClickListener {

    private CardView earthing1,earthing2,earthing3;
    public EarthingFragment() {
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_gen_earthing,container,false );

        earthing1 = (CardView)view.findViewById( R.id.earthing1 );
        earthing2 = (CardView)view.findViewById( R.id.earthing2 );
        earthing3 = (CardView)view.findViewById( R.id.earthing3 );


        earthing1.setOnClickListener( this );
        earthing2.setOnClickListener( this );
        earthing3.setOnClickListener( this );

        return view;
    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){
            case R.id.earthing1:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","earthing1" ) );
                break;
            case R.id.earthing2:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","earthing2" ) );
                break;
            case R.id.earthing3:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","earthing3" ) );
                break;
        }
    }
}
