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
import com.example.priyanka2005.railwayapp.activities.GalleryActivity;
import com.example.priyanka2005.railwayapp.activities.LoginActivity;
import com.example.priyanka2005.railwayapp.inside_activities.InsideTc;

public class TcFragment extends Fragment implements View.OnClickListener {

    private CardView principal,portal,infrastructure,faculty,courses,history,aboutus,admin,gallery;


    public TcFragment() {


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tc,container,false);

        principal = (CardView)view.findViewById( R.id.principalCardView );
        infrastructure = (CardView)view.findViewById( R.id.infrastructureCardView );
        faculty = (CardView)view.findViewById( R.id.facultyCardView );
        courses = (CardView)view.findViewById( R.id.coursesCardView );
        history = (CardView)view.findViewById( R.id.historyCardView );
        aboutus = (CardView)view.findViewById( R.id.aboutusCardView );
        admin = (CardView)view.findViewById( R.id.adminCardView );
        gallery = (CardView)view.findViewById( R.id.galleryCardView );
        portal = (CardView)view.findViewById( R.id.portalCardView );


        portal.setOnClickListener( this );
        admin.setOnClickListener( this );
        gallery.setOnClickListener( this );
        principal.setOnClickListener( this );
        infrastructure.setOnClickListener( this );
        faculty.setOnClickListener( this );
        courses.setOnClickListener( this );
        history.setOnClickListener( this );
        aboutus.setOnClickListener( this );


        return view;
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.adminCardView:
                startActivity( new Intent( getContext(), LoginActivity.class ) );
                break;
            case R.id.galleryCardView:
                startActivity( new Intent( getContext(), GalleryActivity.class ) );
                break;
            case R.id.portalCardView:
                startActivity( new Intent( getContext(), InsideTc.class ).putExtra( "reference","portal" ) );
                break;
            case R.id.principalCardView:
                startActivity( new Intent( getContext(), InsideTc.class ).putExtra( "reference","principal" ) );
                break;
            case R.id.infrastructureCardView:
                startActivity( new Intent( getContext(), InsideTc.class ).putExtra( "reference","infra" ));
                break;
            case R.id.facultyCardView:
                startActivity( new Intent( getContext(), InsideTc.class ).putExtra( "reference","faculty" ) );
                break;
            case R.id.coursesCardView:
                startActivity( new Intent( getContext(), InsideTc.class ).putExtra( "reference","courses" ) );
                break;
            case R.id.historyCardView:
                startActivity( new Intent( getContext(), InsideTc.class ).putExtra( "reference","history" ) );
                break;
            case R.id.aboutusCardView:
                startActivity( new Intent( getContext(), InsideTc.class ).putExtra( "reference","aboutus" ) );
                break;
        }


    }
}
