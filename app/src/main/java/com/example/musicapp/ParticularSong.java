package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ParticularSong extends AppCompatActivity {

    ImageView backButtonSingleSong;
    TextView singleSongName;
    LinearLayout playButtons;
    TextView playDuration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_particular_song);

        //creating views
        playDuration = findViewById(R.id.playDuration);
        singleSongName = findViewById(R.id.singleSongName);
        backButtonSingleSong = findViewById(R.id.backButtonSingleSong);
        playButtons = findViewById(R.id.playButtons);

        //calling functions.
        setData();
        setOnclick();

    }

    //setting data to view.
    private void setData() {
        Intent intent = getIntent();
        singleSongName.setText(intent.getStringExtra(getString(R.string.song_intent)));
        playDuration.setText(intent.getStringExtra(getString(R.string.duration_intent)));

    }

    //performing on click.
    private void setOnclick() {
        backButtonSingleSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        playButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ParticularSong.this, R.string.working, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
