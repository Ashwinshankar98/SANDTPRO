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

public class ConfigureFragment extends Fragment implements View.OnClickListener {
    private CardView config1,config2,config3,config4;

    public ConfigureFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_tele_configure,container,false );

        config1 = (CardView)view.findViewById( R.id.config1 );
        config1.setOnClickListener( this );
        config2 = (CardView)view.findViewById( R.id.config2 );
        config2.setOnClickListener( this );
        config3 = (CardView)view.findViewById( R.id.config3 );
        config3.setOnClickListener( this );

        return view;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.config1:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","config1" ) );
                break;
            case R.id.config2:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","config2" ) );
                break;
            case R.id.config3:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","config3" ) );
                break;

        }

    }
}
