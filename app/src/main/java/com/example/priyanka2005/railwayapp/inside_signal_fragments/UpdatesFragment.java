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

public class UpdatesFragment extends Fragment implements View.OnClickListener {
    private CardView up1,up2,up3,up4,up5,up6,up7;

    public UpdatesFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_signal_updates,container,false );
        up1 = (CardView)view.findViewById( R.id.up1 );
        up1.setOnClickListener( this );
        up2 = (CardView)view.findViewById( R.id.up2 );
        up2.setOnClickListener( this );
        up3 = (CardView)view.findViewById( R.id.up3 );
        up3.setOnClickListener( this );
        up4 = (CardView)view.findViewById( R.id.up4 );
        up4.setOnClickListener( this );
        up5 = (CardView)view.findViewById( R.id.up5 );
        up5.setOnClickListener( this );
        up6 = (CardView)view.findViewById( R.id.up6 );
        up6.setOnClickListener( this );
        up7 = (CardView)view.findViewById( R.id.up7 );
        up7.setOnClickListener( this );
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.up1:
                startActivity( new Intent(getContext(), InsideSignalList.class ).putExtra( "reference","up1" ) );
                break;
            case R.id.up2:
                startActivity( new Intent(getContext(), InsideSignalList.class ).putExtra( "reference","up2" ) );
                break;
            case R.id.up3:
                startActivity( new Intent(getContext(), InsideSignalList.class ).putExtra( "reference","up3" ) );
                break;
            case R.id.up4:
                startActivity( new Intent(getContext(), InsideSignalList.class ).putExtra( "reference","up4" ) );
                break;
            case R.id.up5:
                startActivity( new Intent(getContext(), InsideSignalList.class ).putExtra( "reference","up5" ) );
                break;
            case R.id.up6:
                startActivity( new Intent(getContext(), InsideSignalList.class ).putExtra( "reference","up6" ) );
                break;
            case R.id.up7:
                startActivity( new Intent(getContext(), InsideSignalList.class ).putExtra( "reference","up7" ) );
                break;

        }
    }
}
