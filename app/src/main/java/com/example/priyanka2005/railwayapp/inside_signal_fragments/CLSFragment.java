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

public class CLSFragment extends Fragment implements View.OnClickListener {
    private CardView cls1,cls2,cls3,cls4,cls5,cls6,cls7,cls8;

    public CLSFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_signal_cls,container,false );
        cls1 = (CardView)view.findViewById( R.id.cls1 );
        cls1.setOnClickListener( this );
        cls2 = (CardView)view.findViewById( R.id.cls2 );
        cls2.setOnClickListener( this );
        cls3 = (CardView)view.findViewById( R.id.cls3 );
        cls3.setOnClickListener( this );
        cls4 = (CardView)view.findViewById( R.id.cls4 );
        cls4.setOnClickListener( this );
        cls5 = (CardView)view.findViewById( R.id.cls5 );
        cls5.setOnClickListener( this );
        cls6 = (CardView)view.findViewById( R.id.cls6 );
        cls6.setOnClickListener( this );
        cls7 = (CardView)view.findViewById( R.id.cls7 );
        cls7.setOnClickListener( this );
        cls8 = (CardView)view.findViewById( R.id.cls8 );
        cls8.setOnClickListener( this );

        return view;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.cls1:
                startActivity( new Intent( getContext(), InsideSignalList.class).putExtra( "reference","cls1" ) );
                break;
            case R.id.cls2:
                startActivity( new Intent( getContext(), InsideSignalList.class).putExtra( "reference","cls2" ) );
                break;
            case R.id.cls3:
                startActivity( new Intent( getContext(), InsideSignalList.class).putExtra( "reference","cls3" ) );
                break;
            case R.id.cls4:
                startActivity( new Intent( getContext(), InsideSignalList.class).putExtra( "reference","cls4" ) );
                break;
            case R.id.cls5:
                startActivity( new Intent( getContext(), InsideSignalList.class).putExtra( "reference","cls5" ) );
                break;
            case R.id.cls6:
                startActivity( new Intent( getContext(), InsideSignalList.class).putExtra( "reference","cls6" ) );
                break;
            case R.id.cls7:
                startActivity( new Intent( getContext(), InsideSignalList.class).putExtra( "reference","cls7" ) );
                break;
            case R.id.cls8:
                startActivity( new Intent( getContext(), InsideSignalList.class).putExtra( "reference","cls8" ) );
                break;

        }
    }
}
