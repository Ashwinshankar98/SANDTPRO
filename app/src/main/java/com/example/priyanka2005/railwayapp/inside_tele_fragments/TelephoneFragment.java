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

public class TelephoneFragment extends Fragment implements View.OnClickListener {
    private CardView telephone1,telephone2;

    public TelephoneFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_tele_telephone,container,false );

        telephone1 = (CardView)view.findViewById( R.id.telephone1);
        telephone2 = (CardView)view.findViewById( R.id.telephone2 );

        telephone1.setOnClickListener( this );
        telephone2.setOnClickListener( this );
        return view;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.telephone1:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","telephone1" ) );
                break;
            case R.id.telephone2:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","telephone2" ) );
                break;
        }
    }
}
