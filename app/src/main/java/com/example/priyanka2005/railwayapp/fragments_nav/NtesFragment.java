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
import com.example.priyanka2005.railwayapp.inside_ntes_actvitites.FenqActivity;
import com.example.priyanka2005.railwayapp.inside_ntes_actvitites.PnActivity;
import com.example.priyanka2005.railwayapp.inside_ntes_actvitites.SaActivity;
import com.example.priyanka2005.railwayapp.inside_ntes_actvitites.SytActivity;
import com.example.priyanka2005.railwayapp.inside_ntes_actvitites.TbwsActivity;
import com.example.priyanka2005.railwayapp.inside_ntes_actvitites.TsActivity;

public class NtesFragment extends Fragment implements View.OnClickListener {

    private CardView syt,tbws,sa,ts,fe,pnr;


    public NtesFragment() {


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_ntes,container,false);

        syt = (CardView)view.findViewById( R.id.sytCardView );
        tbws = (CardView)view.findViewById( R.id.tbwsCardView );
        sa = (CardView)view.findViewById( R.id.saCardView );
        ts = (CardView)view.findViewById( R.id.tsCardView );
        fe = (CardView)view.findViewById( R.id.feCardView );
        pnr = (CardView)view.findViewById( R.id.pnrCardView );



        syt.setOnClickListener( this );
        tbws.setOnClickListener( this );
        sa.setOnClickListener( this );
        ts.setOnClickListener( this );
        fe.setOnClickListener( this );
        pnr.setOnClickListener( this );



        return view;
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.sytCardView:
                startActivity( new Intent( getContext(), SytActivity.class ) );
                break;
            case R.id.tbwsCardView:
                startActivity( new Intent( getContext(), TbwsActivity.class ) );
                break;
            case R.id.saCardView:
                startActivity( new Intent( getContext(), SaActivity.class ) );
                break;
            case R.id.tsCardView:
                startActivity( new Intent( getContext(), TsActivity.class ) );
                break;
            case R.id.pnrCardView:
                startActivity( new Intent( getContext(), PnActivity.class ) );
                break;
            case R.id.feCardView:
                startActivity( new Intent( getContext(), FenqActivity.class ) );
                break;

        }


    }
}
