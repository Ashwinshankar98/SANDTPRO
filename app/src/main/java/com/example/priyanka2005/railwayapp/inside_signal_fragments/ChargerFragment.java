package com.example.priyanka2005.railwayapp.inside_signal_fragments;

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
import com.example.priyanka2005.railwayapp.listview_activities.InsideSignalList;

public class ChargerFragment extends Fragment implements View.OnClickListener {

    private CardView charger1,charger2;

    public ChargerFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_signal_charger,container,false );

        charger1 = (CardView)view.findViewById( R.id.charger1 );
        charger2 = (CardView)view.findViewById( R.id.charger2 );

        charger1.setOnClickListener( this );
        charger2.setOnClickListener( this );
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.charger1:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","charger1" ) );
                break;
            case R.id.charger2:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","charger2" ) );
                break;
        }
    }
}
