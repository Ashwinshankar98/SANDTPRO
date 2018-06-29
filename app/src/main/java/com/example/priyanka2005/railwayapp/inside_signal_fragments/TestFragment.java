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

public class TestFragment extends Fragment implements View.OnClickListener {

    private CardView test1,test2,test3,test4;

    public TestFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_signal_test,container,false );
        test1 = (CardView)view.findViewById( R.id.test1 );
        test1.setOnClickListener( this );
        test2 = (CardView)view.findViewById( R.id.test2 );
        test2.setOnClickListener( this );
        test3 = (CardView)view.findViewById( R.id.test3 );
        test3.setOnClickListener( this );
        test4 = (CardView)view.findViewById( R.id.test4 );
        test4.setOnClickListener( this );
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.test1:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","test1" ) );
                break;
            case R.id.test2:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","test2" ) );
                break;
            case R.id.test3:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","test3" ) );
                break;
            case R.id.test4:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","test4" ) );
                break;
        }
    }
}
