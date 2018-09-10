package com.pondipb.pondibrian.ukulimaiq;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.Vector;

public class AgronomyActivity extends AppCompatActivity {
    //Recycler view field
    RecyclerView recyclerView;

    //Vector for videos URL
    Vector<YoutubeVideo>youtubeVideos = new Vector<YoutubeVideo>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agronomy);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Load video list
        youtubeVideos.add(new YoutubeVideo());
        youtubeVideos.add(new YoutubeVideo());
        youtubeVideos.add(new YoutubeVideo());
        youtubeVideos.add(new YoutubeVideo());
        youtubeVideos.add(new YoutubeVideo());

        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideos);

        recyclerView.setAdapter(videoAdapter);
    }

}
