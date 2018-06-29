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

public class SetupFragment extends Fragment implements View.OnClickListener {
    private CardView setup1,setup2,setup3,setup4,setup5,setup6,setup7,setup8,setup9,setup10,setup11,setup12,setup13,setup14;
    public SetupFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_gen_setup,container,false );
        setup1 = (CardView)view.findViewById( R.id.setup1 );
        setup1.setOnClickListener( this );
        setup2 = (CardView)view.findViewById( R.id.setup2 );
        setup2.setOnClickListener( this );
        setup3 = (CardView)view.findViewById( R.id.setup3 );
        setup3.setOnClickListener( this );
        setup4 = (CardView)view.findViewById( R.id.setup4 );
        setup4.setOnClickListener( this );
        setup5 = (CardView)view.findViewById( R.id.setup5 );
        setup5.setOnClickListener( this );
        setup6 = (CardView)view.findViewById( R.id.setup6 );
        setup6.setOnClickListener( this );
        setup7 = (CardView)view.findViewById( R.id.setup7 );
        setup7.setOnClickListener( this );
        setup8 = (CardView)view.findViewById( R.id.setup8 );
        setup8.setOnClickListener( this );
        setup9 = (CardView)view.findViewById( R.id.setup9 );
        setup9.setOnClickListener( this );
        setup10 = (CardView)view.findViewById( R.id.setup10 );
        setup10.setOnClickListener( this );
        setup11 = (CardView)view.findViewById( R.id.setup11);
        setup11.setOnClickListener( this );
        setup12 = (CardView)view.findViewById( R.id.setup12);
        setup12.setOnClickListener( this );
        setup13 = (CardView)view.findViewById( R.id.setup13);
        setup13.setOnClickListener( this );
        setup14 = (CardView)view.findViewById( R.id.setup14 );
        setup14.setOnClickListener( this );



        return view;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.setup1:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","setup1" ) );
                break;
            case R.id.setup2:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","setup2" ) );
                break;
            case R.id.setup3:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","setup3" ) );
                break;
            case R.id.setup4:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","setup4" ) );
                break;
            case R.id.setup5:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","setup5" ) );
                break;
            case R.id.setup6:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","setup6" ) );
                break;
            case R.id.setup7:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","setup7" ) );
                break;
            case R.id.setup8:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","setup8" ) );
                break;
            case R.id.setup9:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","setup9" ) );
                break;
            case R.id.setup10:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","setup10" ) );
                break;
            case R.id.setup11:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","setup11" ) );
                break;
            case R.id.setup12:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","setup12" ) );
                break;
            case R.id.setup13:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","setup13" ) );
                break;
            case R.id.setup14:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","setup14" ) );
                break;

        }
    }
}
