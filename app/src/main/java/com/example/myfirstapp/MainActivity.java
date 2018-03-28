package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the accelerometer button */
    public void accelerometerButton(View view) {
      Intent intent = new Intent(this, AccelerometerActivity.class);
      startActivity(intent);
    }

    /** Called when the user taps the compass button */
    public void compassButton(View view){

    }



}
