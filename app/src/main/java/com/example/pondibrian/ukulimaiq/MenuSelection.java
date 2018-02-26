package com.example.pondibrian.ukulimaiq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuSelection extends AppCompatActivity  implements View.OnClickListener {
    //Buttons Added
    Button btnAgronomy;
    Button btnClimate;
    Button btnMarketPrice;
    Button btnMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_selection);

        btnAgronomy = findViewById(R.id.btnAgronomy);
        btnAgronomy.setOnClickListener(this);// calling onClick() method
        btnClimate = findViewById(R.id.btnClimate);
        btnClimate.setOnClickListener(this);
        btnMarketPrice = findViewById(R.id.btnMarketPrice);
        btnMarketPrice.setOnClickListener(this);
        btnMap = findViewById(R.id.btnMap);
        btnMap.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {


        switch (view.getId()) {

            case R.id.btnAgronomy:
                // intent method call.
                openAgronomyActivity();
                break;

            case R.id.btnClimate:
                // intent method call
                break;

            case R.id.btnMarketPrice:
                // intent Method call

                break;

            case R.id.btnMap:
                // To open Map Activity
                openMapActivity();// Call method to open Map activity page
                break;

            default:
                break;

        }

    }

    private void openAgronomyActivity() {
        Intent intent = new Intent(this, AgronomyActivity.class);
        startActivity(intent);
    }

    //Method to for Community Map button
    private void openMapActivity() {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
}
