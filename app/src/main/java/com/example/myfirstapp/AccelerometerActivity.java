package com.example.myfirstapp;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AccelerometerActivity extends AppCompatActivity implements SensorEventListener {
    private TextView xText;
    private TextView yText;
    private TextView zText;
    private SensorManager mSensorManager;
    private Sensor mAccelerometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accelerometer);

        mSensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        xText = findViewById(R.id.x_axis);
        yText = findViewById(R.id.y_axis);
        zText = findViewById(R.id.z_axis);
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
            xText.setText("" + sensorEvent.values[0]);
            yText.setText("" + sensorEvent.values[1]);
            zText.setText("" + sensorEvent.values[2]);
    }

    protected void onResume() {
        super.onResume();
        mSensorManager.registerListener(this, mAccelerometer, SensorManager.SENSOR_DELAY_NORMAL);
    }

    protected void onPause() {
        super.onPause();
        mSensorManager.unregisterListener(this);
    }




    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {
        //används inte
    }
}
