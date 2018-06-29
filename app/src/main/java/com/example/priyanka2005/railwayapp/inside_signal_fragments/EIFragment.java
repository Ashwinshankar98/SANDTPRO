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

public class EIFragment extends Fragment implements View.OnClickListener {
    private CardView ei1,ei2,ei3,ei4,ei5,ei6;

    public EIFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_signal_ei,container,false );

        ei1 = (CardView)view.findViewById( R.id.ei1 );
        ei1.setOnClickListener( this );
        ei2 = (CardView)view.findViewById( R.id.ei2 );
        ei2.setOnClickListener( this );
        ei3 = (CardView)view.findViewById( R.id.ei3 );
        ei3.setOnClickListener( this );
        ei4 = (CardView)view.findViewById( R.id.ei4 );
        ei4.setOnClickListener( this );
        ei5 = (CardView)view.findViewById( R.id.ei5 );
        ei5.setOnClickListener( this );
        ei6 = (CardView)view.findViewById( R.id.ei6 );
        ei6.setOnClickListener( this );
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ei1:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","ei1" ));
                break;
            case R.id.ei2:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","ei2" ));
                break;
            case R.id.ei3:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","ei3" ));
                break;
            case R.id.ei4:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","ei4" ));
                break;
            case R.id.ei5:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","ei5" ));
                break;
            case R.id.ei6:
                startActivity( new Intent( getContext(), InsideSignalList.class ).putExtra( "reference","ei6" ));
                break;
        }
    }
}
