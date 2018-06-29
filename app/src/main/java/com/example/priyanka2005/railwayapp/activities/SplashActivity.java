package com.example.priyanka2005.railwayapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.priyanka2005.railwayapp.R;
import com.example.priyanka2005.railwayapp.activities.LoginActivity;

public class SplashActivity extends AppCompatActivity {

    ImageView splashImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashImageView = (ImageView)findViewById(R.id.splashImageView);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.myanimation);

        splashImageView.setAnimation(animation);

        final Intent i = new Intent(this,HomeActivity.class);

        Thread timer = new Thread(){

            public void run(){
                try{

                    sleep(2500);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();


    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}
