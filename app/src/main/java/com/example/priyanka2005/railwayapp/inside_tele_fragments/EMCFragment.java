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

public class EMCFragment extends Fragment implements View.OnClickListener {

    private CardView emc1,emc2,emc3,emc4;

    public EMCFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_tele_emc,container,false );

        emc1 = (CardView)view.findViewById( R.id.emc1 );
        emc1.setOnClickListener( this );
        emc2 = (CardView)view.findViewById( R.id.emc2 );
        emc2.setOnClickListener( this );
        emc3 = (CardView)view.findViewById( R.id.emc3 );
        emc3.setOnClickListener( this );
        emc4 = (CardView)view.findViewById( R.id.emc4 );
        emc4.setOnClickListener( this );
        return view;
    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){

            case R.id.emc1:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","emc1" ) );
                break;
            case R.id.emc2:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","emc2" ) );
                break;
            case R.id.emc3:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","emc3" ) );
                break;
            case R.id.emc4:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","emc4" ) );
                break;

        }
    }
}
