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
import com.example.priyanka2005.railwayapp.inside_activities.InsideGen;

public class GeneralFragment extends Fragment implements View.OnClickListener {

    private CardView rules,earthing,leave,budget,wp,rajbhasa,ps,pension,relations,setup,welfare,wca,conduct,seniority,hoer,dar,computer,spd,stores,ministries;
    public GeneralFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_general,container,false);

        rules = (CardView)view.findViewById( R.id.rules );
        earthing = (CardView)view.findViewById( R.id.earthing );
        leave = (CardView)view.findViewById( R.id.leave );
        budget = (CardView)view.findViewById( R.id.budget );
        wp = (CardView)view.findViewById( R.id.wp );
        rajbhasa = (CardView)view.findViewById( R.id.rajbhasa );
        ps = (CardView)view.findViewById( R.id.ps );
        pension = (CardView)view.findViewById( R.id.pension );
        relations = (CardView)view.findViewById( R.id.relations );
        setup = (CardView)view.findViewById( R.id.setup );
        welfare = (CardView)view.findViewById( R.id.welfare );
        wca = (CardView)view.findViewById( R.id.wca );
        conduct = (CardView)view.findViewById( R.id.conduct );
        seniority = (CardView)view.findViewById( R.id.seniority );
        hoer = (CardView)view.findViewById( R.id.hoer );
        dar = (CardView)view.findViewById( R.id.dar );

        stores = (CardView)view.findViewById( R.id.stores );
        ministries = (CardView)view.findViewById( R.id.ministries );


        rules.setOnClickListener( this );
        earthing.setOnClickListener( this );
        leave.setOnClickListener( this );
        budget.setOnClickListener( this );
        wp.setOnClickListener( this );
        rajbhasa.setOnClickListener( this );
        ps.setOnClickListener( this );
        pension.setOnClickListener( this );
        relations.setOnClickListener( this );
        setup.setOnClickListener( this );
        welfare.setOnClickListener( this );
        wca.setOnClickListener( this );
        conduct.setOnClickListener( this );
        seniority.setOnClickListener( this );
        hoer.setOnClickListener( this );
        dar.setOnClickListener( this );
       
        stores.setOnClickListener( this );
        ministries.setOnClickListener( this );


        return view;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.rules:
                startActivity( new Intent( getContext(), InsideGen.class ).putExtra( "reference","rules" ) );
                break;
            case R.id.earthing:
                startActivity( new Intent( getContext(), InsideGen.class ).putExtra( "reference","earthing" ) );
                break;
            case R.id.leave:
                startActivity( new Intent( getContext(), InsideGen.class ).putExtra( "reference","leave" ) );
                break;
            case R.id.budget:
                startActivity( new Intent( getContext(), InsideGen.class ).putExtra( "reference","budget" ) );
                break;
            case R.id.wp:
                startActivity( new Intent( getContext(), InsideGen.class ).putExtra( "reference","wp" ) );
                break;
            case R.id.rajbhasa:
                startActivity( new Intent( getContext(), InsideGen.class ).putExtra( "reference","rajbhasa" ) );
                break;
            case R.id.ps:
                startActivity( new Intent( getContext(), InsideGen.class ).putExtra( "reference","ps" ) );
                break;
            case R.id.pension:
                startActivity( new Intent( getContext(), InsideGen.class ).putExtra( "reference","pension" ) );
                break;
            case R.id.relations:
                startActivity( new Intent( getContext(), InsideGen.class ).putExtra( "reference","relations" ) );
                break;
            case R.id.setup:
                startActivity( new Intent( getContext(), InsideGen.class ).putExtra( "reference","setup" ) );
                break;
            case R.id.welfare:
                startActivity( new Intent( getContext(), InsideGen.class ).putExtra( "reference","welfare" ) );
                break;
            case R.id.wca:
                startActivity( new Intent( getContext(), InsideGen.class ).putExtra( "reference","wca" ) );
                break;
            case R.id.conduct:
                startActivity( new Intent( getContext(), InsideGen.class ).putExtra( "reference","conduct" ) );
                break;
            case R.id.seniority:
                startActivity( new Intent( getContext(), InsideGen.class ).putExtra( "reference","seniority" ) );
                break;
            case R.id.hoer:
                startActivity( new Intent( getContext(), InsideGen.class ).putExtra( "reference","hoer" ) );
                break;
            case R.id.dar:
                startActivity( new Intent( getContext(), InsideGen.class ).putExtra( "reference","dar" ) );
                break;

            case R.id.stores:
                startActivity( new Intent( getContext(), InsideGen.class ).putExtra( "reference","stores" ) );
                break;
            case R.id.ministries:
                startActivity( new Intent( getContext(), InsideGen.class ).putExtra( "reference","ministries" ) );
                break;

        }

    }
}
