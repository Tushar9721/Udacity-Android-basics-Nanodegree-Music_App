package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ArtistActivity extends AppCompatActivity {

    ImageView backButtonArtist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_acitvity);

        //creating views
        backButtonArtist = findViewById(R.id.backButtonArtist);

        //adding onClick listener.
        backButtonArtist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
