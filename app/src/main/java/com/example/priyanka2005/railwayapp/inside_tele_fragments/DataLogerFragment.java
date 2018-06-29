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

public class DataLogerFragment extends Fragment implements View.OnClickListener {

    private CardView dl1,dl2,dl3;

    public DataLogerFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_tele_dataloger,container,false );

        dl1=(CardView)view.findViewById( R.id.dl1 );
        dl1.setOnClickListener( this );
        dl2=(CardView)view.findViewById( R.id.dl2 );
        dl2.setOnClickListener( this );
        dl3=(CardView)view.findViewById( R.id.dl3 );
        dl3.setOnClickListener( this );
        return view;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.dl1:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","dl1" ) );
                break;
            case R.id.dl2:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","dl2" ) );
                break;
            case R.id.dl3:
                startActivity( new Intent( getContext(), InsideTeleList.class ).putExtra( "reference","dl3" ) );
                break;
        }
    }
}
