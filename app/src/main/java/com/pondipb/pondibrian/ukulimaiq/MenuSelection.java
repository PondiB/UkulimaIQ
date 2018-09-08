package com.pondipb.pondibrian.ukulimaiq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class   MenuSelection extends AppCompatActivity  implements View.OnClickListener {
    //Buttons Added
    Button btnAgronomy;
    Button btnClimate;
    Button btnMarketPrice;

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
                openClimateActivity();
                break;

            case R.id.btnMarketPrice:
                // intent Method call
                openPriceActivity();

                break;


            default:
                break;

        }

    }

    private void openClimateActivity() {
        Intent intent = new Intent(this, ClimateActivity.class);
        startActivity(intent);
    }

    private void openAgronomyActivity() {
        Intent intent = new Intent(this, AgronomyActivity.class);
        startActivity(intent);
    }

    private void openPriceActivity() {
        Intent intent = new Intent(this, PriceActivity.class);
        startActivity(intent);
    }
    //Method to for Community Map button

}
