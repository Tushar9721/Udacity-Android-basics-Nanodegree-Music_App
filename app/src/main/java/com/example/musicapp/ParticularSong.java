package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ParticularSong extends AppCompatActivity {

    ImageView backButtonSingleSong;
    LinearLayout playButtons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_particular_song);

        backButtonSingleSong = findViewById(R.id.backButtonSingleSong);
        playButtons = findViewById(R.id.playButtons);

        setOnclick();

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
