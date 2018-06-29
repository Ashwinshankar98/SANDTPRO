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

public class ExchangeFragment extends Fragment implements View.OnClickListener {

    private CardView ex1,ex2,ex3,ex4;

    public ExchangeFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_tele_exchange,container,false );

        ex1 = (CardView)view.findViewById( R.id.ex1 );
        ex1.setOnClickListener( this );
        ex2 = (CardView)view.findViewById( R.id.ex2 );
        ex2.setOnClickListener( this );
        ex3 = (CardView)view.findViewById( R.id.ex3 );
        ex3.setOnClickListener( this );
        ex4 = (CardView)view.findViewById( R.id.ex4 );
        ex4.setOnClickListener( this );

        return view;
    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){
            case R.id.ex1:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","ex1" ));
                break;
            case R.id.ex2:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","ex2" ));
                break;
            case R.id.ex3:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","ex3" ));
                break;
            case R.id.ex4:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","ex4" ));
                break;
        }
    }
}
