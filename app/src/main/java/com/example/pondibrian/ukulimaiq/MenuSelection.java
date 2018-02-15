package com.example.pondibrian.ukulimaiq;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuSelection extends AppCompatActivity  implements View.OnClickListener {
    //Buttons Added
    Button button2;
    Button button3;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_selection);

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);// calling onClick() method
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.button2:
                // code for button when user clicks buttonOne.
                break;

            case R.id.button3:
                // intent code
                break;

            case R.id.button4:
                // intent code
                break;

            default:
                break;

        }

    }
}
