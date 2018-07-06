package com.example.priyanka2005.railwayapp.activities;


import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;

import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;




import com.example.priyanka2005.railwayapp.R;
import com.example.priyanka2005.railwayapp.fragments_nav.GeneralFragment;
import com.example.priyanka2005.railwayapp.fragments_nav.HomeFragment;
import com.example.priyanka2005.railwayapp.fragments_nav.NtesFragment;
import com.example.priyanka2005.railwayapp.fragments_nav.SignalFragment;
import com.example.priyanka2005.railwayapp.fragments_nav.TcFragment;
import com.example.priyanka2005.railwayapp.fragments_nav.TelecomFragment;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;


public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {


    private ImageView icon;
    private Fragment mFragmentToSet = null;
    private DrawerLayout drawerLayout;
    private CollapsingToolbarLayout collapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        collapsingToolbarLayout = findViewById(R.id.collapsingToolbar);
        Toolbar toolbar = findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );

        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout, toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();

        View header = navigationView.getHeaderView(0);
        icon = (ImageView)header.findViewById( R.id.iconImageview );
        icon.setOnClickListener( this );

        drawerLayout.addDrawerListener( new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

            }

            @Override
            public void onDrawerOpened(@NonNull View drawerView) {

            }

            @Override
            public void onDrawerClosed(@NonNull View drawerView) {



                if(mFragmentToSet != null){
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace( R.id.fragment_container,mFragmentToSet )
                            .commit();
                    mFragmentToSet = null;
                }
            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        } );
        if(savedInstanceState==null){

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HomeFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_home);
        }

        Calendar calendar = Calendar.getInstance();

        calendar.set( Calendar.HOUR_OF_DAY,21 );
        calendar.set( Calendar.MINUTE,30);
        calendar.set( Calendar.SECOND,0);
        Intent intent = new Intent( getApplicationContext(),Notification_reciever.class );

        PendingIntent pendingIntent = PendingIntent.getBroadcast(getApplicationContext(),100,intent,PendingIntent.FLAG_UPDATE_CURRENT  );
        AlarmManager alarmManager = (AlarmManager)getSystemService( ALARM_SERVICE );
        alarmManager.setRepeating( AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),AlarmManager.INTERVAL_DAY,pendingIntent );



    }

    @Override
    public void onBackPressed() {

        if(drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawer(GravityCompat.START);
        }else{

         super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull final MenuItem item) {

        switch (item.getItemId()) {

            case R.id.nav_home:
                collapsingToolbarLayout.setTitle( "Home" );
                //getSupportFragmentManager().beginTransaction().replace( R.id.fragment_container, new HomeFragment() ).commit();
                mFragmentToSet = new HomeFragment();
                break;

            case R.id.nav_signal:
                collapsingToolbarLayout.setTitle( "Signal" );
                //getSupportFragmentManager().beginTransaction().replace( R.id.fragment_container, new SignalFragment() ).commit();
                mFragmentToSet = new SignalFragment();
                break;
            case R.id.nav_telecom:
                collapsingToolbarLayout.setTitle( "Telecommunication" );
                //getSupportFragmentManager().beginTransaction().replace( R.id.fragment_container, new TelecomFragment() ).commit();
                mFragmentToSet = new TelecomFragment();
                break;
            case R.id.nav_ntes:
                collapsingToolbarLayout.setTitle( "Train Enquiry" );
                // getSupportFragmentManager().beginTransaction().replace( R.id.fragment_container, new NtesFragment() ).commit();
                mFragmentToSet = new NtesFragment();
                break;
            case R.id.nav_tc:
                collapsingToolbarLayout.setTitle( "Training Center" );
                //getSupportFragmentManager().beginTransaction().replace( R.id.fragment_container, new TcFragment() ).commit();
                mFragmentToSet = new TcFragment();
                break;
            case R.id.nav_general:
                collapsingToolbarLayout.setTitle( "General" );
                //getSupportFragmentManager().beginTransaction().replace( R.id.fragment_container, new GeneralFragment() ).commit();
                mFragmentToSet = new GeneralFragment();
                break;
            case R.id.nav_about:
                startActivity( new Intent( getApplicationContext(), AboutusActivity.class ) );
                break;
            case R.id.nav_send:
                Intent shareIntent = new Intent( android.content.Intent.ACTION_SEND );
                shareIntent.setType( "*/*" );
                shareIntent.addFlags( Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET );
                Uri uri = Uri.parse( "/data/apps/" + getApplicationContext().getPackageName() + ".apk" );
                shareIntent.putExtra( Intent.EXTRA_STREAM, uri );
                startActivity( Intent.createChooser( shareIntent, "Share via" ) );
                break;
        }


     drawerLayout.closeDrawer(GravityCompat.START);
     return true;
    }



    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.iconImageview:
                startActivity( new Intent( getApplicationContext(),IndianRailwaysActivity.class ) );
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
