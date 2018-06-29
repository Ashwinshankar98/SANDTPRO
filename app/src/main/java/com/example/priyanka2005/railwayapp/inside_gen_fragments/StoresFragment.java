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

public class StoresFragment extends Fragment implements View.OnClickListener {
    private CardView stores1,stores2,stores3,stores4,stores5;
    public StoresFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_gen_stores,container,false );
        stores1 = (CardView)view.findViewById( R.id.stores1 );
        stores1.setOnClickListener( this );
        stores2 = (CardView)view.findViewById( R.id.stores2 );
        stores2.setOnClickListener( this );
        stores3 = (CardView)view.findViewById( R.id.stores3 );
        stores3.setOnClickListener( this );
        stores4 = (CardView)view.findViewById( R.id.stores4 );
        stores4.setOnClickListener( this );
        stores5 = (CardView)view.findViewById( R.id.stores5 );
        stores5.setOnClickListener( this );

        return view;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.stores1:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","stores1" ) );
                break;
            case R.id.stores2:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","stores2" ) );
                break;
            case R.id.stores3:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","stores3" ) );
                break;
            case R.id.stores4:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","stores4" ) );
                break;
            case R.id.stores5:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","stores5" ) );
                break;

        }
    }
}
