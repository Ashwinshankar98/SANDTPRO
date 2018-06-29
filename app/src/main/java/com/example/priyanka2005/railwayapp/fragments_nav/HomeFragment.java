package com.example.priyanka2005.railwayapp.fragments_nav;

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
import com.example.priyanka2005.railwayapp.inside_activities.InsideHome;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private CardView principalcste,divisons,stdf,stnl,workshop,cons;


    public HomeFragment() {


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home,container,false);

        principalcste = (CardView)view.findViewById( R.id.principalcsteCardView );
        divisons = (CardView)view.findViewById( R.id.divisonsCardView );
        stdf = (CardView)view.findViewById( R.id.stdfCardView );
        stnl = (CardView)view.findViewById( R.id.stnlCardView );
        workshop = (CardView)view.findViewById( R.id.workshopCardView );
        cons = (CardView)view.findViewById( R.id.consCardView );

        principalcste.setOnClickListener( this );
        divisons.setOnClickListener( this );
        stdf.setOnClickListener( this );
        stnl.setOnClickListener( this );
        workshop.setOnClickListener( this );
        cons.setOnClickListener( this );


        return view;
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.principalcsteCardView:
                startActivity( new Intent( getContext(), InsideHome.class ).putExtra( "reference","principal" ) );
                break;
            case R.id.divisonsCardView :
                startActivity( new Intent( getContext(), InsideHome.class ).putExtra( "reference","infra" ));
                break;
            case R.id.stdfCardView:
                startActivity( new Intent( getContext(), InsideHome.class ).putExtra( "reference","faculty" ) );
                break;
            case R.id.stnlCardView :
                startActivity( new Intent( getContext(), InsideHome.class ).putExtra( "reference","courses" ) );
                break;
            case R.id.workshopCardView:
                startActivity( new Intent( getContext(), InsideHome.class ).putExtra( "reference","history" ) );
                break;
            case R.id.consCardView :
                startActivity( new Intent( getContext(), InsideHome.class ).putExtra( "reference","aboutus" ) );
                break;
        }


    }
}
