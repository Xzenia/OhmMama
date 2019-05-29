package com.treskie.conrad.ohm_mama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.treskie.conrad.ohm_mama.Bands.FiveBands;
import com.treskie.conrad.ohm_mama.Bands.FourBands;
import com.treskie.conrad.ohm_mama.Bands.SixBands;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fourBandsSelected(View v){
        Intent goToFourBands = new Intent(this, FourBands.class);
        startActivity(goToFourBands);
    }

    public void fiveBandsSelected(View v){
        Intent goToFiveBands = new Intent(this, FiveBands.class);
        startActivity(goToFiveBands);
    }

    public void sixBandsSelected(View v){
        Intent goToSixBands = new Intent(this, SixBands.class);
        startActivity(goToSixBands);
    }
}
