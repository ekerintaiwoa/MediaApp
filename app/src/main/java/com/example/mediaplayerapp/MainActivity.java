package com.example.mediaplayerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    SeekBar seekBar;
    ImageButton btnplay, btnpause,btnstop, btnrewind,btnforward;
    MainActivityListener mainActivityListener ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.seekBar);
        btnforward = findViewById(R.id.btnforward);
        btnplay = findViewById(R.id.btnplay);
        btnstop = findViewById(R.id.btnstop);
        btnrewind = findViewById(R.id.btnrewind);
        btnpause = findViewById(R.id.btnpause);
        mainActivityListener =  new MainActivityListener(this);


        btnplay.setOnClickListener(mainActivityListener);
        btnstop.setOnClickListener(mainActivityListener);
        btnrewind.setOnClickListener(mainActivityListener);
        btnforward.setOnClickListener(mainActivityListener);
        btnpause.setOnClickListener(mainActivityListener);
        btnforward.setOnClickListener(mainActivityListener);

    }
}