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

public class VHFFragment extends Fragment implements View.OnClickListener {

    private CardView vhf1;

    public VHFFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_tele_vhf,container,false );

        vhf1 = (CardView)view.findViewById( R.id.vhf1 );
        vhf1.setOnClickListener( this );
        return view;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.vhf1:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","vhf1" ) );
                break;
        }
    }
}
