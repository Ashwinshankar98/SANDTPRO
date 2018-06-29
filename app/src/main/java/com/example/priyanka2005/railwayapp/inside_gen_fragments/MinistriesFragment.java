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

public class MinistriesFragment extends Fragment implements View.OnClickListener {
    private CardView ministries1;
    public MinistriesFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_gen_ministries,container,false );
        ministries1 = (CardView)view.findViewById( R.id.ministries1 );
        ministries1.setOnClickListener( this );
        return view;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.ministries1:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","ministries1" ) );
                break;

        }
    }
}
