package com.example.priyanka2005.railwayapp.activities;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.priyanka2005.railwayapp.R;
import com.example.priyanka2005.railwayapp.admin_activities.AdminActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    private Button loginButton;
    private EditText usernameEditText,passwordEditText;
    private ProgressBar progressBar;

    private FirebaseAuth mAuth;

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseUser currUser = mAuth.getCurrentUser();

        if(currUser!=null){
            startActivity( new Intent( getApplicationContext(),AdminActivity.class ) );
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();
        loginButton = (Button)findViewById(R.id.loginButton);
        usernameEditText = (EditText)findViewById( R.id.usernameEditText );
        passwordEditText = (EditText)findViewById( R.id.passwordEditText );
        progressBar = (ProgressBar)findViewById( R.id.progressBar );
        progressBar.setVisibility( View.INVISIBLE );

        loginButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.loginButton:
                userlogin();
                break;
        }
    }

    private void userlogin() {

        String username = usernameEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();

        if(username.isEmpty()){
            usernameEditText.setError( " Username Required" );
            usernameEditText.requestFocus();
            return;
        }

        if(!Patterns.EMAIL_ADDRESS.matcher( username ).matches()){
            usernameEditText.setError( "Enter a valid Username" );
            usernameEditText.requestFocus();
            return;
        }

        if(password.isEmpty()){
            passwordEditText.setError( " password Required" );
            passwordEditText.requestFocus();
            return;
        }

        if(password.length()<6){
            passwordEditText.setError( "Minimum length of password is 6" );
            passwordEditText.requestFocus();
            return;
        }

        progressBar.setVisibility( View.VISIBLE );
        mAuth.signInWithEmailAndPassword( username,password  ).addOnCompleteListener( new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                progressBar.setVisibility( View.GONE );
                if(task.isSuccessful()){
                    Intent i = new Intent( getApplicationContext(),AdminActivity.class );
                    i.setFlags( Intent.FLAG_ACTIVITY_CLEAR_TOP );
                    startActivity( i );
                    finish();
                }
                else{
                    Toast.makeText( LoginActivity.this, "error!!", Toast.LENGTH_SHORT ).show();
                }
            }
        } );

    }
}
