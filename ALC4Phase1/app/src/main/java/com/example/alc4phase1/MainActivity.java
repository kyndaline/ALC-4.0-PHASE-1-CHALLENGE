package com.example.alc4phase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: started");

        Button mAbout = findViewById(R.id.btn_about);
        Button mProfile = findViewById(R.id.btn_profile);

        mAbout.setOnClickListener(this);
        mProfile.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_about){
            Log.d(TAG, "onClick: About button has been clicked");

            Intent intent = new Intent(MainActivity.this, About.class);
            startActivity(intent);
        }
        else {
            Log.d(TAG, "onClick: Profile button has been clicked");
            Intent intents = new Intent(MainActivity.this, Profile.class);
            startActivity(intents);
        }
    }
}
