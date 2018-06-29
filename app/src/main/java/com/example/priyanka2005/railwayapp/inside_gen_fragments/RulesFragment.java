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

public class RulesFragment extends Fragment implements View.OnClickListener {

    CardView one,two,three,four,five;
    public RulesFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_gen_rules,container,false );

        one = (CardView)view.findViewById( R.id.oneRulesCardView);
        two = (CardView)view.findViewById( R.id.twoRulesCardView);
        three = (CardView)view.findViewById( R.id.threeRulesCardView);
        four = (CardView)view.findViewById( R.id.fourRulseCardView);
        five = (CardView)view.findViewById( R.id.fiveRulesCardView);


        one.setOnClickListener( this );
        two.setOnClickListener( this );
        three.setOnClickListener( this );
        four.setOnClickListener( this );
        five.setOnClickListener( this );

        return view;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.oneRulesCardView:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","rules1" ) );
                break;
            case R.id.twoRulesCardView:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","rules2" ) );
                break;
            case R.id.threeRulesCardView:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","rules3" ) );
                break;
            case R.id.fourRulseCardView:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","rules4" ) );
                break;
            case R.id.fiveRulesCardView:
                startActivity( new Intent( getContext(), InsideGenList.class ).putExtra( "reference","rules5" ) );
                break;
        }

    }
}
