package com.example.priyanka2005.railwayapp.inside_tc_fragments;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.priyanka2005.railwayapp.R;
import com.example.priyanka2005.railwayapp.trainee_activities.TraineePortalCirculars;
import com.example.priyanka2005.railwayapp.trainee_activities.TraineePortalRegister;

public class PortalFragment extends Fragment implements View.OnClickListener {
    private CardView reg, cir;

    public PortalFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.inside_tc_portal, container, false);

        reg = (CardView)view.findViewById( R.id.regCardView );
        reg.setOnClickListener( this );
        cir = (CardView)view.findViewById( R.id.circularsCardView );
        cir.setOnClickListener( this );


        return view;
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.regCardView:
                startActivity( new Intent( getContext(), TraineePortalRegister.class ) );
                break;
            case R.id.circularsCardView:
                startActivity( new Intent( getContext(), TraineePortalCirculars.class ) );
                break;
        }
    }
}
