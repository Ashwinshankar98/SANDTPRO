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

public class LeaveFragment extends Fragment implements View.OnClickListener {
    private CardView leave1,leave2,leave3,leave4,leave5,leave6,leave7,leave8,leave9;
    public LeaveFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_gen_leave,container,false );

        leave1 = (CardView)view.findViewById( R.id.leave1 );
        leave2 = (CardView)view.findViewById( R.id.leave2 );
        leave3 = (CardView)view.findViewById( R.id.leave3 );
        leave4 = (CardView)view.findViewById( R.id.leave4 );
        leave5 = (CardView)view.findViewById( R.id.leave5 );
        leave6 = (CardView)view.findViewById( R.id.leave6 );
        leave7 = (CardView)view.findViewById( R.id.leave7 );
        leave8 = (CardView)view.findViewById( R.id.leave8 );
        leave9 = (CardView)view.findViewById( R.id.leave9 );

        leave1.setOnClickListener( this );
        leave2.setOnClickListener( this );
        leave3.setOnClickListener( this );
        leave4.setOnClickListener( this );
        leave5.setOnClickListener( this );
        leave6.setOnClickListener( this );
        leave7.setOnClickListener( this );
        leave8.setOnClickListener( this );
        leave9.setOnClickListener( this );

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.leave1:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","leave1" ) );
                break;
            case R.id.leave2:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","leave2" ) );
                break;
            case R.id.leave3:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","leave3" ) );
                break;
            case R.id.leave4:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","leave4" ) );
                break;
            case R.id.leave5:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","leave5" ) );
                break;
            case R.id.leave6:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","leave6" ) );
                break;
            case R.id.leave7:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","leave7" ) );
                break;
            case R.id.leave8:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","leave8" ) );
                break;
            case R.id.leave9:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","leave9" ) );
                break;
        }
    }
}
