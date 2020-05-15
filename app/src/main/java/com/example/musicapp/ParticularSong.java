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

        playDuration = findViewById(R.id.playDuration);
        singleSongName = findViewById(R.id.singleSongName);
        backButtonSingleSong = findViewById(R.id.backButtonSingleSong);
        playButtons = findViewById(R.id.playButtons);

        setData();
        setOnclick();

    }

    private void setData() {
        Intent intent = getIntent();
        singleSongName.setText(intent.getStringExtra("song"));
        playDuration.setText(intent.getStringExtra("duration"));

    }

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
                Toast.makeText(ParticularSong.this, "Working on this feature", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
