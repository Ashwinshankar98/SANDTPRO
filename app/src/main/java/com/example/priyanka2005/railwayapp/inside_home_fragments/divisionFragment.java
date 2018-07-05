package com.example.priyanka2005.railwayapp.inside_home_fragments;

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
import com.example.priyanka2005.railwayapp.listview_activities.InsideHomeList;

public class divisionFragment extends Fragment implements View.OnClickListener {

    private CardView div1,div2,div3,div5,div4,div6;
    public divisionFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_home_division,container,false );

        div1 = (CardView)view.findViewById( R.id.chennai );
        div1.setOnClickListener( this );
        div2 = (CardView)view.findViewById( R.id.salem );
        div2.setOnClickListener( this );
        div3 = (CardView)view.findViewById( R.id.trichy );
        div3.setOnClickListener( this );
        div4 = (CardView)view.findViewById( R.id.madurai );
        div4.setOnClickListener( this );
        div5 = (CardView)view.findViewById( R.id.tvc );
        div5.setOnClickListener( this );
        div6 = (CardView)view.findViewById( R.id.palakkad );
        div6.setOnClickListener( this );
        return view;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.chennai:
                startActivity( new Intent( getContext(), InsideHomeList.class ).putExtra( "reference","division1" ) );
                break;
            case R.id.salem:
                startActivity( new Intent( getContext(), InsideHomeList.class ).putExtra( "reference","division2" ) );
                break;
            case R.id.trichy:
                startActivity( new Intent( getContext(), InsideHomeList.class ).putExtra( "reference","division3" ) );
                break;
            case R.id.madurai:
                startActivity( new Intent( getContext(), InsideHomeList.class ).putExtra( "reference","division4" ) );
                break;
            case R.id.tvc:
                startActivity( new Intent( getContext(), InsideHomeList.class ).putExtra( "reference","division5" ) );
                break;
            case R.id.palakkad:
                startActivity( new Intent( getContext(), InsideHomeList.class ).putExtra( "reference","division6" ) );
                break;
        }

    }
}
