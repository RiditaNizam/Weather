package com.example.android.weather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createWeatherMessage(77, "San Francisco");

    }

    private String createWeatherMessage(int temperature, String cityName){
        return "Welcome to " + cityName + " where the temperature is " + temperature + "F.";
    }
}