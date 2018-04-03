package com.example.pondibrian.ukulimaiq;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ClimateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_climate);

        DownloadTask task = new DownloadTask();

        task.execute("http://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=c908487c4f3bc9ee3802b490411e80ab");
    }
}
