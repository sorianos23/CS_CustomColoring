/*
@ Bryan Soriano
 */

package com.example.coloringbook;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.SeekBar;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        ColoringPage cPage = findViewById(R.id.pageview);
        PageController pController = new PageController(cPage);

        //Seekbar rbar = findViewById(R.id.redSeekBar);
        //rbar.setOnSeekBarChangeListener(PageController);


    }
}