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

public class PoliciesFragment extends Fragment implements View.OnClickListener {

    private CardView pol1,pol2,pol3,pol4,pol5,pol6,pol7,pol8,pol9,pol10;

    public PoliciesFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_signal_policies,container,false );
        pol1 = (CardView)view.findViewById( R.id.pol1 );
        pol1.setOnClickListener( this );
        pol2 = (CardView)view.findViewById( R.id.pol2 );
        pol2.setOnClickListener( this );
        pol3 = (CardView)view.findViewById( R.id.pol3 );
        pol3.setOnClickListener( this );
        pol4 = (CardView)view.findViewById( R.id.pol4 );
        pol4.setOnClickListener( this );
        pol5 = (CardView)view.findViewById( R.id.pol5 );
        pol5.setOnClickListener( this );
        pol6 = (CardView)view.findViewById( R.id.pol6 );
        pol6.setOnClickListener( this );
        pol7 = (CardView)view.findViewById( R.id.pol7 );
        pol7.setOnClickListener( this );
        pol8 = (CardView)view.findViewById( R.id.pol8 );
        pol8.setOnClickListener( this );
        pol9 = (CardView)view.findViewById( R.id.pol9 );
        pol9.setOnClickListener( this );
        pol10 = (CardView)view.findViewById( R.id.pol10 );
        pol10.setOnClickListener( this );
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.pol1:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","pol1" ));
                break;
            case R.id.pol2:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","pol2" ));
                break;
            case R.id.pol3:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","pol3" ));
                break;
            case R.id.pol4:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","pol4" ));
                break;
            case R.id.pol5:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","pol5" ));
                break;
            case R.id.pol6:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","pol6" ));
                break;
            case R.id.pol7:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","pol7" ));
                break;
            case R.id.pol8:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","pol8" ));
                break;
            case R.id.pol9:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","pol9" ));
                break;
            case R.id.pol10:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","pol10" ));
                break;
        }
    }
}
